package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
        this.name = "Unknown";
        this.description = "No description";
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("CarSkeleton engine starting");
    }

    public void drive() {
        runEngine();
        System.out.println("CarSkeleton is driving");
    }

    protected void runEngine() {
        System.out.println("CarSkeleton engine is running");
    }

    public void printType() {
        System.out.println("Class type: " + getClass().getSimpleName());
    }
}
