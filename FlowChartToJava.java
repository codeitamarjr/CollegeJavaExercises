import java.util.Scanner;
public class FlowChartToJava {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter base: ");
            int base = scanner.nextInt();
            System.out.println("Enter height");
            int height = scanner.nextInt();
            double area = ((double)base * height)/2;
            System.out.println("The area is "+area);
        }


}
