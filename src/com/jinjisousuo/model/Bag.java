package com.jinjisousuo.model;

import java.util.HashSet;
import java.util.Set;

public class Bag {

    private int currentWeight;

    private int currentValue;

    private int totalWeight;

    private Set<Good> goods = new HashSet<>();

    public Bag(int totalWeight){
        this.totalWeight = totalWeight;
        this.currentValue= 0 ;
        this.currentWeight = 0;
    }

    public boolean canAdd(Good good){
        return !goods.contains(good) && currentWeight + good.getWeight() < totalWeight;
    }

    public boolean contains(Good good){
        return goods.contains(good);
    }

    public void addGood(Good good){
        goods.add(good);
        currentValue += good.getValue();
        currentWeight += good.getWeight();
    }

    public void removeGood(Good good){
        goods.remove(good);
        currentValue -= good.getValue();
        currentWeight -= good.getWeight();
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }
}
