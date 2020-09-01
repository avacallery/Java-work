package com.avacallery;

public class Main {

    // why do we put new classes in separate files and how does our parent class know how to use them?
    // // re-usability / bring in by folder or specific files using package
    // // bring classes into other programs easily
    // what are getters and setters?
    // // if public, you don't need getter/setter and instead use . notation
    // // getters are getting info from the class
    // // setters can change the attributes of the class based on private attributes
    // why public/private?
    // // there are public methods that allow the properties of classes to get/set
    // // public items can change by external objects
    // // private variables can be changed with a public setter protects the variable/ runs logic on variable's assignment to access "permission"
    // why do we declare new in main method?
    // // instantiation - create instance of that class (class is a blueprint, new () creates the instance)

    public static void main(String[] args) {
        Hatchback rental = new Hatchback("Subaru", "Impreza", 2016, "grey");
        Hatchback avaHatchback = new Hatchback("Subaru", "Impreza", 2020, "pink");
        rental.selectCar();
        avaHatchback.selectCar();
        avaHatchback.color = "maroon";
                // we can change color bc public variable
        rental.selectCar();
        avaHatchback.selectCar();
    }

}

    class Car {
            public String make;
            public String model;
            public int year;

            public Car(String make, String model, int year) {
                // this. refers to the class
                this.make = make;
                this.model = model;
                this.year = year;
        }

        public void selectCar() {
            System.out.println("You have selected the " + year +" "+ make +" "+ model+".");
        }

    }

    class Hatchback extends Car {
        public String color;
        public Hatchback(String make, String model, int year, String color) {
            super(make, model, year);
            this.color = color;
        }

    }

