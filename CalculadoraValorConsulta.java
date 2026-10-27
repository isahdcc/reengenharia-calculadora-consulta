public class CalculadoraValorConsulta {

    private final SomadorProcedimentos somador = new SomadorProcedimentos();
    private final FabricaRegraCobranca fabricaRegras = new FabricaRegraCobranca();

    public double calcularValorFinal(TipoConsulta tipoConsulta,
                                     double[] procedimentosRealizados,
                                     boolean cobrarTaxaAdicional) {
        double valorTotal = somador.somar(procedimentosRealizados);
        RegraCobranca regra = fabricaRegras.criar(tipoConsulta, cobrarTaxaAdicional);
        return regra.aplicar(valorTotal);
    }
}
