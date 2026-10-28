public class Main {
    public static void main(String[] args) {

        Estrella estr1 = new Estrella("Estr1", 7, 6, 67, "E1");
        Estrella estr2 = new Estrella("Estr2", 9, 2, 7, "E2");

        Luna luna1 = new Luna("Lun1", 6, 1, "Tierra", true);
        Luna luna2 = new Luna("Lun2", 9, 3, "Tiereee", false);

        Planeta plan1 = new Planeta("plna1", 5, 7, 6, true);
        Planeta plan2 = new Planeta("plna2", 5, 7, 99, false);

        RegistrarCuerpos registro = new RegistrarCuerpos();

        //anadir cuerpos a la lista
        registro.registarCuerpos(estr1);
        registro.registarCuerpos(estr2);
        registro.registarCuerpos(luna2);
        registro.registarCuerpos(luna1);
        registro.registarCuerpos(plan1);
        registro.registarCuerpos(plan2);

        ConsultarCuerpos consultar = new ConsultarCuerpos(registro);

        //listar descripcion de cada cuepo sin importar tipo
        consultar.listarCuerpos();

        //planetas con atmosfera
        consultar.planetasAtmosfera().forEach(p -> System.out.println(p.getNombre()));

        //lunas que orbitan un planeta especifico
        consultar.lunasPlanetaEspecif("Tierra").forEach(p -> System.out.println(p.getNombre()));
    }
}
