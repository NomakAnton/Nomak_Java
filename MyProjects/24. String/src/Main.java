public class Main {
    public static void main(String[] args) {
        String s1 = "marsel";
        String s2 = "marsel";

        System.out.println(s1 == s2);

        String s3 = new String("Marsel");
        String s4 = new String("Marsel");
        System.out.println(s3 == s4);
    }
}
