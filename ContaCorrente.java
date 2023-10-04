public class ContaCorrente extends ContaBancaria {

   @Override
   public void pagarJuros() {
      // conta corrente nao paga juros
   }

   @Override
   public void cobrarTaxa() {
      double novoSaldo = getSaldo() - 0.4;
      setSaldo(novoSaldo);
   }
}
