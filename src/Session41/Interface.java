package Session41;

  public abstract class Interface I {
    int x = 20;

   public abstract void m1();

    public abstract void m2();

     public abstract void m3();
}

class A implements I {
    public void m1() {
        System.out.println("m1-A");
    }

    public void m2() {
        System.out.println("m2-A");
    }

    public void m3() {
        System.out.println("m3-A");
    }

    public void m4() {
        System.out.println("m4-A");
    }
}

class Test {
    public static void main(String[] args) {
        I i = new A();
        System.out.println("I.x");
        System.out.println("i.x");
        i.m1();
        i.m2();
        i.m3();
        A a = new A();
        System.out.println("a.x");
        System.out.println("A.x");
        a.m1();
        a.m2();
        a.m3();
        a.m4();

    }
}

}
