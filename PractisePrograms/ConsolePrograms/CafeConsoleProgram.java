package Console_Programs;
import java.util.Scanner;

public class CafeProgram{
    public static String[]items = {"Coffee","Milk","Bread","Pan Cake"};
    public static double[]prices ={2.5,1.5,2.25,3.5};
    

    public void showItemsAndPrices(){
        for(int i=0;i<items.length;i++){

            for(int j=i;j<prices.length;j++){

            System.out.println("MENU : " + (i+1) +" . " + items[i] + " : " + prices[j] + " $");
            break; 
        }
    }
    }

    public static void main(String[] args) {
        double total = 0;
        String ch;

        Scanner sc = new Scanner(System.in);
        CafeProgram cp = new CafeProgram();

        do{
        cp.showItemsAndPrices();
        System.out.println();

        System.out.println();

        System.out.println("Select Items : " + " You can select more than one, e.g (1,2,3,4)");
        String select = sc.nextLine();
        String input[] = select.split(",");

        System.out.print("Your Orders are : ");
        for(String list:input){
            int itemNumber = Integer.parseInt(list)-1;
            System.out.print(items[itemNumber] + ",");
        }

        System.out.println();
        System.out.println("Your Orders : ");
        for(String list : input){
            int itemNumber = Integer.parseInt(list)-1;
            System.out.println(prices[itemNumber]);
            total+=prices[itemNumber];
        }
        System.out.println("Total : " + total + "$");
        
        System.out.println("Do you want to Order More ? y/n");
        ch=sc.nextLine();


        if(ch.equalsIgnoreCase("n")){
            System.out.println("\nThank you for your Purchase. Have a Great Day!");
    }
    } 
    while(!ch.equalsIgnoreCase("n"));

    sc.close();
    }
}
