from Barco import Barco
from LotePesca import LotePesca
class Recepcion:
    def __init__(self, barco: Barco, numero: str = "REC-001"):
        if not isinstance(numero, str) or not numero.strip():
            raise ValueError("Numero de recepcion obligatorio")
        if not isinstance(barco, Barco):
            raise ValueError("Barco obligatorio")
        self._numero = numero.strip()
        self._barco = barco
        self._lotes = []
    def agregar_lote(self, lote: LotePesca):
        if not isinstance(lote, LotePesca): raise ValueError("Lote obligatorio")
        if any(x.codigo == lote.codigo for x in self._lotes):
            raise ValueError("Codigo de lote duplicado")
        self._lotes.append(lote)
    @property
    def numero(self): return self._numero
    @property
    def barco(self): return self._barco
    @property
    def lotes(self): return tuple(self._lotes)
    def cantidad_lotes(self): return len(self._lotes)
    def peso_total_kg(self): return sum(x.peso_kg for x in self._lotes)
