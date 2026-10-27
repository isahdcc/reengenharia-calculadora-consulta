public class Main {

    public static void main(String[] args) {
        CalculadoraValorConsulta calculadora = new CalculadoraValorConsulta();
        x_Mgr_F legado = new x_Mgr_F();

        System.out.println("=== Caso do enunciado ===");
        double[] procedimentos = {200.0, 100.0};
        double valorNovo = calculadora.calcularValorFinal(TipoConsulta.CONVENIO, procedimentos, true);
        double valorLegado = legado.calc(1, procedimentos, true);
        System.out.println("Novo: " + valorNovo + " | Legado: " + valorLegado
                + " | Iguais? " + (valorNovo == valorLegado));

        System.out.println();
        System.out.println("=== Outros casos ===");
        comparar(calculadora, legado, 1, new double[]{200.0, 100.0}, false);
        comparar(calculadora, legado, 2, new double[]{400.0, 200.0}, false);
        comparar(calculadora, legado, 2, new double[]{200.0, 100.0}, false);
        comparar(calculadora, legado, 3, new double[]{200.0, 100.0}, true);
    }

    private static void comparar(CalculadoraValorConsulta calculadora, x_Mgr_F legado,
                                 int codigoTipo, double[] procedimentos, boolean cobrarTaxa) {
        double valorNovo = calculadora.calcularValorFinal(
                TipoConsulta.deCodigo(codigoTipo), procedimentos, cobrarTaxa);
        double valorLegado = legado.calc(codigoTipo, procedimentos, cobrarTaxa);
        System.out.println("Tipo " + codigoTipo + " | Novo: " + valorNovo
                + " | Legado: " + valorLegado + " | Iguais? " + (valorNovo == valorLegado));
    }
}
