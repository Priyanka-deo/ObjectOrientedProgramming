public class Exercise6 {
    int i = 10;
    int j = 20;
}

class Test8 {
    public static void main(String[] args) {
        Exercise6 ex = new Exercise6();

        for (int i = 10; i <= 10; i++) {
            ex.i = ex.i + 1;
            ex.j = ex.j + 1;
        }
    }

}
