public enum TipoConsulta {
    CONVENIO(1),
    PARTICULAR(2),
    OUTRO(0);

    private final int codigo;

    TipoConsulta(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static TipoConsulta deCodigo(int codigo) {
        for (TipoConsulta tipo : values()) {
            if (tipo.codigo == codigo) {
                return tipo;
            }
        }
        return OUTRO;
    }
}
