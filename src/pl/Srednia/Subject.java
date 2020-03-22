package pl.Srednia;

import java.util.ArrayList;
import java.util.Scanner;

public class Subject {
    public String name;
    ArrayList<Integer> grades = new ArrayList();

    public Subject(String name) {
        this.name = name;
    }
    public void setGrades(){
        System.out.println("Jesteś w przedmiocie: " + this.name);
        System.out.println("Wpisz oceny, aby zakonczyc wpisz \"exit\"");
        Scanner myScanner = new Scanner(System.in);
        boolean koniec = false;
        while(!myScanner.hasNext("exit")) {
            int x = myScanner.nextInt();
            if(x >= 1 && x <= 6){
            this.grades.add(x);
            }
            else {
                System.out.println("Ta ocena nie jest wlasciwa");
            }

        }
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
