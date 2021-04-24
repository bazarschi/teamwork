package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor("Vasile Pro", 'M', 40, "vasile@gmail.com");
        System.out.println(professor);

        List<Professor> professors = new ArrayList<>();

        Professor professor1 = new Professor("Valad", 'M', 45, "vlad@gmail.com");
        Professor professor2 = new Professor("Alina", 'F', 35, "alina@gmail.com");
        Professor professor3 = new Professor("Maria", 'F', 30, "sexy@gmail.com" );

        professors.add(professor);
        professors.add(professor1);
        professors.add(professor2);
        professors.add(professor3);

        System.out.println(professors);



        System.out.println(professor);


    }
}
