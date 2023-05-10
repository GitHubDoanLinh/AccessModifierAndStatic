public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){}
    public Circle(double r){
        this.radius = r;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return 3.14*(Math.pow(this.radius,2));
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(6.5);
        System.out.print("dien tich hinh tron voi ban kinh: "+circle1.getRadius()+" la: "+ circle1.getArea());


    }
}
