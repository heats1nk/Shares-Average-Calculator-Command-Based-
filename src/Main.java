import java.util.*;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Type Y to continue or N to exit: ");
            Scanner scan = new Scanner(System.in);
            /*
             String str1 = scan.nextLine();
             if (str1.equalsIgnoreCase("n"){
                 System.out.println("bye");
                break;
             }
             */

            boolean isEntry = false;
            do {
                String str = scan.nextLine();
                if (str.equalsIgnoreCase("y")) {
                    System.out.println("Welcome.");
                    isEntry = true;
                    continue;
                } else if (str.equalsIgnoreCase("n")) {
                    System.out.println("bye");
                    System.exit(-1);
                    //break;
                } else {
                    System.out.println("Invalid Entry");
                }
            } while (!(isEntry));

            //this comment contains number validation with if else
            /*
            do {
                System.out.println("Enter old price of share bought: ");
                if (scan.hasNextDouble()){
                    double oldPrice = scan.nextDouble();
                    oldShares.setSharePrice(oldPrice);
                    isNumber = true;
                }
                else{
                    isNumber = false;
                    System.out.println("Invalid Entry");
                }
            }while(isNumber = true);
            */

            //old Shares
            Shares oldShares = new Shares();
            System.out.println("---------------------------------------------");
            System.out.println("");
            System.out.println("Enter old price of share bought: ");
            int oldShare = scan.nextInt();
            oldShares.setSharePrice(oldShare);

            System.out.println("---------------------------------------------");
            System.out.println("");
            System.out.println("Enter units of share bought: ");
            int oldUnit = scan.nextInt();
            oldShares.setQuantity(oldUnit);

            //new Shares
            Shares newShares = new Shares();
            System.out.println("---------------------------------------------");
            System.out.println("");
            System.out.println("Enter new price of share bought: ");
            double newPrice = scan.nextDouble();
            newShares.setSharePrice(newPrice);

            System.out.println("---------------------------------------------");
            System.out.println("");
            System.out.println("Enter units of share bought: ");
            int newUnit = scan.nextInt();
            newShares.setQuantity(newUnit);

            System.out.println("---------------------------------------------");
            System.out.println("Old shares information: " + oldShares);
            System.out.println("New shares information: " + newShares);
            System.out.println("---------------------------------------------");

            System.out.println("---------------------------------------------");
            System.out.println("Calculating Average...");
            //calculation
            Shares finalCalc = new Shares();
            double result = finalCalc.avgCalculation(oldShares, newShares);
            System.out.println("The average price of total share is: " + result);

        }
    }
}
