package Session41;

public interface I {
    int x = 10;

    void m1();

    void m2();

    void m3();
}

class C implements I {
    int j = 20;
    public void m1() {
        System.out.println("m1-Session41.A");
    }

    public void m2() {
        System.out.println("m2-Session41.A");
    }

    public void m3() {
        System.out.println("m3-Session41.A");
    }
}

class Test1 {
    public static void main(String[] args) {
        I i = new C();
        i.m1();
        i.m2();
        i.m3();
        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        System.out.println(i.x);
        System.out.println(I.x);
        System.out.println(c.x);
        System.out.println(C.x);
        System.out.println(c.j);
    }
}