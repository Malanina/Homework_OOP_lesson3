package task2;

 public class Cat extends Animal implements Fawn, Eat, Connection{
        public Cat(String name, String color, int satiation) {
            super(name, color, satiation);
        }
    
    
        @Override
        public void fawn() {
            System.out.println("Подошла и трется об ноги ");
        }
    
        @Override
        public void eat() {
            System.out.println("Ест");
        }
    
        @Override
        public void voice() {
            System.out.println("Говорит: мяу");
        }
        @Override
        public void play() {
            System.out.println("Играет с человеком");
        }

    }    
