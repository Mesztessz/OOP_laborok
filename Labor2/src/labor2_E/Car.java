package labor2_E;

public class Car {
    private String carBrand, carType;
    private int numberOfKilometers, numberOfPassengers, yearOfManufacture, speed;
    private FuelType fuel;
    private Color color;
    public Car(String carBrand, String carType, Color color, FuelType fuel, int numberOfKilometers, int numberOfPassengers, int yearOfManufacture, int speed){
        this.carBrand = carBrand;
        this.carType = carType;
        this.numberOfKilometers = numberOfKilometers;
        this.numberOfPassengers = numberOfPassengers;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
        this.fuel = fuel;
        this.color = color;
    }
    public Car(String carBrand, String carType, int fuel, boolean numberOfPassengers, int yearOfManufactue){
        this.carBrand = carBrand;
        this. carType = carType;
        this.speed = 0;
        this.numberOfKilometers = 0;
        this.yearOfManufacture = yearOfManufactue;
        if(numberOfPassengers){
            this.numberOfPassengers = 5;
        }
        if(!numberOfPassengers){
            this.numberOfPassengers = 2;
        }
        if(fuel <= 2 && fuel >=0){
            if (fuel == 0){
                this.fuel = FuelType.DIESEL;
            }
            if(fuel == 1){
                this.fuel = FuelType.PETROL;
            }
            if(fuel == 2){
                this.fuel = FuelType.GAS;
            }
        }
        else{
            this.fuel = FuelType.ELECTRIC;
        }
        if(carBrand.charAt(0) == 'G' || carBrand.charAt(0) == 'B' || carBrand.charAt(0) == 'W' || carBrand.charAt(0) == 'R'){
            if(carBrand.charAt(0) == 'G'){
                this.color = Color.GREEN;
            }
            if(carBrand.charAt(0) == 'B'){
                this.color = Color.Blue;
            }
            if(carBrand.charAt(0) == 'W'){
                this.color = Color.White;
            }
            if(carBrand.charAt(0) == 'R'){
                this.color = Color.RED;
            }
        }
        else{
            this.color = Color.Black;
        }


    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public int getNumberOfKilometers() {
        return numberOfKilometers;
    }

    public void setNumberOfKilometers(int numberOfKilometers) {
        this.numberOfKilometers = numberOfKilometers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeSpeed(int speedIndicator){
        if(speedIndicator < 0 && speed-speedIndicator < 0){
            System.out.println("Invalid speedIndicator\n");
        }
        else{
            speed = speed + speedIndicator;
        }
    }

    public void moveCar(int kilometerIndicator){
        if(kilometerIndicator < 0){
            System.out.println("Invalid kilometer number\n");
        }
        else{
            numberOfKilometers = numberOfKilometers + kilometerIndicator;
        }
    }

    public void resetMileage(){
        while(numberOfKilometers >= 200){
            numberOfKilometers -= 200;
        }
    }

    public String toString() {
        return "This car is a " + carBrand + " " + carType + " family " + fuel + " car which was\nmanufactured " +
                "in " + yearOfManufacture + ". It has " + color + " color and the number\nof kilometers traveled is: " + numberOfKilometers;
    }
}
