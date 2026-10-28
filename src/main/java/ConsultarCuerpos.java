import java.util.ArrayList;
import java.util.List;

public class ConsultarCuerpos {

    private final RegistrarCuerpos registrarCuerpos;

    public ConsultarCuerpos(RegistrarCuerpos registrarCuerpos) {
        this.registrarCuerpos = registrarCuerpos;
    }

    //retonar List<String>, poner el sout en el forEach
    public void listarCuerpos(){
       registrarCuerpos.getListaCuerpos()
               .forEach(cuerpoCeleste -> cuerpoCeleste.getDescripcion());
    }

    public List<CuerpoCeleste> planetasAtmosfera(){
        return registrarCuerpos.getListaCuerpos().stream()
                .filter(c -> c.getTipoPlaneta() == TipoPlaneta.PLANETA)
                .filter(c -> ((Planeta) c).isAtmosfera() == true).toList();
    }

    public List<CuerpoCeleste> lunasPlanetaEspecif(String planetaEspecif){
        return registrarCuerpos.getListaCuerpos().stream()
                .filter(c -> c.getTipoPlaneta() == TipoPlaneta.LUNA)
                .filter(c -> ((Luna) c).getPlanetaOrbita().equalsIgnoreCase(planetaEspecif))
                .toList();
    }

    public void imprimir(HabitabilityPrinter printer){

        List<Habitable> habitables = new ArrayList<>();

        registrarCuerpos.getListaCuerpos().forEach(c -> {
            if(c instanceof Habitable) {
                habitables.add((Habitable) c);
                printer.printReport((Habitable)c);
            }
        });
        }
    }

