package zackstudies;

import java.util.ArrayList;
import java.util.Collections;

public class Listtest {

    public static void main(String[] args) {
        String aula1 = "Knowing Lists";
        String aula2 = "Modeling Class";
        String aula3 = "Working on Courses and Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);


        aulas.remove(0);
        System.out.println(aulas);

        for (String clas : aulas) {
            System.out.println("Class: "+ clas);
        }

        String firstClass = aulas.get(0);
        System.out.println("The first clas is " + firstClass);

        for (int i = 0; i < aulas.size(); i++){
            System.out.println("class :" + aulas.get(i));
        }
        System.out.println(aulas.size());

        aulas.forEach(term -> {
            System.out.println("percorrendo:");
            System.out.println("Aula :" + aulas);
        });

        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas); // alphabetic





    }

}
