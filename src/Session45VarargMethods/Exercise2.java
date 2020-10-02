package Session45VarargMethods;

public class Exercise2 {

    void add(int... a) {
        System.out.println("No Of Parameters    :" + a.length);
        System.out.print("Parameters List       :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "\t");//tab space
            System.out.println();
            System.out.println("-----------------------");

        }
    }
}

class Test8 {
    public static void main(String[] args) {
        Exercise2 exe = new Exercise2();
        exe.add();
        exe.add(10);
        exe.add(10, 20);
        exe.add(10, 20, 30);

    }
}


