import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Recepcion {
    private final String numero;
    private final Barco barco;
    private final List<LotePesca> lotes = new ArrayList<>();
    public Recepcion(String numero, Barco barco) {
        if (numero == null || numero.trim().isEmpty()) throw new IllegalArgumentException("Numero de recepcion obligatorio");
        if (barco == null) throw new IllegalArgumentException("Barco obligatorio");
        this.numero = numero.trim();
        this.barco = barco;
    }
    public Recepcion(Barco barco) { this("REC-001", barco); }
    public void agregarLote(LotePesca lote) {
        if (lote == null) throw new IllegalArgumentException("Lote obligatorio");
        for (LotePesca existente : lotes) {
            if (existente.getCodigo().equals(lote.getCodigo())) throw new IllegalArgumentException("Codigo de lote duplicado");
        }
        lotes.add(lote);
    }
    public double pesoTotalKg() {
        double total = 0;
        for (LotePesca lote : lotes) total += lote.getPesoKg();
        return total;
    }
    public int cantidadLotes() { return lotes.size(); }
    public String getNumero() { return numero; }
    public Barco getBarco() { return barco; }
    public List<LotePesca> getLotes() { return Collections.unmodifiableList(lotes); }
}
