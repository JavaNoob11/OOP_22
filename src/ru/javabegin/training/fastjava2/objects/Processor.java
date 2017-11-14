package ru.javabegin.training.fastjava2.objects;

/**
 * Created by User on 17.09.2017.
 */
public class Processor extends PC {

    public Processor(String name, int numberOfDevices) {
        super(name, numberOfDevices);
        System.out.println("processor");
    }
}
