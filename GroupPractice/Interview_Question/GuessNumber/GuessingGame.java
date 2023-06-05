package Interview_Question.GuessNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessingGame{
    private String random;
    private int count=0,limit=8;
    private char [] digits = new char[3];
    private boolean finalResult = false;

    public static final String Rules = """
        There is a 4 digit number.\n"
        (1) "You have to guess it before you run out of 8 chances.
        (2) "The game will give out result for each of your guess.
        (3) "'*' means the digit in your guess is the same position and same digit.
        (4) "'!' means the digit in your guess is contain in hidden number.
        (5) "but in diffent position than your guess.
            """;

    private static final String Win = """
            Congratulation ! You win !
            """;

    private static final String Lose = """
            Sry , You Lose ! Please try again
            """;


    // Asking Userinput without Using Scanner Method  and Check 
    public void StartGame(){
    
    System.out.println(Rules);
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    GenerateNumbers();

    String userInput;

    count = limit;

    // if an error occurs while reading input from the user.
    do{
        System.out.printf("You have %d chances Left !" , count);
        System.out.println("Guess the Number");

    try {
          System.out.println("Enter your Guess");  
          userInput=reader.readLine();

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    
    String result = checkUserInput(userInput);
    System.out.println("Result : " + result);
    finalResult(result);

    count--;

    }while(!finalResult && count>0);

    if(finalResult){
        System.out.println(Win + " Your Guess Count Time " + count);
    }
    else {
        System.out.println(Lose + "The Hidden Number is " + random);
    }

    }

    public boolean finalResult (String result){
        return finalResult = result.equals("****");
    }

    //Generating Numbers 
    public void GenerateNumbers(){

        do{
        int num = (int) (1+Math.random()*10000);
        random = String.format("%04d",num);

        }while(!UniqueNumbers(random));

    }
    // Check if they are Unique
    public boolean UniqueNumbers(String num){

        digits = num.toCharArray();

        for(int i=0;i<num.length()-1;i++){

            for(int j=i+1;j<num.length();j++){

                if(digits[i]==digits[j]){

                    return false;
                }
            }
        }
        return true;
    }
    
    // Checking UserInput and Return 
    public String checkUserInput(String userInput){

        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<random.length() && i < userInput.length();i++){
                char r = random.charAt(i);
                char u = userInput.charAt(i);
                
                if(u==r){
                    sb.append("*");
                }
                else if(random.contains(u+"")){
                    sb.append("!");
                }
            }
        return sb.toString();   
    }

    public static void main(String[] args) {
       new GuessingGame().StartGame();
    }
}