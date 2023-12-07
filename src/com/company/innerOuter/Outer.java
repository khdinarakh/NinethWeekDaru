package com.company.innerOuter;

public class Outer {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public class Inner {
        public int increment() {
            return number++;
        }
    }
}
