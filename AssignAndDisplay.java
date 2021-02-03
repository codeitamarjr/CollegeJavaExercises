public class AssignAndDisplay{

  public static void main(String[] args){

    int numbeOfTransactions=25, ageInYears=33;
    double totalPay=125.40, taxPayment=0.54, distance=1.40, average=5.2;
    long populationOfEurope=741400000; // feb of 2021
    char accountType='b';
    float grossPay=2600.5087f; //why its showing 2600.5088 instead of .5087

    System.out.println("Follow the variables");
    System.out.println("numbeOfTransactions and ageInYears: "+numbeOfTransactions+","+ageInYears);
    System.out.format("totalPay,taxPayment, distance and average : %.2f, %.2f, %.2f and %.2f\n",totalPay,taxPayment,distance,average);
    System.out.println("populationOfEurope: "+populationOfEurope);
    System.out.println("accountType: "+accountType);
    System.out.println("grossPay: "+grossPay);

  }
}
