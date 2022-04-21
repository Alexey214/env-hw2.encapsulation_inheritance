package com.company;

public class Gryffindor extends Hogwarts {
    private String faculty = "Gryffindor";
    private int nobility;
    private int honor;
    private int bravery;

    static Gryffindor[] gryffindors = {new Gryffindor("Гарри Поттер", 50, 50, 50, 5, 5, 5),
            new Gryffindor("Гермиона Грейнджер", 80, 80, 80, 6, 7, 8),
            new Gryffindor("Рон Уизли", 20, 20, 20, 4, 5, 6),
    };

    public Gryffindor(String fullName, int witchcraft, int power, int transgression, int nobility, int honor, int bravery) {
        super(fullName, witchcraft, power, transgression);
        if (nobility >= 0 && nobility < 101 && honor >= 0 && honor < 101 && bravery >= 0 && bravery < 101) {
            this.nobility = nobility;
            this.honor = honor;
            this.bravery = bravery;
        } else {
            System.out.println("У ученика " + getFullName() + " значение свойств характера должно быть от \"0\" до \"100\"");
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void printAllInfo() {
        System.out.println("Полное имя: " + getFullName() + ", колдовство: " + getWitchcraft() + ", мощь: " + getPower() +
                ", трансгрессия: " + getTransgression() + ", благородство: " + nobility + ", честь: " + honor + ", храбрость: " + bravery);
    }

    public static String bestStudent(Gryffindor[] gryffindors) {
        int sum = 0;
        String name = null;
        for (Gryffindor gryffindors1 :
                gryffindors) {
            if (gryffindors1.getNobility() + gryffindors1.getHonor() + gryffindors1.getBravery() > sum) {
                sum = gryffindors1.getNobility() + gryffindors1.getHonor() + gryffindors1.getBravery();
                name = gryffindors1.getFullName();
            }
        }
        return name + " лучший Гриффиндорец. Сумма баллов составляет: " + sum;
    }
}

