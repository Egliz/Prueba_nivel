public class Planeta extends CuerpoCeleste implements Habitable{

    private final int noLunas;
    private final boolean atmosfera;

    public Planeta(String nombre, double diametro, double duracionDia, int noLunas, boolean atmosfera) {
        super(nombre, diametro, duracionDia);
        this.noLunas = noLunas;
        this.atmosfera = atmosfera;
    }

    @Override
    public String getDescripcion() {

        if (atmosfera != false) {
            return getNombre() + " tiene un diámetro de " + getDiametro() + " km y posee una atmósfera. Cuenta con" + noLunas + " luna.”";
        } else {
            return getNombre() + " tiene un diámetro de " + getDiametro() + " km y no posee atmósfera. Cuenta con" + noLunas + " luna.”";
        }
    }

    public String getHabitabilityReport(){
        return toString() + "ES HABITABLE.";
    }

    @Override
    public TipoPlaneta getTipoPlaneta() {
        return TipoPlaneta.PLANETA;
    }

    public int getNoLunas() {
        return noLunas;
    }

    public boolean isAtmosfera() {
        return atmosfera;
    }

    @Override
    public String toString() {
        return super.toString() + "Planeta{" +
                "noLunas=" + noLunas +
                ", atmosfera=" + atmosfera +
                '}';
    }
}
