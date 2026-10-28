public class Estrella extends CuerpoCeleste{

    private final double tempEspecifica;
    private final String tipoEspectral;

    public Estrella(String nombre, double diametro, double duracionDia, double tempEspecifica, String tipoEspectral) {
        super(nombre, diametro, duracionDia);
        this.tempEspecifica = tempEspecifica;
        this.tipoEspectral = tipoEspectral;
    }

    @Override
    public String getDescripcion() {
        return "El" + getNombre() + " es una " + getTipoPlaneta() + " tipo " + tipoEspectral + " con una temperatura " +
                "superficial de " + tempEspecifica + " K. Es la fuente principal de energía del sistema solar.";
    }

    @Override
    public TipoPlaneta getTipoPlaneta() {
        return TipoPlaneta.ESTRELLA;
    }
}
