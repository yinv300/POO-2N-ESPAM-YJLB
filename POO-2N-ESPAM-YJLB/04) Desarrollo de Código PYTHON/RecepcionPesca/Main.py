from Barco import Barco
from LotePesca import LotePesca
from Recepcion import Recepcion
def main():
    barco = Barco("EC-123", "Pacifico")
    recepcion = Recepcion(barco, "REC-101")
    recepcion.agregar_lote(LotePesca("AT-01", 1250, 2.5))
    recepcion.agregar_lote(LotePesca("AT-02", 750))
    print(f"Recepcion: {recepcion.numero}")
    print(f"Barco: {recepcion.barco}")
    print(f"Lotes registrados: {recepcion.cantidad_lotes()}")
    print(f"Peso total (kg): {recepcion.peso_total_kg()}")
    for i, caso in enumerate((lambda: LotePesca("AT-03", -5, 3),
                 lambda: LotePesca("AT-04", 100, 7),
                 lambda: recepcion.agregar_lote(LotePesca("AT-01", 100, 2)))):
        try: caso()
        except ValueError as e:
            prefijo = ["Validacion peso", "Validacion temperatura", "Validacion duplicado"][i]
            print(f"{prefijo}: {e}")
if __name__ == "__main__":
    main()
