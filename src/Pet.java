/**
 * my class for the description of 2 pets
 */
public class Pet {

    //what type of animal it is
    private String type;

    //how old the animal is
    private int age;


    public Pet(String type, int age){

        this.type = type;
        this.age = age;
    }

    public void setAge(int age){
        if (age >= this.age){
            this.age = age;
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setType(String type){
        this.type = type;

    }

    public String getType(){
        return this.type;

    }



}
