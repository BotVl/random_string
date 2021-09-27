import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class RandomString{
    private static List<String> variantsValues = new ArrayList<>();

    public RandomString() {
    }

    public RandomString(ArrayList<String> variantsValues) {
        this.variantsValues = variantsValues;
    }

    public List<String> getVariantsValues() {
        return variantsValues;
    }

    public boolean defineValues(List<String> values){
        return variantsValues.addAll(values);
    }

    public boolean add(String value){
        return variantsValues.add(value);
    }

    public boolean deleteAll(){
        variantsValues.clear();
        return variantsValues.isEmpty();
    }

    public String returnRandomStr(){
        Random random = new Random();
        int index= random.nextInt(variantsValues.size());
        return variantsValues.get(index);
    }
}
