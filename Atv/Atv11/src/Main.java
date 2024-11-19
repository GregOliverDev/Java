public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("001", "Alice");
        Cliente cliente2 = new Cliente("002", "Bob");

        // Operações de depósito e saque
        cliente1.depositar(1000);
        cliente2.depositar(500);

        cliente1.sacar(300);
        cliente2.sacar(700); // Deve exibir saldo insuficiente

        // Exibir saldos
        System.out.println("Saldo de Alice: " + cliente1.verSaldo());
        System.out.println("Saldo de Bob: " + cliente2.verSaldo());

        // Verificar que ambos compartilham a mesma instância do AccountManager
        AccountManager manager1 = AccountManager.getInstance();
        AccountManager manager2 = AccountManager.getInstance();
        
        System.out.println("Manager1 e Manager2 são a mesma instância? " + (manager1 == manager2));

        // Listar todas as contas ativas
        manager1.listarContasAtivas();
    }
}
