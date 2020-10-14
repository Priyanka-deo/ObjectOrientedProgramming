package Session59;
//Singleton class
public class Exercise26 {
    private static Exercise26 ex = null;

    private Exercise26() {

    }

    static Exercise26 getRef() {
        if (ex == null) {
            ex = new Exercise26();
        }

        return ex;
    }
}

class Client26 {
    public static void main(String[] args) throws Exception {
        Exercise26 ex1 = Exercise26.getRef();
        Exercise26 ex2 = Exercise26.getRef();
        Exercise26 ex3 = Exercise26.getRef();

        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
    }
}
