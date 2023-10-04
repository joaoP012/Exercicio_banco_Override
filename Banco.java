public class Banco {
    public static void main(String[] args) {
        ContaBancaria[] contas = new ContaBancaria[10];
        contas[0] = new ContaCorrente();
        contas[0].setSaldo(1100.0);

        contas[1] = new ContaSalario();
        contas[1].setSaldo(500.0);

        contas[2] = new ContaPoupanca();
        contas[2].setSaldo(12.0);

        contas[3] = new ContaCorrente();
        contas[3].setSaldo(12000.0);

        contas[4] = new ContaSalario();
        contas[4].setSaldo(24500.0);

        contas[5] = new ContaPoupanca();
        contas[5].setSaldo(50000.0);

        contas[6] = new ContaCorrente();
        contas[6].setSaldo(1245.0);

        contas[7] = new ContaSalario();
        contas[7].setSaldo(960.0);

        contas[8] = new ContaPoupanca();
        contas[8].setSaldo(2008.0);

        contas[9] = new ContaSalario();
        contas[9].setSaldo(2005.0);

        double saldoGeral = 0.0;

        double saldoPosPeriodo = 0.0;

        for (ContaBancaria c : contas) {
            saldoGeral += c.getSaldo();
            c.cobrarTaxa();
            c.pagarJuros();
            saldoPosPeriodo += c.getSaldo();
        }
        System.out.println("Saldo geral: R$" + saldoGeral);
        System.out.println("Saldo pós apuração: R$" + saldoPosPeriodo);

    }
}
