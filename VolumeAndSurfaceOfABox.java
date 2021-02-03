public class VolumeAndSurfaceOfABox
{

  public static void main(String[] args){

    //To find the volume of a box multiply length, width, and height, the result is cubic
    int lenght=5, widht=9, height=3,cubic;
    cubic=lenght*widht*height;
    //Surface area is the sum of the areas of all faces (or surfaces) on a 3D shape,in the case of this cubic:
    int surface=(widht*height)+(widht*height)+(lenght*widht)+(lenght*widht)+(lenght*height)+(lenght*height);

    System.out.println("The volume of a box with lenght 5cm, widht 9cm and height 3cm is "+cubic+"cm cubic");
    System.out.println("The surface of a box with lenght 5cm, widht 9cm and height 3cm is "+surface+" square centimeters");

  }
}
