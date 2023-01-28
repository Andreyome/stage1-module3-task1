package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public List <String> boxingMethod(String name) {
        List <String> firstList = new ArrayList<>();
        firstList.add(name);
        List <String> secondList = new ArrayList<>();
        secondList.add(firstList.toString());
        return secondList;
    }

    //TODO: Refactor Method-2
    public  <T> Object genericMethod(T data) {
        return (T) data;
    }

    //TODO: Refactor Method-3
    public <T>void cloneMethod(List  consumer, List  producer) {
        consumer.addAll(producer);
    }

}
