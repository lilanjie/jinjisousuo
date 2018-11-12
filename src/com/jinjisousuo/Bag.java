package com.jinjisousuo;

public class Bag {

    private int currentWeight;

    private int currentValue;

    private int totalWeight;

    public Bag(int totalWeight){
        this.totalWeight = totalWeight;
        this.currentValue= 0 ;
        this.currentWeight = 0;
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
