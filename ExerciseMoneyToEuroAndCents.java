public class ExerciseMoneyToEuroAndCents{

    public static void main(String[] args) {
        // Split Euro and Cents:
        double moneyNumber = 123.45;
        int euroCasting = (int)moneyNumber; //first I cast to integer to remove the cents/decimal
        double euroCentsDecimal = (moneyNumber-(double)euroCasting)*100;
        //Now I calculate the main number(with cents) minus the number byself with 0 cents, so the remain will just be the cents of the main number
        //Now I multiply the remain( which is the cents of the main number) by 100
        int euroCentsCasting = (int)euroCentsDecimal; //Now I cast again just to remove the .00 and the remain will be an integer of the cents

        System.out.println(+moneyNumber+" is "+euroCasting+" Euros and "+euroCentsCasting+" cents.");

    }
}