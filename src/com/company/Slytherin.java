package com.company;

public class Slytherin extends Hogwarts {
    private String faculty = "Slytherin";
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    static Slytherin[] slytherins = {new Slytherin("Драко Малфой", 53, 53, 53, 5, 5, 5, 5, 5),
            new Slytherin("Грэхэм Монтегю", 83, 83, 83, 6, 7, 8, 6, 7),
            new Slytherin("Грегори Гойл", 23, 230, 23, 4, 5, 6, 4, 3),
    };

    public Slytherin(String fullName, int witchcraft, int power, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, witchcraft, power, transgression);
        if (cunning >= 0 && cunning < 101 && determination >= 0 && determination < 101 && ambition >= 0 && ambition < 101 && resourcefulness >= 0 && resourcefulness < 101 && lustForPower >= 0 && lustForPower < 101) {
            this.cunning = cunning;
            this.determination = determination;
            this.ambition = ambition;
            this.resourcefulness = resourcefulness;
            this.lustForPower = lustForPower;
        } else {
            System.out.println("У ученика " + getFullName() + " значение свойств характера должно быть от \"0\" до \"100\"");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void printAllInfo() {
        System.out.println("Полное имя: " + getFullName() + ", колдовство: " + getWitchcraft() + ", мощь: " + getPower() +
                ", трансгрессия: " + getTransgression() + ", хитрость: " + cunning + ", решительность: " + determination +
                ", амбициозность: " + ambition + ", находчивость: " + resourcefulness + ", жажда власти" + lustForPower);
    }

    public static String bestStudent(Slytherin[] slytherins) {
        int sum = 0;
        String name = null;
        for (Slytherin slytherins1 :
                slytherins) {
            if (slytherins1.getCunning() + slytherins1.getDetermination() + slytherins1.getAmbition() + slytherins1.getResourcefulness() + slytherins1.getLustForPower() > sum) {
                sum = slytherins1.getCunning() + slytherins1.getDetermination() + slytherins1.getAmbition() + slytherins1.getResourcefulness() + slytherins1.getLustForPower();
                name = slytherins1.getFullName();
            }
        }
        return name + " лучший Слизериновец. Сумма баллов составляет: " + sum;
    }
}
