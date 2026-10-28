public class Barco {
    private final String matricula;
    private final String nombre;
    public Barco(String matricula, String nombre) {
        if (matricula == null || matricula.trim().isEmpty()) throw new IllegalArgumentException("Matricula obligatoria");
        if (nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("Nombre obligatorio");
        this.matricula = matricula.trim();
        this.nombre = nombre.trim();
    }
    public String getMatricula() { return matricula; }
    public String getNombre() { return nombre; }
    @Override public String toString() { return nombre + " (" + matricula + ")"; }
}
