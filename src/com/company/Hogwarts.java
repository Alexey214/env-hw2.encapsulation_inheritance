package com.company;

public class Hogwarts {
    private String fullName;
    private int witchcraft;
    private int power;
    private int transgression;

    public Hogwarts(String fullName, int witchcraft, int power, int transgression) {
        this.fullName = fullName;
        if (witchcraft >= 0 && witchcraft < 101 && power >= 0 && power < 101 && transgression >= 0 && transgression < 101) {
            this.witchcraft = witchcraft;
            this.power = power;
            this.transgression = transgression;
        } else {
            System.out.println("У ученика " + getFullName() + " значение характеристик должно быть от \"0\" до \"100\"");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Полное имя: " + fullName +
                ", колдовство: " + witchcraft +
                ", мощь: " + power +
                ", трансгрессия: " + transgression;
    }

    public void printAllInfo() {
        System.out.println("Полное имя: " + getFullName() + ", колдовство: " + getWitchcraft() + ", мощь: " + getPower() +
                ", трансгрессия: " + getTransgression());
    }

    public static String bestStudent(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        int hog1Summ = hogwarts1.getTransgression() + hogwarts1.getWitchcraft() + hogwarts1.getPower();
        int hog2Summ = hogwarts2.getTransgression() + hogwarts2.getWitchcraft() + hogwarts2.getPower();
        String win = null;
        if (hog1Summ > hog2Summ) {
            win = hogwarts1.fullName + ": лучший студент Хогвардс. Сумма баллов составляет: " + hog1Summ;
        } else {
            win = hogwarts2.fullName + ": лучший студент Хогвардс. Сумма баллов составляет: " + hog2Summ;

        }
        return win;
    }

}


