import java.util.Scanner;

public class LenghtInFeet {

    public static void main(String[] args) {
        
        int feet;
        double cm = 30.48;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the lenght that you want to convert from feet to cm?");
        feet = scanner.nextInt();
        //1 feet = 30.48 cm
        double result=feet*(double)cm;
        System.out.println(feet+" inches is "+result+" cm.");
    }
    
}
