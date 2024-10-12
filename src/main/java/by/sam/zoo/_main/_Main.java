package by.sam.zoo._main;

import by.sam.zoo.entity.Tiger;
import by.sam.zoo.events.EventMaker;

import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
    Tiger tiger = new Tiger();
        EventMaker eventMaker = new EventMaker();
        eventMaker.startSimulation(tiger);

    }
}