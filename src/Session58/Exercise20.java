package Session58;

public class Exercise20 {
    static int m1() {
        System.out.println("Static Method-A");
        return 10;
    }

    static {
        System.out.println("Static box-A");
    }

    static int i = m1();
}

class Test20 {
    public static void main(String[] args) {
        Exercise20 ex = new Exercise20();
    }
}

