package by.academy.lesson7.exercise;
class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
public class Runner {
    public static void main(String[] args) {
       // Animal animal = ()-> System.out.println("Dog is eating");
                //new Animal(){
            //public void aet(){

          //  }
       // };
        //animal.eat();

       // Dog dog = new Dog();
      //  dog.eat();

      //  System.out.println(dog);
    }
}
