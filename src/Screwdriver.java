/**
 * class that will describe different screwdrivers
 */
public class Screwdriver {
    /**
     * The amount of screwdrivers owned
     */
    private int quantity = 0;
    /**
     * The type of screwdriver owned
     */
    private String types;

    public Screwdriver(int quantity, String types){

        this.quantity = quantity;
        this.types = types;

    }

    public void setQuantity(int quantity) {
        if (quantity >= this.quantity) {
            this.quantity = quantity;
        }
    }
    public int getQuantity(){
        return this.quantity;
    }

    public void setTypes(String types){
        this.types = types;
    }
    public String getTypes(){
        return this.types;
    }
}
