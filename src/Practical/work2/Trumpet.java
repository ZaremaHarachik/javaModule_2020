package Practical.work2;

import java.util.Objects;

public class Trumpet implements Instrument{
    private int diameter;

    public Trumpet() {
    }

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumpet trumpet = (Trumpet) o;
        return diameter == trumpet.diameter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter);
    }

    @Override
    public void play() {
        System.out.println("Plaing a trumpet with"+getDiameter());
    }


    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }
}
