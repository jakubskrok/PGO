import java.math.BigDecimal;
import java.util.ArrayList;

public class Adder {

        public int add(int a, int b) {
            return a+b;
        }

        public static BigDecimal add (ArrayList<BigDecimal> arrayListB) {
            BigDecimal product = BigDecimal.valueOf(0.00);
            for(int i = 0; i < arrayListB.size(); i++){
                product = product.add(arrayListB.get(i));
            }
            return product;
        }
}
