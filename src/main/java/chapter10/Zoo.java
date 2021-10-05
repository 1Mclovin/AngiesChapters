package chapter10;
/*
honestly i feel like polymorphism is kinda useless
 */
public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        // this is the polymorphism type

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();


    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("here is your kibble");
        }
        else if(animal instanceof Cat){
            System.out.println("here is your fish");
        }
    }

}
