package Users;

import LibraryServices.Incident;

import java.util.ArrayList;

public class Student
{
    private String name;
    private int id;
    private int score;
    private ArrayList<Incident> incidents;


    public Student(String pName, int pID)
    {
        this.name = pName;
        this.id = pID;
        this.score = 100;
    }

    public void addIncident(String pSummary)
    {
        incidents.add(new Incident(pSummary));
    }


}