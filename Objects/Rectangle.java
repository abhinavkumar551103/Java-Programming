class Rectangle {
    double length;
    double width;

    public void nameRectangle(int serial) {
        System.out.println("This is the rectangle " + serial);
    }

    public void setDetails(double l, double w) {
        length = l;
        width = w;
    }

    public void getDetails() {
        System.out.println("The length is : " + length);
        System.out.println("The width is : " + width);
    }

    public void printArea(){
        System.out.println("The area of the rectange is :"+length*width);
    }
    public


}