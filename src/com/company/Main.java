package com.company;

import static com.company.Gryffindor.*;
import static com.company.Hufflepuff.*;
import static com.company.Ravenclaw.*;
import static com.company.Slytherin.*;

public class Main {

    public static void main(String[] args) {

        gryffindors[0].printAllInfo();
        hufflepuffs[0].printAllInfo();
        ravenclaws[0].printAllInfo();
        slytherins[0].printAllInfo();
        System.out.println();

        System.out.println(bestStudent(gryffindors));
        System.out.println(bestStudent(hufflepuffs));
        System.out.println(bestStudent(ravenclaws));
        System.out.println(bestStudent(slytherins));
        System.out.println();

        System.out.println(bestStudent(gryffindors[0], slytherins[0]));

    }
}
