// Class: a blueprint for how a data structure should function
// Constructor: instructs the class to set up the initial state of an object
// Object: instance of a class that stores the state of a class
// Method: set of instructions that can be called on an object
// Parameter: values that can be specified when creating an object or calling a method
// Return value: specifies the data type that a method will return after it runs
// Inheritance: allows one class to use functionality defined in another class

class Dog extends Animal{

  int age;
  
  // this is constructor
  // same thing in python == __init__()
	public Dog(int dogsAge) {
    age = dogsAge;
    
  }
  
  // this is method
  public void bark() {
    System.out.println("Woof!");
    
  }
  
  public void run(int feet) {
   	System.out.println("Your dog ran " + feet + " feet!");
  }
  
  public int getAge() {
    return age;
  }

	public static void main(String[] args) {
		Dog spike = new Dog(1);
		spike.bark();
    spike.run(500);
    int spikeAge = spike.getAge();
    System.out.println(spikeAge);
    spike.checkStatus();
  }

}

class Animal {

  public void checkStatus() {

    System.out.println("Your pet is healthy and happy!");

  }
}