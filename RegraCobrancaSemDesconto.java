public class RegraCobrancaSemDesconto implements RegraCobranca {

    @Override
    public double aplicar(double valorTotal) {
        return valorTotal;
    }
}
