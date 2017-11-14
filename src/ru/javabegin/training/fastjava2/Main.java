package ru.javabegin.training.fastjava2;

import ru.javabegin.training.fastjava2.objects.Camry;
import ru.javabegin.training.fastjava2.objects.Processor;
import ru.javabegin.training.fastjava2.objects.Rav4;
import ru.javabegin.training.fastjava2.objects.VideoCard;

public class Main {

    public static void main(String[] args) {

        Rav4 rav4 = new Rav4("50", 40);
        Processor processor = new Processor("Porevo", 1);
        VideoCard videoCard = new VideoCard("Her", 2);
    }
}
