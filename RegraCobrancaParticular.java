public class RegraCobrancaParticular implements RegraCobranca {

    private static final double PERCENTUAL_DESCONTO_PARTICULAR = 0.05;
    private static final double VALOR_MINIMO_PARA_DESCONTO = 500.0;

    @Override
    public double aplicar(double valorTotal) {
        if (valorTotal > VALOR_MINIMO_PARA_DESCONTO) {
            return valorTotal - (valorTotal * PERCENTUAL_DESCONTO_PARTICULAR);
        }
        return valorTotal;
    }
}
