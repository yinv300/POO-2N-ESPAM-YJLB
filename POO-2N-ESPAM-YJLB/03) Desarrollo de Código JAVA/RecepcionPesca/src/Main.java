public class Main {
    public static void main(String[] args) {
        Barco barco = new Barco("EC-123", "Pacifico");
        Recepcion recepcion = new Recepcion("REC-101", barco);
        recepcion.agregarLote(new LotePesca("AT-01", 1250, 2.5));
        recepcion.agregarLote(new LotePesca("AT-02", 750)); // Constructor sobrecargado
        System.out.println("Recepcion: " + recepcion.getNumero());
        System.out.println("Barco: " + recepcion.getBarco());
        System.out.println("Lotes registrados: " + recepcion.cantidadLotes());
        System.out.println("Peso total (kg): " + recepcion.pesoTotalKg());
        try { recepcion.agregarLote(new LotePesca("AT-03", -5, 3)); }
        catch (IllegalArgumentException e) { System.out.println("Validacion peso: " + e.getMessage()); }
        try { recepcion.agregarLote(new LotePesca("AT-04", 100, 7)); }
        catch (IllegalArgumentException e) { System.out.println("Validacion temperatura: " + e.getMessage()); }
        try { recepcion.agregarLote(new LotePesca("AT-01", 100, 2)); }
        catch (IllegalArgumentException e) { System.out.println("Validacion duplicado: " + e.getMessage()); }
    }
}
