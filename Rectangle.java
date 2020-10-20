class Rectangle {
    private float width; //attribute
    private float height; //attribute
//method set and return width
    private float getWidth(){
        return this.width;
    }
//method set and return height
    private float getHeight(){
        return this.height;
    }
//method set and return perimeter
    private float getPerimeter(){
        return (width + height) * 2;
    }
//method set and return area
    private float getArea() {
        return width * height;
    }
//method check square
    private boolean checkSquare(){
        if(width == height){
            return true;
        }else
            return false;
    }
//method display
    private void output(){
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }
}
