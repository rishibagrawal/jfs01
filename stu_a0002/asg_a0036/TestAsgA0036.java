import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0036{
    @Test
        public void test_01() {
            AsgA0036 obj  = new AsgA0036();
            double temp = obj.convert_farenheit_to_celcius(68);
            assertEquals(temp, 20);
        }
    @Test
        public void test_02() {
            AsgA0036 obj = new AsgA0036();
            double temp = obj.convert_farenheit_to_celcius(-68);
            assertEquals(temp,-55.56);
        }

    @Test
        public void test_03() {
            AsgA0036 obj = new AsgA0036();
            double temp = obj.convert_farenheit_to_celcius(0);
            assertEquals(temp, -17.68);
        }
    
    @Test
        public void test_04() {
            AsgA0036 obj = new AsgA0036();
            double temp = obj.convert_farenheit_to_celcius(32);
            assertEquals(temp, 0);
        }
}
