import java.util.Scanner;

public class AreaOfRetangule {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("What's the lenght in cm? ");
        double lenght = scanner.nextDouble();
        System.out.println("What's the width in cm? ");
        double widht = scanner.nextDouble();
        double area=widht*lenght;
        System.out.println("The area of a retangule is "+area+" cm");
    }
    
}
