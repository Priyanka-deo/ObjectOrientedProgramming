package collections;


import java.util.ArrayList;

public class Client25 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("AAA");
        al.add("BBB");
        al.add("CCC");
        al.add("DDD");
        al.add("EEE");
        System.out.println(al);
        System.out.println(al.remove("BBB"));
        System.out.println(al);
        System.out.println(al.remove("ZZZ"));
        System.out.println(al);
    }

}
