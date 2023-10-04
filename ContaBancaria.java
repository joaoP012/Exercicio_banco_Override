public abstract class ContaBancaria {
    private double saldo = 0.0;

    public abstract void pagarJuros();

    public void cobrarTaxa() {

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

}