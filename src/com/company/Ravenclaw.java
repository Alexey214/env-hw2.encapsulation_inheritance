package com.company;

public class Ravenclaw extends Hogwarts {
    private String faculty = "Ravenclaw";
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    static Ravenclaw[] ravenclaws = {new Ravenclaw("Чжоу Чанг", 52, 52, 52, 5, 5, 5, 2),
            new Ravenclaw("Падма Патил", 82, 82, 82, 6, 7, 8, 3),
            new Ravenclaw("Маркус Белби", 22, 22, 22, 4, 5, 6, 4),
    };

    public Ravenclaw(String fullName, int witchcraft, int power, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(fullName, witchcraft, power, transgression);
        if (mind >= 0 && mind < 101 && wisdom >= 0 && wisdom < 101 && wit >= 0 && wit < 101 && creativity >= 0 && creativity < 101) {
            this.mind = mind;
            this.wisdom = wisdom;
            this.wit = wit;
            this.creativity = creativity;
        } else {
            System.out.println("У ученика " + getFullName() + " значение свойств характера должно быть от \"0\" до \"100\"");
        }
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void printAllInfo() {
        System.out.println("Полное имя: " + getFullName() + ", колдовство: " + getWitchcraft() + ", мощь: " + getPower() +
                ", трансгрессия: " + getTransgression() + ", ум: " + mind + ", мудрость: " + wisdom + ", остроумие: " + wit +
                ", творчество: " + creativity);
    }

    public static String bestStudent(Ravenclaw[] ravenclaws) {
        int sum = 0;
        String name = null;
        for (Ravenclaw ravenclaws1 :
                ravenclaws) {
            if (ravenclaws1.getMind() + ravenclaws1.getWisdom() + ravenclaws1.getWit() + ravenclaws1.getCreativity() > sum) {
                sum = ravenclaws1.getMind() + ravenclaws1.getWisdom() + ravenclaws1.getWit() + ravenclaws1.getCreativity();
                name = ravenclaws1.getFullName();
            }
        }
        return name + " лучший Когтеврановец. Сумма баллов составляет: " + sum;
    }
}
