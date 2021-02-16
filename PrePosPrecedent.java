public class PrePosPrecedent{

  public static void mean(String[] args){

    int i1=11,i2=12,i3=13,i4=14,i5=15,i6,i7;
    double d1,d2;
i1--; // i1=11 after this line i1 it's gonna be 10
i2=++i1; // i1=10, became 11 so now i2=11
i3+=i2; // i3=i3+i2 so 13+11=24 now i3=24
i6=--i2; // i2=11 so 11-1 after this line i2=10
i4=i3%3; // i3=24 24%3=0 i4=0
i7=i1++ * 3; // after this line i1( which is 10) its gonna be i1=11
i5*=2; //
d1=(i1+1)/2;
d2=i5+d1*4;
System.out.println("i1 = " + i1); //
System.out.println("i2 = " + i2); //
System.out.println("i3 = " + i3); //
System.out.println("i4 = " + i4); //
System.out.println("i5 = " + i5); //
System.out.println("i6 = " + i6); //
System.out.println("i7 = " + i7); //
System.out.println("d1 = " + d1);
System.out.println("d2 = " + d2);
  }
}
