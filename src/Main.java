import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //Creating a scanner
        Scanner calculator = new Scanner(System.in);

        //Stating the total bill/cost of the food only

        System.out.println("Enter cost.");
        double bill = calculator.nextDouble();

        //Stating the percent of tip in decimal form.

        System.out.println("Enter percent of tip.");
        double percenttip = calculator.nextInt();
        percenttip/=100;      //Changing into decimal form

        //Stating the amount of people

        System.out.println("Enter amount of people.");
        int people = calculator.nextInt();

        //Calculations.

        double tiponly = (percenttip*bill);
        double total = (bill+tiponly);
        double tipperperson = (tiponly/people);
        double totalperperson = (total/people);


        System.out.println("Tip: $" + String.format("%.2f", tiponly));
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Tip per person: $" + String.format("%.2f", tipperperson));
        System.out.println("Total per person: $" + String.format("%.2f", totalperperson));


    }
}