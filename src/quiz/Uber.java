/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Luis-R
 */
public class Uber {

    int age;
    String color;
    int mileage;
    boolean disponibility;
    int cash;

    public Uber(int age, String color, int mileage, int cash) {
        this.age = age;
        this.color = color;
        this.mileage = mileage;
        this.cash = cash;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isDisponibility() {
        int random = (int) (Math.random() * 2 + 0);
        if (random == 0) {
            disponibility = false;

        } else if (random == 1) {

            disponibility = true;
        }

        return disponibility;
    }

    public void setDisponibility(boolean disponibility) {
        this.disponibility = disponibility;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

}
