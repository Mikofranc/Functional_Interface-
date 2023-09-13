import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {
    public static void main(String[] args) {
        DoubleBinaryOperator  addFunction = Double::sum;
        System.out.println(addFunction.applyAsDouble(3,4));
    }
}
