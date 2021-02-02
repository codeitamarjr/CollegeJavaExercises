import java.util.Scanner; //means that I'm using a tool from outside java

public class SavingsBalance
{
    public static void main(String[] args) // Every program must have a main method, it's where the program start.
    {
      Scanner kb = new Scanner(System.in); // I'm creating a new type of scanner class

    int variableSavings;
    byte variableWorkHoursWeek;
    double variableWorkRate,goal;
    int variableRent, variableShoppingWeek;
    boolean variableStudant= true; // is to define and hold true or false for a variable
    String variableName="Itamar";

    System.out.println("-------------------------------------------------------");
    System.out.println("--------------  |  Savings Money  |   -----------------");
    System.out.println("-------------------------------------------------------");
    System.out.println("-----Here you can see how you can reach your goal------");
    System.out.println("-------------------------------------------------------\n");  //It's just ot be confortable to read.


      //System.out.println("Let's start: What's your name?");

      System.out.println("Let's start: What's your goal?");
      goal = kb.nextDouble();
      System.out.println("How much do you have on your account?");
      variableSavings = kb.nextInt();
      System.out.println("How many hour do you work per week?");
      variableWorkHoursWeek = kb.nextByte();
      System.out.println("What's your rate per hour?");
      variableWorkRate = kb.nextDouble();
      System.out.println("How much do you spent with rent per month?");
      variableRent = kb.nextInt();
      System.out.println("How much do you spent with food and shopping?");
      variableShoppingWeek = kb.nextInt();


    System.out.println("----------------------Resume---------------------------");
    System.out.format(variableName+" base in your data, your actual saving is %.2f€\n", (double)variableSavings);


    double variableWorkMonthIncome = variableWorkRate * (double)variableWorkHoursWeek * 4; //
    int variableSpendMont = variableShoppingWeek * 4;
    System.out.format("Your income per month is %.2f€ and you \nspent %.2f€ with food shopping per month so:\n" , variableWorkMonthIncome , ((double)variableShoppingWeek)*4);

    System.out.println("-------------------------------------------------------");
    double variableSavings3Month = ((variableWorkMonthIncome*3) - (variableSpendMont*3)) +variableSavings;
    double variableSpareMoney = (variableWorkMonthIncome*3) - (variableSpendMont*3);
    System.out.format(variableName+" savings after 3 month is %.2f€(+%.2f€).\n", variableSavings3Month, variableSpareMoney); //\n same as println
    System.out.println("-------------------------------------------------------");
    System.out.println("You're a studant? "+variableStudant);


    System.out.format("If you want reach your goal, you'll need save\nmore %.2f€\n",(goal-variableSavings3Month));
      double variableWorkExtra = (goal-variableSavings3Month)/variableWorkRate;
      System.out.format("It's means that you have to work %.0f extra hours,\ngood luck!\nIf this number is negativa you already reach your goal\nbud!",variableWorkExtra);


        }
}
