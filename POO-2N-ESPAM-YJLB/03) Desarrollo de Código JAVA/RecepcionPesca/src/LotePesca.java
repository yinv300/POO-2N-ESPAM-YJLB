public class LotePesca {
    private final String codigo;
    private final double pesoKg;
    private final double temperaturaC;
    public LotePesca(String codigo, double pesoKg, double temperaturaC) {
        if (codigo == null || codigo.trim().isEmpty()) throw new IllegalArgumentException("Codigo obligatorio");
        if (!Double.isFinite(pesoKg) || pesoKg <= 0) throw new IllegalArgumentException("Peso debe ser mayor a cero");
        if (!Double.isFinite(temperaturaC) || temperaturaC > 4.0) throw new IllegalArgumentException("Temperatura maxima: 4 C");
        this.codigo = codigo.trim();
        this.pesoKg = pesoKg;
        this.temperaturaC = temperaturaC;
    }
    public LotePesca(String codigo, double pesoKg) { this(codigo, pesoKg, 4.0); }
    public String getCodigo() { return codigo; }
    public double getPesoKg() { return pesoKg; }
    public double getTemperaturaC() { return temperaturaC; }
    @Override public String toString() { return codigo + " (" + pesoKg + " kg; " + temperaturaC + " C)"; }
}
