package Session52and53;

public class Exercise14 {
    Exercise14 getRef1() {
        Exercise14 ex = new Exercise14();
        return ex;
    }

    Exercise14 getRef2() {
        return this;
    }
}

class Test17 {
    public static void main(String[] args) {
        Exercise14 ex = new Exercise14();
        System.out.println(ex);
        System.out.println();
        System.out.println(ex.getRef1());
        System.out.println(ex.getRef1());
        System.out.println(ex.getRef1());
        System.out.println();
        System.out.println(ex.getRef2());
        System.out.println(ex.getRef2());
        System.out.println(ex.getRef2());


    }
}