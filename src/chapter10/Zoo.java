package chapter10;

public class Zoo {
    public static void main(String[] args){
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog(); // sasha is a type of animal, but instantiation of a dog
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat(); // I changed sasha's type from a dog instantiation to a cat.
        sasha.makeSound();
        ((Cat) sasha).scratch(); // sasha has been cast to Cat - this is type casting
        feed(sasha);
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("here's your dog food");
        } else if (animal instanceof Cat) {
           System.out.println("here's your cat food");
        }
    }
    /*
    Polymorphism Key Points
    Type vs Instance
    An object can have a superclass type, and a subclass type.
    Access
    Polymorphic objects can only access the methods of their type (not their instance).
    Casting is required in order to access the methods of their instance.
    Overridden Methods
    If a method is overridden by the subclass, the polymorphic object will execute the overridden method at runtime.
    instanceof Operator
    The instanceof operator is used to determine if an object is an instance of a certain class.
     */
}
