package demo.innerr;

public class Car {
    private String brand;
    private String model;
    private Engine engine;

    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.engine = new Engine(); // Creating an instance of the inner class
    }

    // Getter methods

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

  
    private class Engine {
        private int horsepower;

   
        public Engine() {
            this.horsepower = 0; 
        }

       

        public int getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(int horsepower) {
            this.horsepower = horsepower;
        }

       
        public void start() {
            System.out.println("Engine started. Vroom!");
        }
    }

    
    public void displayDetails() {
        System.out.println("Car Details: " + brand + " " + model);
        System.out.println("Engine Horsepower: " + engine.getHorsepower());
    }

    
    public static void main(String[] args) {
       
        Car myCar = new Car("Toyota", "Camry");

        
        myCar.engine.setHorsepower(200);

       
        myCar.engine.start();

        
        myCar.displayDetails();
    }
}
