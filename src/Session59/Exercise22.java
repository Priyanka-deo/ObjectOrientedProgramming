package Session59;

// load class bite code without creating object (class.forName method)
public class Exercise22 {
    static {
        System.out.println("Class Loading.....");
    }

    Exercise22() {
        System.out.println("Object Creating.....");
    }

}

class Client22 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Session59.Exercise22");
        System.out.println(c.getName());
    }

}