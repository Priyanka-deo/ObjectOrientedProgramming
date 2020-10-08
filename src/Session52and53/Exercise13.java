package Session52and53;

public class Exercise13 {
    Exercise13() {
        System.out.println("Ex-Constructor");
    }

    Exercise13(int i) {
        System.out.println("Ex-int-param-constructor");
    }

    void m1() {
        System.out.println("m1-Ex");
    }
}

class Test16 {
    public static void main(String[] args) {
        Exercise13 ex = new Exercise13();
        ex.m1();
    }
}
