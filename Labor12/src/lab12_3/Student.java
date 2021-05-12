package lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student {
    private int ID;
    private String firstname;
    private String lastname;
    private double matek;
    private double magyar;
    private double roman;
    private double atlag;

    public Student(int ID, String lastname, String firstname) {
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getID() {
        return ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getMatek() {
        return matek;
    }

    public void setMatek(double matek) {
        this.matek = matek;
    }

    public double getMagyar() {
        return magyar;
    }

    public void setMagyar(double magyar) {
        this.magyar = magyar;
    }

    public double getRoman() {
        return roman;
    }

    public void setRoman(double roman) {
        this.roman = roman;
    }

    public void setAtlag(){
        this.atlag = (this.magyar + this.roman + this.matek)/3;
    }

    public double getAtlag() {
        return atlag;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}
