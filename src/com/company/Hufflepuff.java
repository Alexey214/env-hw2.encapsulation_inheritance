package com.company;

public class Hufflepuff extends Hogwarts {
    private String faculty = "Hufflepuff";
    private int industriousness;
    private int fidelity;
    private int honesty;

    static Hufflepuff[] hufflepuffs = {new Hufflepuff("Захария Смит", 51, 51, 51, 5, 5, 5),
            new Hufflepuff("Седрик Диггори", 81, 81, 81, 6, 7, 9),
            new Hufflepuff("Джастин Финч-Флетчли", 21, 21, 21, 4, 5, 6),
    };

    public Hufflepuff(String fullName, int witchcraft, int power, int transgression, int industriousness, int fidelity, int honesty) {
        super(fullName, witchcraft, power, transgression);
        if (industriousness >= 0 && industriousness < 101 && fidelity >= 0 && fidelity < 101 && honesty >= 0 && honesty < 101) {
            this.industriousness = industriousness;
            this.fidelity = fidelity;
            this.honesty = honesty;
        } else {
            System.out.println("У ученика " + getFullName() + " значение свойств характера должно быть от \"0\" до \"100\"");
        }
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void printAllInfo() {
        System.out.println("Полное имя: " + getFullName() + ", колдовство: " + getWitchcraft() + ", мощь: " + getPower() +
                ", трансгрессия: " + getTransgression() + ", трудолюбие" + industriousness + ", верность: " + fidelity +
                ", честность: " + honesty);
    }

    public static String bestStudent(Hufflepuff[] hufflepuffs) {
        int sum = 0;
        String name = null;
        for (Hufflepuff hufflepuffs1 :
                hufflepuffs) {
            if (hufflepuffs1.getIndustriousness() + hufflepuffs1.getFidelity() + hufflepuffs1.getHonesty() > sum) {
                sum = hufflepuffs1.getIndustriousness() + hufflepuffs1.getFidelity() + hufflepuffs1.getHonesty();
                name = hufflepuffs1.getFullName();
            }
        }
        return name + " лучший Пуффендуевец. Сумма баллов составляет: " + sum;
    }

}
