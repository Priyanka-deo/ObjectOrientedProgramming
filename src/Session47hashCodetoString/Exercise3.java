package Session47hashCodetoString;

public class Exercise3 {

}

class Test8 {
    public static void main(String[] args) {
        Exercise3 exe = new Exercise3();
        int hashCode = exe.hashCode();
        String ref = exe.toString();
        System.out.println("Hash Code       :" + hashCode);
        System.out.println("Reference       :" + ref);

    }
}

