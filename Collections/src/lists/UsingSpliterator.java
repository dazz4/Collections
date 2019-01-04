package lists;

// Using Spliterator

// Additional subinterfaces to deal with primitivte types:
// Spliterator.OfDouble, Spliterator.OfInt, Spliterator.OfPrimitivte()

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class UsingSpliterator {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("ONE");
        al.add("TWO");
        al.add("THREE");
        al.add("FOUR");
        al.add("FIVE");

        Spliterator split = al.spliterator();

        // Use tryAdvance() - it combines hasNext() and next().
        // split.tryAdvance(Consumer action);

        // Using Consumer (functional interface) while overriding his method (without lambda).

        Consumer<String> consumer = new Consumer<>() {

            @Override
            public void accept(String s) {
                System.out.format(s);
            }
        };

        while (split.tryAdvance(consumer)) System.out.println();;
        System.out.println();

        // Consumer is a functional interface with method action() and that's why we can use lambda.

        split = al.spliterator();
        while(split.tryAdvance((n) -> System.out.println(n))); // use of lambda
        System.out.println();

        // For each remaining
        split = al.spliterator();
        split.forEachRemaining((n) -> System.out.println(n)); // use of forEachRemaining, you don't even have to use while
        System.out.println();

    }

}
