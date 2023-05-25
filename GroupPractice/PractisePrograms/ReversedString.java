package Interview_Practise;

public class ReversedString {
    public static void main(String[] args) {
        String str = "Welcome to Java";
        String str1 = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str1 = ch + str1;
        }
        System.out.println("Reversed String: " + str1);
    }
}
