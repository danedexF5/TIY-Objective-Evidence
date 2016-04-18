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
        myHouse = new House();
        //creating another object
        yourHouse = new House();

        /**
         * class details/variables of the house
         */
        myHouse.name = "Durham House";
        myHouse.color = "blue";
        myHouse.value = 500000.00;
        myHouse.neighborhood = "Cleveland Holloway";
        myHouse.state = "NC";

        System.out.println("My " + myHouse.name + " that is " + myHouse.color + " and that is " + myHouse.value + " is located in ");
        System.out.println(myHouse.neighborhood + " in " + myHouse.state + ".");

        yourHouse.name = "Charleston House";
        yourHouse.color = "red";
        yourHouse.value = 600000.00;
        yourHouse.neighborhood = "Downtown";
        yourHouse.state = "SC";

        System.out.println("Your " + yourHouse.name + " that is " + yourHouse.color + " and that is " + yourHouse.value);
        System.out.println(" is located in " + yourHouse.neighborhood + " in " + yourHouse.state + ".");

        /**
         * changing the value of my house
         */
        myHouse.value = 700000.00;

        System.out.println("My " + myHouse.name + " that is " + myHouse.color + " and that is " + myHouse.value + " is located in ");
        System.out.println(myHouse.neighborhood + " in " + myHouse.state + ".");


        Car myCar;
        Car yourCar;

        myCar = new Car();
        yourCar = new Car();

        myCar.color = "black";
        myCar.country = "Japan";

        System.out.println("My car " + " is " + myCar.color + " and is from " + myCar.country + ".");

        /**
         *changing state of car color
         */
        myCar.color = "Orange";

        System.out.println("My car " + " is " + myCar.color + " and is from " + myCar.country + ".");

        yourCar.color = "white";
        yourCar.country = "USA";

        System.out.println("Your car is " + yourCar.color + " and is from " + yourCar.country + ".");

        Pet myPet;
        Pet yourPet;

        myPet = new Pet();
        yourPet = new Pet();

        myPet.type = "dog";
        myPet.size = "very big";

        System.out.println("My pet is a " + myPet.size + " " + myPet.type + ".");

        yourPet.type = "cat";
        yourPet.size = "tiny";

        System.out.println("Your pet is a " + yourPet.size + " " + yourPet.type + ".");

        Bike myBike;
        Bike yourBike;

        myBike = new Bike();
        yourBike = new Bike();

        myBike.color = "green";
        myBike.speeds = 10;

        System.out.println("My bike is " + myBike.color + " and has " + myBike.speeds + " speeds.");

        /**
         * changing state of pet type
         */
        myPet.type = "Bear";

        System.out.println("Your pet is a " + yourPet.size + " " + yourPet.type + ".");

        yourBike.color = "yellow";
        yourBike.speeds = 12;

        System.out.println("Your bike is " + yourBike.color + " and has " + yourBike.speeds + " speeds.");

        Screwdriver myScrewdriver;
        Screwdriver yourScrewdriver;

        myScrewdriver = new Screwdriver();
        yourScrewdriver = new Screwdriver();

        myScrewdriver.quantity = 3;
        myScrewdriver.types = "Flathead";

        System.out.println("I have " + myScrewdriver.quantity + " " + myScrewdriver.types + " screwdrivers.");

        yourScrewdriver.quantity = 1;
        yourScrewdriver.types = "Phillips";

        System.out.println("You have " + yourScrewdriver.quantity + " " + yourScrewdriver.types + " screwdriver.");

        /**
         * changing the color of my bike
         */
        yourBike.color = "Baby Blue";

        System.out.println("My bike is " + yourBike.color + " and has " + yourBike.speeds + " speeds.");

        /**
         * changing my screwriver quantity
         */
        myScrewdriver.quantity = 2;

        System.out.println("I have " + myScrewdriver.quantity + " " + myScrewdriver.types + " screwdrivers.");



    }
}
