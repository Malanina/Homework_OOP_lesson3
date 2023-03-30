package task2;

public abstract class Animal implements Comparable<Animal>{
    private String name;
    private String color;
    private int satiation;


    public int getSatiation() {
        return satiation;
    }

    public int setSatiation(int satiation) {
        this.satiation = satiation;
        return satiation;
    }

    public Animal(String name, String color, int satiation) {
        this.name = name;
        this.color = color;
        this.satiation = satiation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public int compareTo(Animal o) {
        return this.getSatiation() - o.getSatiation();
    }
}