import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomStringTest {
    private static RandomString example = new RandomString();

    @Test
    public void testDefineValues(){
        ArrayList<String> testValues = new ArrayList<>(){};
        testValues.add("Первая строка - 1");
        testValues.add("Вторая строка - 2");
        testValues.add("Третья строка - 3");
        testValues.add("Четвертая строка - 4");
        example.defineValues(testValues);
        assertTrue(example.getVariantsValues().containsAll(testValues));
    }

    @Test
    public void testReturnedRandomStr(){
        String str = example.returnRandomStr();
        assertTrue(example.getVariantsValues().contains(str));
    }
}
