import java.util.function.IntFunction;

public class IntFunctionSample {
    public static void main(String[] args) {
        IntFunction<String> function = input ->{ if(input >=0){
            return "input is positive";
        }return "input is negative";};

        System.out.println(function.apply(-1));
    }
}
