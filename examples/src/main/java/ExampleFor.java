import java.util.ArrayList;
import java.util.List;

/**
 * Created by marina.rivero on 2/28/18.
 */
public class ExampleFor {


    /**
     *   esta funcion recibe dos listas, una con los nombres y otra con los apellidos
         tenemos que generar una lista resultante que contenta el nombre y el apellido
         ejemplo names = [astrid, marina]
              apellidos = [ecker, rivero]
              resultado = [astrid ecker, marina rivero]

     * @param names
     * @param secondName
     */
    public static void mergeList(List<String> names, List<String> secondName){
        //aca guardamos el nombre completo de cada persona
        List<String> result = new ArrayList<>();


        //imprimimos el resultado
        System.out.print(result);
    }

    /**
     * Dado una lista de numeros (Itegers) la ordenamos de mayor a menor
     * @param ages
     */
    public static void orderList(List<Integer> ages){
        //aca guardamos la lista ordenada
        List<String> result = new ArrayList<>();


        //imprimimos el resultado
        System.out.print(result);
    }
}
