public class Main {
    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno"); // Insira o nome do cliente aqui

        Conta cc = new ContaCorrente(bruno);
        Conta poupanca = new ContaPoupanca(bruno);

        cc.depositar(300);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
