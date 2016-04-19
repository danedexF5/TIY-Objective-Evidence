/**
 * my class for the description of a house
 */

//going to be describing houses
public class House {

    /**
     * name of the house
     */
    private String name;

    //color of the house
    private String color;

    //what the house is worth
    private int value;

    //Neighborhood the house is in
    private String neighborhood;

    //location of the house
    private String state;


    public House(String name, String color, int value, String neighborhood, String state){

        this.name = name;
        this.color = color;
        this.value = value;
        this.neighborhood = neighborhood;
        this.state = state;

    }

    public void setValue(int value){
        if (value > this.value) {
            this.value = value;
        }
    }

    public int getValue(){
        return this.value;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setNeighborhood(String neighborhood){
        this.neighborhood = neighborhood;
    }

    public String getNeighborhood(){
        return this.neighborhood;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

}





