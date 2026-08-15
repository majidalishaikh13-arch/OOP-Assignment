public class Triangle{
    private Point p1;
    private Point p2;
    private Point p3;
    static int count = 0;

    public Triangle(){
        this.p1 = new Point();
        this.p2 = new Point(5,6);
        this.p3 = new Point(9,8);
        count++;
    }
    

    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        count++;
    }

    public Triangle(Triangle t){
        this.p1 = t.p1;
        this.p2 = t.p2;
        this.p3 = t.p3;
        count++;
    }

    public Point getP1(){
        return this.p1;
    }

    public Point getP2(){
        return this.p2;
    }

    public Point getP3(){
        return this.p3;
    }

    public void setP1(Point p1){
        this.p1 = p1;
    }

    public void setP2(Point p2){
        this.p2 = p2;
    }

    public void setP3(Point p3){
        this.p3 = p3;
    }

    public float side1(){
        count++;
        return p1.distance(p2);
    }

    public float side2(){
        count++;
        return p2.distance(p3);
    }

    public float side3(){
        count++;
        return p3.distance(p1);
    }

    public float perimeter(){
        count++;
        return side1() + side2() + side3();
    }

    public boolean isEqual(Triangle t) {
        count++;
    return this.p1.isEqual(t.p1)
        && this.p2.isEqual(t.p2)
        && this.p3.isEqual(t.p3);
    }

    public boolean isRightTriangle() {
    float a = p1.distance(p2);
    float b = p2.distance(p3);
    float c = p3.distance(p1);

    count++;

    return (a * a + b * b == c * c)
        || (a * a + c * c == b * b)
        || (b * b + c * c == a * a);
    }

    public boolean isEquilateral() {
    float a = p1.distance(p2);
    float b = p2.distance(p3);
    float c = p3.distance(p1);

    count++;

    return a == b && b == c;
    }

    public void move(int dx, int dy) {
    p1.move(dx, dy);
    p2.move(dx, dy);
    p3.move(dx, dy);
    count++;
    }

    public void show() {
    System.out.println("Point 1: " + p1 + "\nPoint 2: " + p2 + "\nPoint 3: " + p3);
    }

    public String toString() {
    return "P1: " + p1 + "\nP2: " + p2 + "\nP3: " + p3;
    }

}
