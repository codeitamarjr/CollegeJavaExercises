public class SavingsBalance
{
    public static void main(String[] args) // Every program must have a main method, it's where the program start.
{
    int itamarSavings = 9035;
    byte itamarWorkHoursWeek = 29;
    double itamarWorkRate = 11.2;
    int itamarRent = 450;
    int itamarShoppingWeek = 100;

    double itamarWorkMonthIncome = itamarWorkRate * itamarWorkHoursWeek * 4;
    int itamarSpendMont = itamarShoppingWeek * 4;

    System.out.println("Itamar actual saving is "+ itamarSavings +"€");
    System.out.println("Itamars income per month is " + itamarWorkMonthIncome +"€, per week is " +itamarShoppingWeek+"€");
    System.out.println("Itamars spend per month is " + itamarSpendMont+"€");

    double itamarSavings3Month = (itamarWorkMonthIncome*3) - (itamarSpendMont*3) +itamarSavings;
    System.out.println("Itamars saving after 3 months is " + itamarSavings3Month +"€");

        }
}
