package ru.javabegin.training.fastjava2.objects;

/**
 * Created by User on 17.09.2017.
 */
public class PC {

    private String name;
    private int numberOfDevices;

    public PC(String name, int numberOfDevices) {
        this.name = name;
        this.numberOfDevices = numberOfDevices;
        System.out.println("ololo");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfDevices() {
        return numberOfDevices;
    }

    public void setNumberOfDevices(int numberOfDevices) {
        this.numberOfDevices = numberOfDevices;
    }
}
