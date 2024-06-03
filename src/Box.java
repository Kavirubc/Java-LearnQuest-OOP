public class Box {


    public Box(){};

   //With three parameters

    public Box(double height, double length, double width){

        this.height = height;
        this.width =  width;
        this.length = length;

    }

    //With one parameter

    public Box(double size){
        this(size,size,size);
    }


    //get volume
    public double getVolume(){
        double volume = length*width*height;
        return volume;
    }


    //getSurface Area

    public double getSurfaceArea(){
        double area1 = 2*length*width;
        double area2 = 2*length*height;
        double area3 = 2*height*width;
        double surfaceArea = area1+area2+area3;
        return surfaceArea;
    }


    //print

    public void printBox(){
        System.out.println("Box Details:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Volume: " + getVolume());
        System.out.println("Surface Area: " + getSurfaceArea());
    }


        public static void main(String[] args) {
            // Creating a Box using the default constructor
            Box defaultBox = new Box();
            defaultBox.setHeight(10);
            defaultBox.setWidth(15);
            defaultBox.setLength(20);

            // Print details of the defaultBox
            System.out.println("Default Box:");
            defaultBox.printBox();

            // Creating a Box using the constructor with three parameters
            Box customBox = new Box(10, 15, 20);
            System.out.println("\nCustom Box:");
            customBox.printBox();

            // Creating a Box using the constructor with one parameter (cube)
            Box cubeBox = new Box(10);
            System.out.println("\nCube Box:");
            cubeBox.printBox();
        }



    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    private double height;
    private  double width;
    private double length;



}
