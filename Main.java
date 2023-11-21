import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanBottleNum = new Scanner(System.in);
        //Define variables
       int numBottles = 0;
       int bottleTotal = 0;
       int inputCorrect = 1;
       do{
           try {
               System.out.println("How manny bottles of pop are on the wall? (Please enter a number.)");
               numBottles = scanBottleNum.nextInt();
               bottleTotal = numBottles;
               inputCorrect = 0;
           } catch (Exception e) {
               System.out.println("That is not a valid number");
               System.out.println("Please enter a whole number.");
               scanBottleNum.nextLine();
           }
       }while (inputCorrect == 1);



        //While Loop

       while(numBottles > 1){
            System.out.println(numBottles + " bottles of pop on the wall.");
            System.out.println(numBottles + " bottles of pop!");

            System.out.print("Take one down, pass it around.");

            numBottles = numBottles - 1;
            System.out.println(numBottles + " bottles of pop on the wall.");
    }

        //one to zero
        if (numBottles == 1){

            System.out.println(numBottles + " bottle of pop on the wall.");
            System.out.println(numBottles + " bottle of pop!");

            numBottles = numBottles - 1;
            System.out.println("Take one down, pass it around.");
            System.out.println("No more bottles of pop on the wall!");
    }
        if(numBottles == 0){
            System.out.println("No more bottles of pop on the wall.");
            System.out.println("No more bottles of pop!");
            System.out.println("Go to the store,");
            System.out.println("Buy some more!");

            System.out.println(bottleTotal + " bottles of pop on the wall!");
        }

        scanBottleNum.close();
    }
}
