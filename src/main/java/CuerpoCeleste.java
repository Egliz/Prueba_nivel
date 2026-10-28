public abstract class CuerpoCeleste {
    private final String nombre;
    private final double diametro;
    private final double duracionDia;

    public CuerpoCeleste(String nombre, double diametro, double duracionDia) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.duracionDia = duracionDia;
    }

    public abstract String getDescripcion();

    public abstract TipoPlaneta getTipoPlaneta();

    public String getNombre() {
        return nombre;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getDuracionDia() {
        return duracionDia;
    }

    @Override
    public String toString() {
        return "CuerpoCeleste{" +
                "nombre='" + nombre + '\'' +
                ", diametro=" + diametro +
                ", duracionDia=" + duracionDia +
                '}';
    }
}
