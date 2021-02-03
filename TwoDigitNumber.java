public class TwoDigitNumber
{

  public static void main(String[] args)
  {
//this program just print two decimal in two lines, wih one in a diferent line.
    int number=45;
    int firstNumber=number/10; //it's easy because the integer store just integer(!) so we los de decimal
    int secondNumber=number-(firstNumber*10); // now we multiplicate de firstNumber * 10 to get de whole number and subtract of the whole number

    System.out.println("Your number is "+number+"\nThe first number is "+firstNumber+".\nThe second one is "+secondNumber+".");
  }
}
