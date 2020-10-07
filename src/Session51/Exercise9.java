package Session51;

public class Exercise9 {
    int i = m1();

    Exercise9() {
        System.out.println("A-Con");
    }

    int m1() {
        System.out.println("m1-A");
        return 10;
    }
}

class Test10 {
    public static void main(String[] args) {
        Exercise9 ex = new Exercise9();
    }
}
