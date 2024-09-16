public class Main {
    public static void main(String[] args) {
        String str = new String("ABC");
        String str1 = new String("ABC");
        if(str.equals(str1))
            System.out.println("equal");
        else
            System.out.println("false");
    }
}