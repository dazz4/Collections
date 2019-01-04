package lists;
import java.util.EnumSet;


// EnumSet Class - extends AbstractSet and implements Set
// Specifically used to the elements of type enum

// class EnumSet<E extends Enum<E>> - E has to extend Enum
// No constructors and it's using a factory methods to create objects

enum MyEnum {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

    int n;

    MyEnum(int number) {
        n = number;
    }

    int getN() {
        return this.n;
    }
}

public class EnumSetDemo {

    public static void main(String[] args) {

        MyEnum mE = MyEnum.ONE; // create a reference to object in the enum
        EnumSet es = EnumSet.of(MyEnum.ONE, MyEnum.TWO, MyEnum.THREE, MyEnum.FOUR); // you can't instantiate EnumSet as it has no constructor
        System.out.println("es = " + es);
        es.add(MyEnum.FIVE); // add another element from MyEnum into EnumSet
        System.out.println("Adding FIVE = " + es);
        es.add(MyEnum.ONE); // you can't add duplicates!
        System.out.println("Added another FIVE but there is no duplicates = " + es);

    }
    
}
