package com.test;
interface IAnimal<T> {
   void breath();
   void set(T t);
   T get();
}
class Animal4<T> implements IAnimal<T>{
   T animal;
   @Override
   public void breath() {System.out.println("Animal breath");}

   @Override
   public void set(T t) {this.animal = t;}

   @Override
   public T get() {return this.animal;}
   
}
class Dog4{}
public class Test14 {
   public static void main(String[] args) {
      Animal4<Dog4> a = new Animal4<Dog4>();
      a.set(new Dog4());
      Dog4 a1 = a.get();
      a.breath();
   }

}