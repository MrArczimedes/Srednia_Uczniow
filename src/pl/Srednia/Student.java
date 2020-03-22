package pl.Srednia;

import java.util.ArrayList;

public class Student {
    private String name;
    Subject Math;
    Subject English;
    Subject History;

    public Student(String name) {
        this.name = name;
        this.Math= new Subject("Matematyka");
        this.English = new Subject("Angielski");
        this.History = new Subject("Historia");
        Math.setGrades();
        English.setGrades();
        History.setGrades();
        avarageGrades();
    }
    public void avarageGrades(){
        int sumM = 0;
        int sumH = 0;
        int sumE = 0;
        ArrayList<Integer> avgM;
        ArrayList<Integer> avgH;
        ArrayList<Integer> avgE;
        avgM = Math.getGrades();
        avgH = History.getGrades();
        avgE = English.getGrades();
        for(Object gradesM : avgM){
            sumM += (int)gradesM;
        }
        for(Object gradesH : avgH){
            sumH += (int)gradesH;
        }
        for(Object gradesE : avgE){
            sumE += (int)gradesE;
        }
        double averageM = sumM/(avgM.size());
        double averageH = sumH/(avgH.size());
        double averageE = sumE/(avgE.size());
        System.out.println("Srednia ucznia " + this.name +" z " + Math.name + " to: "+ averageM + "\n"+
                                                          " z " + History.name + " to: "+ averageH + "\n"+
                                                          " z " + English.name + " to: "+ averageE + "\n"+
                "a srednia ogolna to: " + (averageE + averageH + averageM)/3);
    }

}
