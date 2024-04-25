import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        // Criar e operar contas para o primeiro cliente
        Cliente clt1 = new Cliente();
        clt1.setNome("Alexandre");
        operarContas(clt1, 150, 100);

        // Criar e operar contas para o segundo cliente
        Cliente clt2 = new Cliente();
        clt2.setNome("Maria");
        operarContas(clt2, 200, 50);
    }

    public static void operarContas(Cliente cliente, double depositoInicialCC, double transferenciaCCtoPoupanca) {
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(depositoInicialCC);
        cc.transferir(transferenciaCCtoPoupanca, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
