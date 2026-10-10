class RectangeDriver{
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();
        Rectangle rec3 = new Rectangle();
        
        rec1.setDetails(35.28,28.8);
        rec2.setDetails(52.5,29.57);
        rec3.setDetails(30.5,15.3);
        
        
        rec1.nameRectangle(1);
        rec1.getDetails();
        rec1.printArea();
        rec.printPerimeter();
        
        rec2.nameRectangle(2);
        rec2.getDetails();
        
        rec3.nameRectangle(3);
        rec3.getDetails();

    }
}