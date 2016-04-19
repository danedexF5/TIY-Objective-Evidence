/**
 * my main method
 */
public class Main {

    public static void main(String[] args){
        //my house
        House myHouse;
        //your house
        House yourHouse;

        //creating an object
        myHouse = new House("name", "color", 100000, "neighborhood", "state");
        //creating another object
        yourHouse = new House("name", "color", 200000, "neighborhood", "state");

        /**
         * class details/variables of the house
         */
        myHouse.setName("Durham House");
        myHouse.setColor("blue");

        myHouse.setNeighborhood("Cleveland Holloway");
        myHouse.setState("NC");

        myHouse.setValue(120000);

        System.out.println("My " + myHouse.getName() + " that is " + myHouse.getColor() + " and that is " + myHouse.getValue() + " is located in ");
        System.out.println(myHouse.getNeighborhood() + " in " + myHouse.getState() + ".");

        yourHouse.setName("Charleston House");
        yourHouse.setColor("red");

        yourHouse.setNeighborhood("Downtown");
        yourHouse.setState("SC");

        yourHouse.setValue(250000);

        System.out.println("Your " + yourHouse.getName() + " that is " + yourHouse.getColor() + " and that is " + yourHouse.getValue());
        System.out.println(" is located in " + yourHouse.getNeighborhood() + " in " + yourHouse.getState() + ".");

        /**
         * changing the value of my house
         */
        //myHouse.value = 700000;

        System.out.println("My " + myHouse.getName() + " that is " + myHouse.getColor() + " and that is " + myHouse.getValue() + " is located in ");
        System.out.println(myHouse.getNeighborhood() + " in " + myHouse.getState() + ".");


        Car myCar;
        Car yourCar;

        myCar = new Car(3, "Japan");
        yourCar = new Car(3, "USA");

        myCar.setCountry("Japan");
        myCar.setQuantity(3);

        System.out.println("My car is from " + myCar.getCountry() + " and I have had " + myCar.getQuantity() + " of them previously" + ".");

        yourCar.setCountry("USA");
        yourCar.setQuantity(3);

        System.out.println("Your car is from " + yourCar.getCountry() + yourCar.getQuantity() + ".");

        Pet myPet;
        Pet yourPet;

        myPet = new Pet("dog", 6);
        yourPet = new Pet("cat", 9);

        myPet.setType("dog");
        myPet.setAge(6);

        System.out.println("My pet is a " + myPet.getType() + " and it is " + myPet.getAge() + " years old.");

        yourPet.setType("cat");
        yourPet.setAge(9);

        System.out.println("Your pet is " + yourPet.getAge() + " years old and it is a " + yourPet.getType() + ".");

        Bike myBike;
        Bike yourBike;

        myBike = new Bike("green", 10);
        yourBike = new Bike("yellow", 12);

        myBike.setSpeeds (11);
        myBike.setColor("pink");

        System.out.println("My bike is " + myBike.getColor() + " and has " + myBike.getSpeeds() + " speeds.");

        /**
         * changing state of pet type
         */
        myPet.setType("Bear");

        System.out.println("Your pet is a " + yourPet.getType() + " that is " + yourPet.getAge() + " years old.");

        yourBike.setSpeeds(15);
        yourBike.setColor("navy blue");

        System.out.println("Your bike is " + yourBike.getColor() + " and has " + yourBike.getSpeeds() + " speeds.");

        Screwdriver myScrewdriver;
        Screwdriver yourScrewdriver;

        myScrewdriver = new Screwdriver(3, "Flathead");
        yourScrewdriver = new Screwdriver(1, "Phillips");

        myScrewdriver.setQuantity(3);
        myScrewdriver.setTypes("Flathead");

        System.out.println("I have " + myScrewdriver.getQuantity() + " " + myScrewdriver.getTypes() + " screwdrivers.");

        yourScrewdriver.setQuantity(1);
        yourScrewdriver.setTypes("Phillips");

        System.out.println("You have " + yourScrewdriver.getQuantity() + " " + yourScrewdriver.getTypes() + " screwdriver.");

        /**
         * changing the color of my bike
         */


        System.out.println("My bike is " + yourBike.getColor() + " and has " + yourBike.getSpeeds() + " speeds.");

        /**
         * changing my screwriver quantity
         */
        myScrewdriver.setQuantity(2);

        System.out.println("I have " + myScrewdriver.getQuantity() + " " + myScrewdriver.getTypes() + " screwdrivers.");



    }
}
