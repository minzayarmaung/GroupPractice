package Interview_Practise;
import java.util.Scanner;

public class PalindromeOrNot{
    public static void main(String[] args){
        String original , reverse ="";
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a String or Number to Check");
        original = n.nextLine();

        for(int i=original.length()-1;i>=0;i--){
            reverse=reverse+ original.charAt(i);
        }
        if(reverse.equals(original)){
            System.out.println("The Given Value ( " + original + " ) is Palindrome");
        }
        else{
            System.out.println("The Given Value ( " + original + " ) is not Palindrome");
        }
    }
}
    
