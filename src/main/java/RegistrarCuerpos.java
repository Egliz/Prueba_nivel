import java.util.ArrayList;
import java.util.List;

public class RegistrarCuerpos {

    private List<CuerpoCeleste> listaCuerpos = new ArrayList<>();

    public void registarCuerpos(CuerpoCeleste cuerpoCeleste){
        listaCuerpos.add(cuerpoCeleste);
    }

    public List<CuerpoCeleste> getListaCuerpos(){
        return listaCuerpos;
    }
}
