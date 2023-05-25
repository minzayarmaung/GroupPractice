package Interview_Practise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Calculate Factorial of it");
        int num = sc.nextInt();
        long ans = 1;

        for(int i=1;i<=num;i++){
            ans*=i;
        }
        System.out.println("The Factorial of " + num +" is " + ans);

    }
}
