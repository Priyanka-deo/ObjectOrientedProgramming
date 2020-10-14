package Session59;
// not singletone class
public class Exercise25 {

    private Exercise25() {

    }

    static Exercise25 getRef() {

        Exercise25 ex = new Exercise25();
        return ex;
    }
}

class Client25 {
    public static void main(String[] args) throws Exception {
        Exercise25 ex1 = Exercise25.getRef();
        Exercise25 ex2 = Exercise25.getRef();
        Exercise25 ex3 = Exercise25.getRef();
        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);

    }

}
