import java.io.*;
import java.text.DecimalFormat;

class Lab13B {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int age;
    double weight;
    String name, furColor, breed;

    System.out.println("You are about to create a dog.");
    
    System.out.print("How old is the dog: ");
    age = Integer.parseInt(br.readLine());

    System.out.print("How much does the dog weigh: ");
    weight = Double.parseDouble(br.readLine());

    System.out.print("What is the dog's name: ");
    name = br.readLine();

    System.out.print("What color is the dog: ");
    furColor = br.readLine();

    System.out.print("What breed is the dog: ");
    breed = br.readLine();

    Dog dog = new Dog(age, weight, name, furColor, breed);

    System.out.println("\n" + dog + "\n");

    dog.bark();

    System.out.print(dog.name + " is hungry, how much should he eat: ");
    dog.eat(Double.parseDouble(br.readLine()));

    System.out.print(dog.name + " isn't a very good name. What should they be renamed to: ");
    dog.rename(br.readLine());

    System.out.print("\n" + dog);
  }
}

interface dogable {
  public void bark();
  public void rename(String name);
  public void eat(double num);
}

class Dog implements dogable {
  private DecimalFormat df = new DecimalFormat("0.#");

  public int age;
  public double weight;
  public String name, furColor, breed;
  
  public Dog(int age, double weight, String name, String furColor, String breed) {
    this.age = age;
    this.weight = weight;
    this.name = name;
    this.furColor = furColor;
    this.breed = breed;
  }

  public void bark() {
    System.out.println("Woof! Woof!");
  }

  public void rename(String name) {
    this.name = name;
  }

  public void eat(double num) {
    this.weight += num;
  }

  public String toString() {
    return String.format("%s is a %d year old %s %s that weighs %s lbs.", name, age, furColor, breed, df.format(weight));
  }
}