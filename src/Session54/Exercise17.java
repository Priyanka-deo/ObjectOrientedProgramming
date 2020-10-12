package Session54;

public class Exercise17 {
    int i = 10;
    static int j = 10;
}

class Test19 {
    public static void main(String[] args) {
        Exercise17 ex1 = new Exercise17();
        System.out.println(ex1.i + "  " + ex1.j);
        ex1.i = ex1.i + 1;
        ex1.j = ex1.j + 1;
        System.out.println(ex1.i + "  " + ex1.j);

        Exercise17 ex2 = new Exercise17();
        System.out.println(ex2.i + "  " + ex2.j);
        ex2.i = ex2.i + 1;
        ex2.j = ex2.j + 1;
        System.out.println(ex1.i + "  " + ex1.j);
        System.out.println(ex2.i + "  " + ex2.j);


        Exercise17 ex3 = new Exercise17();
        System.out.println(ex3.i + "  " + ex3.j);
        ex3.i = ex3.i + 1;
        ex3.j = ex3.j + 1;
        System.out.println(ex1.i + "  " + ex1.j);
        System.out.println(ex2.i + "  " + ex2.j);
        System.out.println(ex3.i + "  " + ex3.j);


    }
}
