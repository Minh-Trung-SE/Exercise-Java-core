class Rectangle {
    private float width; //attribute
    private float height; //attribute

    private float getWidth(){
        return this.width;
    }

    private float getHeight(){
        return this.height;
    }

    private float getPerimeter(){
        return (width + height) * 2;
    }

    private float getArea() {
        return width * height;
    }

    private boolean checkSquare(){
        if(width == height){
            return true;
        }else
            return false;
    }

    private void output(){
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }
}
