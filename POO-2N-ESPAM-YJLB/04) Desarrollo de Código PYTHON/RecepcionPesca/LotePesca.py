import math
class LotePesca:
    def __init__(self, codigo: str, peso_kg: float, temperatura_c: float = 4.0):
        if not isinstance(codigo, str) or not codigo.strip():
            raise ValueError("Codigo obligatorio")
        if isinstance(peso_kg, bool) or not isinstance(peso_kg, (int,float)) or not math.isfinite(peso_kg) or peso_kg <= 0:
            raise ValueError("Peso debe ser mayor a cero")
        if isinstance(temperatura_c, bool) or not isinstance(temperatura_c, (int,float)) or not math.isfinite(temperatura_c) or temperatura_c > 4.0:
            raise ValueError("Temperatura maxima: 4 C")
        self._codigo = codigo.strip()
        self._peso_kg = float(peso_kg)
        self._temperatura_c = float(temperatura_c)
    @property
    def codigo(self): return self._codigo
    @property
    def peso_kg(self): return self._peso_kg
    @property
    def temperatura_c(self): return self._temperatura_c
