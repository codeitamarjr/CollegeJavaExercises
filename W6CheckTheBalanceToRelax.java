import java.util.Scanner;

public class W6CheckTheBalanceToRelax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your balance?");
        int balance = scanner.nextInt();
        if (balance >= 500){
            System.out.println("You can relax today!");
        }
        else{
            System.out.println("You have to go to work!");
        }
    }
}
