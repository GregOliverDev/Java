public class Cliente {
    private String clienteId;
    private String nome;

    // Construtor do cliente
    public Cliente(String clienteId, String nome) {
        this.clienteId = clienteId;
        this.nome = nome;
        // Criação da conta no AccountManager
        AccountManager.getInstance().criarConta(clienteId, 0.0); // Saldo inicial zero
    }

    // Método para depositar na conta do cliente
    public void depositar(double valor) {
        AccountManager.getInstance().depositar(clienteId, valor);
    }

    // Método para sacar da conta do cliente
    public void sacar(double valor) {
        AccountManager.getInstance().sacar(clienteId, valor);
    }

    // Método para ver o saldo do cliente
    public double verSaldo() {
        return AccountManager.getInstance().verSaldo(clienteId);
    }

    public String getNome() {
        return nome;
    }

    public String getClienteId() {
        return clienteId;
    }
}
