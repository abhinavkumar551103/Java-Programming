public class CircleDriver {
    public static void main(String[] args) {
        
        circle c1 = new circle();
        circle c2 = new circle();
        circle c3 = new circle();

        c1.circleSerial(1);
        c1.setDetail(12.59);
        c1.printCircumference();
        c1.printArea();

        c2.circleSerial(2);
        c2.setDetail(10.765);
        c2.printCircumference();
        c2.printArea();

        c3.circleSerial(3);
        c3.setDetail(28.59);
        c3.printCircumference();
        c3.printArea();

    }
}
