package Session51;

public class Exercise11 {
    int m1() {
        System.out.println("m1-A");
        return 10;
    }

    {
        System.out.println("IB-A");
    }

    int i = m1();

    Exercise11() {
        System.out.println("A-Con");
    }
}

class Test14 {
    public static void main(String[] args) {
        Exercise11 ex1 = new Exercise11();
        System.out.println();
        Exercise11 ex2 = new Exercise11();
        System.out.println();
        Exercise11 ex3 = new Exercise11();
    }
}
