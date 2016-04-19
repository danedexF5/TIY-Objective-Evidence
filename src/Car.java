/**
 * my class for the description of a car
 */
public class Car {

    //quantity of the car
    private int quantity;

    //location the car is from
    private String country;


    public Car(int quantity, String country){

        this.quantity = quantity;
        this.country = country;
    }

    public void setQuantity(int quantity) {
        if (quantity < 4) {
            this.quantity = 3;
        }
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }

}
