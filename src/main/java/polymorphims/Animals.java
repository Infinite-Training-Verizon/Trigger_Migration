package polymorphims;

import org.w3c.dom.ls.LSOutput;

public class Animals {
    public void animalSound() {
        System.out.println("Animal Sound");
    }
}
    class pig extends Animals {
        public void animalSound() {
            System.out.println("pig sound");
        }
            public pig(String name) {

                System.out.println("agian again" + name);
            }
        }
    class cat extends Animals {
        public void animalSound() {
            super.animalSound();
            System.out.println("cat sound");
        }
    }
    class main{
    public static void main(String[] args) {
    Animals animals = new Animals();
        Animals pig = new pig("shfkj");
        Animals cat = new cat();
        animals.animalSound();
        pig.animalSound();
        cat.animalSound();
    }
}
