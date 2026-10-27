public class SomadorProcedimentos {

    public double somar(double[] procedimentosRealizados) {
        double soma = 0;
        for (double valorProcedimento : procedimentosRealizados) {
            soma += valorProcedimento;
        }
        return soma;
    }
}
