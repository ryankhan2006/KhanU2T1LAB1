public class RectangleRunner {
    public static void main (String[] args) {
    Rectangle plotOne= new Rectangle (150,200);
    Rectangle plotTwo= new Rectangle(125);
    Rectangle plotThree= new Rectangle();

    int lengthOne= plotOne.getLength();
    int widthOne= plotOne.getWidth();
    int areaOne= plotOne.calculateArea();
    System.out.println("Plot One Length: " + lengthOne);
    System.out.println("Plot One Width: " + widthOne);
    System.out.println("Plot One Area: " + areaOne);

    int lengthTwo= plotTwo.getLength();
    int widthTwo= plotTwo.getWidth();
    int areaTwo= plotTwo.calculateArea();
    System.out.println("Plot Two Length: " + lengthTwo);
    System.out.println("Plot Two Width: " + widthTwo);
    System.out.println("Plot Two Area: " + areaTwo);

    int lengthThree= plotThree.getLength();
    int widthThree= plotThree.getWidth();
    int areaThree= plotThree.calculateArea();
    System.out.println("Plot Three Length: " + lengthThree);
    System.out.println("Plot Three Width: " + widthThree);
    System.out.println("Plot Three Area: " + areaThree);

    int widthv1= plotOne.setWidth(75);
    int widthv2= plotTwo.setWidth(75);
    int lengthv2= plotTwo.setLength(75);
    int widthv3= plotThree.setWidth(75);
    int areaOnev1= plotOne.calculateArea();
    int areaTwov2= plotTwo.calculateArea();
    int areaThreev3= plotThree.calculateArea();

    System.out.println("Plot One Length: " + lengthOne);
    System.out.println("Plot One Width: " + widthv1);
    System.out.println("Plot One Area: " + areaOnev1);

    System.out.println("Plot Two Length: " + lengthv2);
    System.out.println("Plot Two Width: " + widthv2);
    System.out.println("Plot Two Area: " + areaTwov2);

    System.out.println("Plot Three Length: " + lengthThree);
    System.out.println("Plot Three Width: " + widthv3);
    System.out.println("Plot Three Area: " + areaThreev3);
    }
}
