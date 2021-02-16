import java.util.Scanner;

public class ExerciseCentsToEuroAndCents {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the amount of cents? ");
        int value = scanner.nextInt();
        int euro = (int)value/100;
        int cents = value-euro*100;
        System.out.println(+value+" is "+euro+" Euros and " +cents+" Cents.");
    }
    
}
