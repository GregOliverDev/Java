import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    // Instância única do Singleton
    private static AccountManager instance;
    // Mapeamento das contas com saldo para cada cliente
    private Map<String, Double> contas;

    // Construtor privado para evitar múltiplas instâncias
    private AccountManager() {
        contas = new HashMap<>();
    }

    // Método para obter a instância Singleton de AccountManager
    public static synchronized AccountManager getInstance() {
        if (instance == null) {
            instance = new AccountManager();
        }
        return instance;
    }

    // Método para criar uma conta com saldo inicial para um cliente
    public void criarConta(String contaId, double saldoInicial) {
        if (!contas.containsKey(contaId)) {
            contas.put(contaId, saldoInicial);
            System.out.println("Conta criada para " + contaId + " com saldo inicial: " + saldoInicial);
        } else {
            System.out.println("Conta já existente para " + contaId);
        }
    }

    // Método para depositar valor em uma conta específica
    public void depositar(String contaId, double valor) {
        if (contas.containsKey(contaId)) {
            contas.put(contaId, contas.get(contaId) + valor);
            System.out.println("Depósito de " + valor + " na conta " + contaId);
        } else {
            System.out.println("Conta " + contaId + " não encontrada.");
        }
    }

    // Método para sacar valor de uma conta específica
    public void sacar(String contaId, double valor) {
        if (contas.containsKey(contaId)) {
            double saldoAtual = contas.get(contaId);
            if (saldoAtual >= valor) {
                contas.put(contaId, saldoAtual - valor);
                System.out.println("Saque de " + valor + " da conta " + contaId);
            } else {
                System.out.println("Saldo insuficiente na conta " + contaId);
            }
        } else {
            System.out.println("Conta " + contaId + " não encontrada.");
        }
    }

    // Método para ver o saldo de uma conta específica
    public double verSaldo(String contaId) {
        return contas.getOrDefault(contaId, 0.0);
    }

    // Método para listar todas as contas ativas
    public void listarContasAtivas() {
        System.out.println("Contas ativas:");
        for (Map.Entry<String, Double> entry : contas.entrySet()) {
            System.out.println("Conta: " + entry.getKey() + ", Saldo: " + entry.getValue());
        }
    }
}
