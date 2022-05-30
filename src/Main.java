public class Main {

    public static void main(String[] args) {
        Cliente Aline = new Cliente();
        Aline.setNome("Aline");

        Conta cc = new ContaCorrente(Aline);
        Conta poupanca = new ContaPoubanca(Aline);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}