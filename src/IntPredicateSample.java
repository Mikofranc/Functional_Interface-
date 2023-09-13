import java.util.function.IntPredicate;

public class IntPredicateSample {
    public static void main(String[] args) {
        IntPredicate evenNo =(input)-> input % 2 ==0;
        System.out.println(evenNo.test(10));
    }
}
