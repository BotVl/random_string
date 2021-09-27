import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ArrayList<String> values = new ArrayList<>(){};
        values.add("Первая строка - 1");
        values.add("Вторая строка - 2");
        values.add("Третья строка - 3");
        values.add("Четвертая строка - 4");
        System.out.println(values);

        RandomString example = new RandomString();

        example.defineValues(values);
        System.out.println(example.getVariantsValues());

        example.deleteAll();
        System.out.println(example.getVariantsValues());

        //System.out.println(example.returnRandomStr());
    }
}
