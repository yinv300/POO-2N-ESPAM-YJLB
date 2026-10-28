class Barco:
    def __init__(self, matricula: str, nombre: str):
        if not isinstance(matricula, str) or not matricula.strip():
            raise ValueError("Matricula obligatoria")
        if not isinstance(nombre, str) or not nombre.strip():
            raise ValueError("Nombre obligatorio")
        self._matricula = matricula.strip()
        self._nombre = nombre.strip()
    @property
    def matricula(self): return self._matricula
    @property
    def nombre(self): return self._nombre
    def __str__(self): return f"{self.nombre} ({self.matricula})"
