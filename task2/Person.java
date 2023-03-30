package task2;

public class Person implements Eat, Feed, Connection{
    private String name;



    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void eat() {
        System.out.println("Кушает");
    }

    @Override
    public void giveFood() {
        System.out.println("Положил еду кошки в миску");
    }

    @Override
    public void play() {
        System.out.println("Играет с кошкой");
    }

    @Override
    public void voice() {
        System.out.println("Позвал кошку: кис кис");;
    }
    
}
