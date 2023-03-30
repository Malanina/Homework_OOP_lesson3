package task2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan");
        Cat cat = new Cat("Кнопка", "black", 6);
    
        person.voice();
        cat.fawn();
        System.out.println("Кошка сыта на " + cat.setSatiation(6));
        person.giveFood();
        person.voice();
        cat.eat();
        cat.voice();
        System.out.println("Кошка сыта на " + cat.setSatiation(10));
        person.play();
        cat.play();
    
    }

}
   
