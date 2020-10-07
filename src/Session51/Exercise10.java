package Session51;

public class Exercise10 {
    Exercise10() {
        System.out.println("A-Con");
    }

    {
        System.out.println("IB-A");
    }

    int i = m1();

    int m1() {
        System.out.println("m1-A");
        return 10;
    }
}

class Test12 {
    public static void main(String[] args) {
        Exercise10 ex = new Exercise10();
    }
}
