import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class LongConsumerSample {
    public static void main(String[] args) {
        LongConsumer i = (l) -> System.out.println(l);;
        i.accept(Long.MAX_VALUE);
    }

}
