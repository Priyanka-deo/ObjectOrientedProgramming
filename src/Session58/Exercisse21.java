package Session58;

public class Exercisse21 {
    static {
        System.out.println("SB1 - A");
    }

    static int i = m1();

    static int m1() {
        System.out.println("m1 - A");
        return 10;
    }

    static {
        System.out.println("SB2 - A");
    }

    static int j = m2();

    static int m2() {
        System.out.println("m2 - A");
        return 20;
    }

}

class Client21 {
    public static void main(String[] args) {
        Exercisse21 ex1 = new Exercisse21();
        Exercisse21 ex2 = new Exercisse21();
    }
}
