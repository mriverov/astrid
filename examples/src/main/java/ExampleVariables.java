/**
 * Created by mrivero on 27/11/17.
 */
public class ExampleVariables {

    public void sumValues(Integer oneValue, Integer otherValue){
        Integer result = oneValue + otherValue;

        System.out.println(result);


    }

    public void getLess(Integer oneValue, Integer otherValue){
        Integer result2 = oneValue - otherValue;

        System.out.println(result2);

    }

    public void getGreater(Integer oneValue, Integer otherValue){
        Integer greater = null;
        if (oneValue > otherValue){
            greater =oneValue;
        }else{
            greater =otherValue;
        }
        System.out.println(greater);

    }

    public void getAverage(Integer oneValue, Integer otherValue){
        //System.out.println();

    }

    public void getNext(Integer oneValue){
        //System.out.println();

    }

    public void getPrevious(Integer oneValue){
        //System.out.println();

    }


    public static void main(String[] args) {

        ExampleVariables astrid = new ExampleVariables();
        astrid.sumValues(6,7);
    }
}
