package javaweek7_humaira;

/*

 */
public class Wall {
    double width;
    double height;


    public Wall() { }

    public Wall(double w, double h) {
        if (w < 0) {
            this.width = 0;
        }else{ this.width = w;}
        if (h < 0) {
            this.height = 0;
        }else{ this.height = h;}
    }


    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double x) {
       if(x < 0){
           this.width = 0;
       }else {this.width = x;}
    }

    public void setHeight(double y) {
        if(y < 0){
            this.height = 0;
        }else {this.height = y;}
    }

    public double getArea() {
        return height * width;
    }


}
