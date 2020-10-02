package Session45VarargMethods;

public class Exercise1 {
    void add(int... a) {
        System.out.println("Var-Arg Method");
    }

}

class Test7 {
    public static void main(String[] args) {
        Exercise1 exe = new Exercise1();
        exe.add();
        exe.add(10);
        exe.add(10, 20);
        exe.add(10, 20, 30);

    }
}

