/**
 * my class for a bike
 */
public class Bike {

    private String color;
    private int speeds;

    public Bike(String color, int speeds){

        this.color = color;
        this.speeds = speeds;

    }

    public void setColor(String color){
            this.color = color;
        }


    public String getColor(){
        return this.color;
    }

    public int getSpeeds(){
        return this.speeds;

    }

    public void setSpeeds(int speeds){
        if (speeds > this.speeds) {
            this.speeds = speeds;
        }
    }
}
