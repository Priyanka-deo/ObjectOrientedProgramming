package Session51;

public class Exercise7 {
    int i = 10;
    static int j = 20;

    static void m1() {
        System.out.println();
        System.out.println(j);
    }
}

class Test8 {
    public static void main(String[] args) {

        Exercise7 ex = new Exercise7();
        ex.m1();
    }
}

