package labor2_2;

public class Rectangle {
    private double length, width;
    public Rectangle(double length, double width){
        if(length < 0 || width < 0){
            return;
        }
        this.length = length;
        this.width = width;
    }

    public double area(){
        double area = 2*this.length + 2*this.width;
        return area;
    }

    public double perimeter(){
        double perimeter = this.length*this.width;
        return perimeter;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
