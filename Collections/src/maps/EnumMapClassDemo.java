package maps;

// EnumMap Class - key must be the enum type
// Constructors:
// EnumMap()
// EnumMap(Map<K,? extends V> m)
// EnumMap(EnumpMap<K,? extends V> em)

import java.util.EnumMap;

enum MyEnum {
    ONE, TWO, THREE, FOUR, FIVE

}

public class EnumMapClassDemo {

    public static void main(String[] args) {

        EnumMap<MyEnum, String> em = new EnumMap<MyEnum, String>(MyEnum.class);
        em.put(MyEnum.ONE, "Test1");
        em.put(MyEnum.TWO, "Test2");
        em.put(MyEnum.THREE, "Test3");
        em.put(MyEnum.FOUR, "Test4");
        em.put(MyEnum.FIVE, "Test5");

        System.out.println(em);

    }

}
