import java.util.Random;

public class Color {

    Random rand = new Random();

    int r = rand.nextInt(255);
    int g = rand.nextInt(255);
    int b = rand.nextInt(255);
    double red;
    double green;
    double blue;

    //getters

    public int getRed(){
        return this.r;
    }

    public int getGreen(){
        return this.g;
    }

    public int getBlue(){
        return this.b;
    }

    //setters

    public void setRed(int r){
        this.r = r;
    }

    public void setGreen(int g){
        this.g = g;
    }

    public void setBlue(int b){
        this.b = b;
    }

    //functions

    public void randomRed(){
        r = rand.nextInt(255);
    }

    public void randomGreen(){
        g = rand.nextInt(255);
    }

    public void randomBlue(){
        b = rand.nextInt(255);
    }

    public void lighten(double percent){
        double equationPerc = percent*0.01;
        red = r;
        green = g;
        blue = b;
        red = (255*equationPerc)+red;
        green = (255*equationPerc)+green;
        blue = (255*equationPerc)+blue;
    }

    public void darken(double percent){
        double equationPerc2 = percent*0.01;
        red = r;
        green = g;
        blue = b;
        red = red-(equationPerc2*25);
        green = green-(equationPerc2*25);
        blue = blue-(equationPerc2*25);
    }

    public double getChangedRed(){
        r = (int)red;
        return r;
    }
    public double getChangedGreen(){
        g = (int)green;
        return g;
    }

    public double getChangedBlue(){
        b = (int)blue;
        return b;
    }

}