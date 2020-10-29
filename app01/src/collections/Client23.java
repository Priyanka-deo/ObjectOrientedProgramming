package collections;

import java.util.HashSet;

public class Client23 {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("AAA");
        hs1.add("BBB");
        hs1.add("CCC");
        hs1.add("DDD");
        System.out.println(hs1);
        HashSet<String> hs2 = new HashSet<String>();
        System.out.println(hs2.addAll(hs1));
        System.out.println(hs2.addAll(hs1));
    }
}
