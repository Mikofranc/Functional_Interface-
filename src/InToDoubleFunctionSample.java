import java.util.function.IntToDoubleFunction;

public class InToDoubleFunctionSample {
    public static void main(String[] args) {
        IntToDoubleFunction function = (money) -> money;
        System.out.println(function.applyAsDouble(20));
    }

}
