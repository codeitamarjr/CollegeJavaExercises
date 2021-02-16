import java.util.Scanner; //calling the utility to start scan

public class Average3Ints{
  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in); //defining kb as a keyboard variable imput
    int firstInteger, secondInteger, thirdInteger; //defining 3 integer as request

    System.out.println("Imput your first integer");
    firstInteger = kb.nextInt(); // asking the first integer
    double firstIntegerDec = firstInteger; // storing this integer in a double variable
    firstIntegerDec /= 2; // divide this double per 2
    System.out.format(" Your first average is %.1f\n\n",firstIntegerDec); //print this double result with one decimal

    System.out.println("Imput your second integer");
    secondInteger = kb.nextInt();
    double secondIntegerDec = secondInteger;
    secondIntegerDec /= 2;
    System.out.format(" Your first average is %.1f\n\n",secondIntegerDec);

    System.out.println("Imput your third integer");
    thirdInteger = kb.nextInt();
    double thirdIntegerDec = thirdInteger;
    thirdIntegerDec /= 2;
    System.out.format(" Your third average is %.1f\n\n",thirdIntegerDec);
    double totalAverageD;
    totalAverageD=((double)firstInteger+secondInteger+thirdInteger)/3;
    System.out.format("The total average is %.1f\n\n",totalAverageD);

  }

}
