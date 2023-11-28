package com.company.temp;

public class Temperature {
    private double tempValue;
    private char tempParameter;

    public Temperature() {
        this.tempValue = 0;
        this.tempParameter = 'C';
    }

    public Temperature(double tempValue) {
        this.tempValue = tempValue;
        this.tempParameter = 'C';
    }

    public Temperature(char tempParameter) {
        this.tempValue = 0;
        this.tempParameter = tempParameter;
    }

    public Temperature(double tempValue, char tempParameter) {
        this.tempValue = tempValue;
        this.tempParameter = tempParameter;
    }

    public double getTempValue() {
        return tempValue;
    }

    public void setTempValue(double tempValue) {
        this.tempValue = tempValue;
    }

    public char getTempParameter() {
        return tempParameter;
    }

    public void setTempParameter(char tempParameter) {
        this.tempParameter = tempParameter;
    }

    public double convertKtoC() {
        if (tempParameter == 'K') {
            return (5 * (tempValue - 32)) / 9;
        } else
            return tempValue;
    }

    public double convertCtoK() {
        if (tempParameter == 'C') {
            return (9 * (tempValue / 5)) + 32;
        } else
            return tempValue;
    }

    public void setTemperature(double tempValue, char tempParameter) {
        this.tempValue = tempValue;
        this.tempParameter = tempParameter;
    }
}
