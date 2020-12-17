public class Box{

    double width;
    double height;
    double length;

    Box(double width , double height, double length){     
    }

    Box(double side){

    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double getLength(){
        return this.length;
    }

    public double Volume(){
        double volume = width * height * length;
        return volume;
    }

    public double Area(){
        return faceArea() +  topArea() + sideArea();
    }

    double faceArea(){
        return (2*(width*length));
    }

    double topArea(){
        return (2*(length*width));
    }

    double sideArea(){
        return (2*(height*width));
    }
}