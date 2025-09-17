package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    public String startEngine() {
        String msg = "Car: the car's engine is starting";
        System.out.println(msg);
        return msg;
    }

    public String accelerate() {
        String msg = "Car: the car is accelerating";
        System.out.println(msg);
        return msg;
    }

    public String brake() {
        String msg = "Car: the car is braking";
        System.out.println(msg);
        return msg;
    }
}
