public class FabricaRegraCobranca {

    public RegraCobranca criar(TipoConsulta tipoConsulta, boolean cobrarTaxaAdicional) {
        switch (tipoConsulta) {
            case CONVENIO:
                return new RegraCobrancaConvenio(cobrarTaxaAdicional);
            case PARTICULAR:
                return new RegraCobrancaParticular();
            default:
                return new RegraCobrancaSemDesconto();
        }
    }
}
