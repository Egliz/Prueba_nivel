import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CuerposCelesteTest {

    @Test
    public void planetaConAtmosfera(){
        Planeta plan1 = new Planeta("plna1", 5, 7, 6, true);
        Planeta plan2 = new Planeta("plna2", 5, 7, 99, false);

        RegistrarCuerpos registrar = new RegistrarCuerpos();
        registrar.registarCuerpos(plan1);
        registrar.registarCuerpos(plan2);

        ConsultarCuerpos consultar = new ConsultarCuerpos(registrar);

        List<CuerpoCeleste> resultado = consultar.planetasAtmosfera();

        assertEquals(1, resultado.size());

        //comparar listas, lista esperada con lista que retorna
    }

    @Test
    public void lunaOrbitaPlanetaEspecifico(){
        Luna luna1 = new Luna("Lun1", 6, 1, "Tierra", true);
        Luna luna2 = new Luna("Lun2", 9, 3, "Tiereee", false);

        RegistrarCuerpos registrar = new RegistrarCuerpos();
        registrar.registarCuerpos(luna1);
        registrar.registarCuerpos(luna2);

        ConsultarCuerpos consultar = new ConsultarCuerpos(registrar);


        List<CuerpoCeleste> resultado =  consultar.lunasPlanetaEspecif("Tierra");

        assertEquals(1, resultado.size());

    }

    @Test
    public void descripcionContiene(){
        Luna luna1 = new Luna("Lun1", 6, 1, "Tierra", true);

        String resultado = luna1.getDescripcion();

        assertTrue(resultado.contains("Tierra"));
    }

    @Test public void listaContiene(){
        Planeta plan1 = new Planeta("plna1", 5, 7, 6, true);
        Planeta plan2 = new Planeta("plna2", 5, 7, 99, false);

        RegistrarCuerpos registrar = new RegistrarCuerpos();
        registrar.registarCuerpos(plan1);
        registrar.registarCuerpos(plan2);

        List<CuerpoCeleste> listaCuerpos = registrar.getListaCuerpos();
        assertTrue(listaCuerpos.contains(plan1));
    }

    @Test
    public void habitability(){

        Habitable lunaHaitable = new Luna("Lun1", 6, 1, "Tierra", true);
        String lunaReport = lunaHaitable.getHabitabilityReport();

        assertTrue(lunaReport.contains("HABITABLE"));

    }


}
