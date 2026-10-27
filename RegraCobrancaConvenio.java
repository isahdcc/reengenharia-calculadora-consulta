public class RegraCobrancaConvenio implements RegraCobranca {

    private static final double PERCENTUAL_DESCONTO_CONVENIO = 0.12;
    private static final double VALOR_TAXA_ADICIONAL = 15.50;

    private final boolean cobrarTaxaAdicional;

    public RegraCobrancaConvenio(boolean cobrarTaxaAdicional) {
        this.cobrarTaxaAdicional = cobrarTaxaAdicional;
    }

    @Override
    public double aplicar(double valorTotal) {
        double valorComDesconto = valorTotal - (valorTotal * PERCENTUAL_DESCONTO_CONVENIO);
        if (cobrarTaxaAdicional) {
            valorComDesconto += VALOR_TAXA_ADICIONAL;
        }
        return valorComDesconto;
    }
}
