public class AreaOfACircle
{

  public static void main(String[] args)
  {

    //Using radius(r) to find the area of a circle
    int radius=20; //is the lenght of the centre until the edge

    //the formula to find the area of a circle is A=π*r[2] where A is area, π is PI and r is radius.
    // PI on JAVA documentations show that we can call the MATH functions to get PI like = "Math.PI"
    double area=Math.PI*(radius*radius);

    System.out.format("The area of a circle with a radius of 20 cm is %.2f cm.",area);

  }
}
