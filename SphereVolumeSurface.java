public class SphereVolumeSurface
{

  public static void main(String[] args)
  {

    //to calculate the volume and surface area of a sphere where r=radius, Volume of a sphere = 4/3 πr3 and Surface Area = 4πr2

    int radius=8;

    double volume=(4f/3f)*Math.PI*(radius*radius*radius);
    double surface=4*Math.PI*((double)radius*radius);

    System.out.format("The volume and surface area of a sphere with a radius of 8cm is:\nVolume %.2fcm.\nSurface is %.2f square centimeters." ,volume,surface);
  }
}
