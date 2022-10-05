import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //Creating a scanner
        Scanner calculator = new Scanner(System.in);

        //Look Purposes
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| What's my cost?                 |");
        System.out.println("| The only calculator you'll need!|");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Stating the total bill/cost of the food only
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Enter the total cost of food/items you purchased below.   |");
        System.out.println("-------------------------------------------------------------");
        double bill = calculator.nextDouble();

        //Stating the percent of tip in decimal form.
        System.out.println("------------------------------------------");
        System.out.println("| Enter percent of tip you wish to give. |");
        System.out.println("|     (THIS MUST BE A WHOLE NUMBER.)     |");
        System.out.println("------------------------------------------");

        double percenttip = calculator.nextInt();
        percenttip/=100;      //Changing into decimal form

        //Stating the amount of people
        System.out.println("-----------------------------------------");
        System.out.println("| Enter amount of people that will pay. |");
        System.out.println("-----------------------------------------");
        int people = calculator.nextInt();

        //Calculations.
        // To find only the tip price, multiply tip price by the total bill.
        double tiponly = (percenttip*bill);
        // To find the total, add bill + tip.
        double total = (bill+tiponly);
        // To find the amount of money for tip each person has to pay, divide tip cost by amount of people.
        double tipperperson = (tiponly/people);
        // To find the amount of money for total each person has to pay, divide total cost by amount of people.
        double totalperperson = (total/people);

        //Look purposes.
        System.out.println("COMPUTING. PLEASE WAIT....");
        System.out.println("....");
        System.out.println("....");
        System.out.println("....");
        System.out.println("DONE!");

        System.out.println();
        System.out.println("YOUR RECEIPT:");
        System.out.println();

        System.out.println("------------------------------------------");
        System.out.println("| The cost of your tip is: $" + String.format("%.2f", tiponly) + "        |");
        System.out.println("| The cost of your total is: $" + String.format("%.2f", total) + "     |");
        System.out.println("| The cost of tip per person is: $" + String.format("%.2f", tipperperson) + "  |");
        System.out.println("| The cost of total per person is: $" + String.format("%.2f", totalperperson)+ "|");
        System.out.println("------------------------------------------");

        //Realism purposes.
        System.out.println("THANK YOU! HAVE A GOOD DAY!");
    }
}