import java.util.Scanner;

class Rectangle {
    Scanner sc = new Scanner(System.in);
    private float width; //attribute
    private float height; //attribute

    private float getWidth(){
        System.out.println("Input value of width: ");
        width = sc.nextFloat();
        return width;
    }

    private float getHeight(){
        System.out.println("Input value of height: ");
        height = sc.nextFloat();
        return height;
    }

    private void countPerimeter(){
        System.out.println("Perimeter = " + ((width + height) * 2));
    }

    private void countArea() {
        System.out.println("Area = " + (width * height));
    }

    private void checkSquare(){
        if(width == height){
            System.out.println("Value Width= " + width + " Width= " + width + " is a square");
        }else
            System.out.println("Value Height: " + width + " Height= " + height + " is not a square");
    }

    private void output(){
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getWidth();
        rectangle.getHeight();
        rectangle.countPerimeter();
        rectangle.countArea();
        rectangle.checkSquare();
        rectangle.output();
    }


}
