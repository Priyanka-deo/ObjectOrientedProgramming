package Session59;

public class Exercise24 {
    private Exercise24() {
        System.out.println("A-Con");
    }

    static Exercise24 getRef() {
        Exercise24 ex = new Exercise24();
        return ex;
    }

    void m1() {
        System.out.println("m1-A");
    }
}

class Client24 {
    public static void main(String[] args) {
        Exercise24 ex = Exercise24.getRef();
        ex.m1();
    }
}
