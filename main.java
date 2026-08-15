public class main{
    public static void main(String[] args){

        // Create Point objects
        System.out.println("Point Class Testing");
        Point p1 = new Point();
        Point p2 = new Point(5, 6);
        Point p3 = new Point(p2);
        Point p4 = new Point();
        
        p1.display();

        p1.setX(4);
        p1.setY(3);
        System.out.println("----------" + "\nAfter modification" + "\n==========" );
        p1.display();

        p2.distanceFromOrigin();
        System.out.printf("\n----------" + "\nDistance of Point 2 from origin: %.2f\n" + "==========" + "\n", p2.distanceFromOrigin());

        p3.move(2, 3);
        System.out.println("\n----------" + "\nAfter moving Point 3" + "\n==========" );
        p3.display();

        p2.add(p1);
        System.out.println("\n----------" + "\nAfter adding Point 1 to Point 3" + "\n==========" );
        p2.display();

        p4 = p2.subtraction(p1);
        System.out.println("\n----------" + "\nAfter subtracting Point 1 from Point 3" + "\n==========" );
        p4.display();

        p3.isOrigin();
        System.out.println("\n----------" + "\nIs Point 3 at origin? " + p3.isOrigin() + "\n==========" );



        // Create Line objects

        System.out.println("Line Class Testing");
        Line l1 = new Line();
        Line l2 = new Line(p1, p2);
        Line l3 = new Line(l1);

       l1.show();
       
       l1.setP1(p2);
       l1.setP2(p3);
       System.out.println("\n----------" + "\nAfter setting Points of Line 1" + "\n==========" );
       l1.show();

       l2.slope();
       System.out.printf("\n----------" + "\nSlope of Line 2: %.2f\n" + "==========" + "\n", l2.slope());


       l3.show();

       l3.move(3,5);
       System.out.println("\n----------" + "\nAfter moving Line 3" + "\n==========" );
       l3.show();

       l1.isEqual(l2);




       
        // Create Triangle objects

        System.out.println("Triangle Class Testing");
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(p1, p2, p3);
        Triangle t3 = new Triangle(t2);

        t1.show();

        t1.isEquilateral();
        System.out.println("\n----------" + "\nIs Triangle 1 equilateral? " + t1.isEquilateral() + "\n==========" );

        t2.move(3, 5);
        System.out.println("\n----------" + "\nAfter moving Triangle 2" + "\n==========" );
        t2.show();

        t3.side1();
        System.out.printf("\n----------" + "\nLength of side 1 of Triangle 3: %.2f\n" + "==========" + "\n", t3.side1());



    }
}