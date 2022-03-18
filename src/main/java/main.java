public class main {

    public static void main (String[] args) {
        Cliente jessica = new Cliente();
        jessica.setNome("Jessica");

        Conta cc = new ContaCorrente(jessica);
        Conta poupanca = new ContaPoupanca(jessica);

        cc.depositar(10000);
        cc.transferir(387.85, poupanca);
        poupanca.sacar(500);
        cc.transferir(400, poupanca);
        poupanca.transferir(100, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}