public class Luna extends CuerpoCeleste implements Habitable{

    private final String planetaOrbita;
    private final boolean superRocosa;

    public Luna(String nombre, double diametro, double duracionDia, String planetaOrbita, boolean superRocosa) {
        super(nombre, diametro, duracionDia);
        this.planetaOrbita = planetaOrbita;
        this.superRocosa = superRocosa;
    }

    @Override
    public String getDescripcion() {
        if(superRocosa != false ) {
            return "La " + getTipoPlaneta() + " orbita alrededor de la" + planetaOrbita +
                    ". Su superficie es rocosa y su diámetro es de " + getDiametro() + " km.";
        } else {
            return "La " + getTipoPlaneta() + " orbita alrededor de la" + planetaOrbita +
                    ". Su superficie no es rocosa y su diámetro es de " + getDiametro() + " km.";
        }
    }

    public String getHabitabilityReport(){
        return toString() + "ES HABITABLE.";
    }

    @Override
    public TipoPlaneta getTipoPlaneta() {
        return TipoPlaneta.LUNA;
    }

    public boolean isSuperRocosa() {
        return superRocosa;
    }

    public String getPlanetaOrbita() {
        return planetaOrbita;
    }

    @Override
    public String toString() {
        return super.toString() + "Luna{" +
                "planetaOrbita='" + planetaOrbita + '\'' +
                ", superRocosa=" + superRocosa +
                '}';
    }
}
