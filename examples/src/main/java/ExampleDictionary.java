import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mrivero on 27/11/17.
 */
public class ExampleDictionary {

    Map<String, String> cities = new HashMap<>();

    public ExampleDictionary() {
        this.cities.put("Buenos Aires", "La Plata");
        this.cities.put("Chaco", "Resistencia");
        this.cities.put("Chubut", "Rawson");
        this.cities.put("Córdoba", "Córdoba");
        this.cities.put("Corrientes", "Corrientes");
        this.cities.put("Entre Ríos", "Paraná");
        this.cities.put("Formosa", "La Plata");
        this.cities.put("Misiones", "Formosa");

    }

    public void getCity(){
        String result = null;

        System.out.println(result);
    }

    // como hacemos para que dado cualquier provincia le devuelva su capital?
    public void getCityFor(){
        String result = null;

        System.out.println(result);
    }

}
