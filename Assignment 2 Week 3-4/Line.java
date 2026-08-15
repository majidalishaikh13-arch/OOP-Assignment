public class Line{
    private Point p1;
    private Point p2;
    static int count = 0;

    public Line(){
        this.p1 = new Point();
        this.p2 = new Point(5,6);
        count++;
    }

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
        count++;
    }

    public Line(Line l){
        this.p1 = l.p1;
        this.p2 = l.p2;
        count++;
    }

    public Point getP1(){
        count++;
        return this.p1;
    }

    public Point getP2(){
        count++;
        return this.p2;
    }
 
    public void setP1(Point p1){
        this.p1 = p1;
        count++;
    }

    public void setP2(Point p2){
        this.p2 = p2;
        count++;
    }

    public float  length(){
        count++;
        return (float) Math.sqrt(Math.pow((this.p2.getX() - this.p1.getX()), 2) + Math.pow((this.p2.getY() - this.p1.getY()), 2));
    }

    public float slope(){
        count++;
        return (float) (this.p2.getY() - this.p1.getY()) / (this.p2.getX() - this.p1.getX());
    }

    public Point midPoint() {
    int midX = (this.p1.getX() + this.p2.getX()) / 2;
    int midY = (this.p1.getY() + this.p2.getY()) / 2;
    count++;
    return new Point(midX, midY);
    }

    public void move(int dx, int dy){
        this.p1.move(dx, dy);
        this.p2.move(dx, dy);
        count++;
    }

    public void isEqual(Line l){
        if(this.p1.getX() == l.p1.getX() && this.p1.getY() == l.p1.getY() && this.p2.getX() == l.p2.getX() && this.p2.getY() == l.p2.getY()){
            System.out.println("The two lines are equal.");
        }else{
            System.out.println("The two lines are not equal.");
        }
        count++;
    }

    public void Vertical(){
        if(this.p1.getX() == this.p2.getX()){
            System.out.println("The line is vertical.");
        }else{
            System.out.println("The line is not vertical.");
        }
        count++;
    }

    public void Horizontal(){
        if(this.p1.getY() == this.p2.getY()){
            System.out.println("The line is horizontal.");
        }else{
            System.out.println("The line is not horizontal.");
        }
        count++;
    }

    public void parallel(Line l){
        if(this.slope() == l.slope()){
            System.out.println("The two lines are parallel.");
        }else{
            System.out.println("The two lines are not parallel.");
        }
        count++;
    }

    public void show(){
        System.out.println("Point 1:\n" + this.p1 + "\nPoint 2:\n" + this.p2 + "\nCount: " + count);
        }

        public String toString(){
            return "Point 1: " + this.p1 + "\nPoint 2: " + this.p2 + "\nCount: " + count;
        }
}
