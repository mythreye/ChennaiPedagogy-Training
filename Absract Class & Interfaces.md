# Abstract Class & Interface

##  Introduction
---
Imagine a blueprint of a house where the house is drawn in completely but there is a big empty square where the garage will go. We know there will be a garage but we don’t know what it will look like. Somebody else will have to take a copy of our blueprint and draw in the garage. In fact several different people may take copies of our blueprint and draw in different types of garage. 
Houses built using these blueprints will all be recognizable variants of our house; the front door, the room layouts and the windows will all be identical, however the garages will all be different.

## Background Information
---

Much like the blueprints above our classes will define some methods completely, and these method implementations will be the same in derived class. The class will also define only the signature for other methods, the method implementations for these methods will vary in the implementing classes.The class that contains the method only with signature is called partial class.An implementing class of an this class is commonly referred to as a concrete class.

## Problem Statement
---
Lets say we have a class Animal that has a method sound() and the subclasses(see inheritance) of it like Dog, Lion, Horse, Cat etc. Since the animal sound differs from one animal to another, there is no point to implement this method in parent class. This is because every child class must difine this method to give its own implementation details, like Lion class will say “Roar” in this method and Dog class will say “Woof”.

## Description of Problem Statement 
---
Consider the following class hierarchy consisting of a Shape class which is inherited by three classes Rectangle, Circle, and Triangle. The Shape class is created to save on common attributes and methods shared by the three classes Rectangle, Circle, and Triangle. calculateArea() is one such method shared by all three child classes and present in Shape class.
![alt](https://www.guru99.com/images/uploads/2012/06/java-abstract-classes.jpg)

## Possible Technique to solve the Problem
---
 The following problem can be solved by using
 ####    Abstract Class:

An abstract class is a class that is declared abstract.Abstract classes cannot be instantiated, but they can be subclassed. An abstract class may have static fields and static methods.When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class. However, if it does not, then the subclass must also be declared abstract.

Consider using abstract classes if any of these statements apply to your situation:

1)  You want to share code among several closely related classes.
2)  You expect that classes that extend your abstract class have many common methods or fields or require access modifiers other than public (such as protected and private).
3)  You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.
 
#### Interface
An interface can have methods and variables just like the class but the methods declared in interface are by default abstract (only method signature, no body, see: Java abstract method). Also, the variables declared in an interface are public, static & final by default. Since methods in interfaces do not have body, they have to be implemented by the class before you can access them. The class that implements interface must implement all the methods of that interface.

## Evaluation (Advantage/Disadvantages) 

|Abstract Class|Iterface|  
|:---|:---|  
|Abstract class provide both methods with and without other methods implementations for subclasses to use|Interfaces are used to define contract for the subclasses|
|Subclasses use extends keyword to extend an abstract class|subclasses use implements keyword to implement interfaces 
|Abstract classes methods can have access modifiers as public, private, protected|Interface methods are implicitly public and abstract|
|A subclass can extend only one abstract class|A subclass can implement multiple interfaces|
|The sub class need to provide implementation of all the declared methods in the abstract class unless the subclass is also an abstract class|It is a contract and the implementing class should provide implementation for all the methods declared in the interface.|
|Abstract classes can have methods with implementation |From JAVA 8 we have default and static methods can have implementation.If a method is not marked with any access specifier then it will be trated as abstract and will not have implementatio|

## Demo of the solution 
---

#### Abstract Class
Java program to illustrate the  concept of Abstract Class
    
    public abstract  class Bicycle 
    {
        // the Bicycle class has two fields 
		public int gear; 
		public int speed; 
          
		// the Bicycle class has one constructor 
		public Bicycle(int gear, int speed) 
		{ 
			this.gear = gear; 
			this.speed = speed; 
		} 
          
		// the Bicycle class has three methods 
		public abstract void applyBrake(int decrement);
        public abstract void speedUp(int increment);
    }
    class MountainBike  extends Bicycle 
    {
         // the MountainBike subclass adds one more field 
		public int seatHeight; 
		// the MountainBike subclass has one constructor 
		public MountainBike(int gear,int speed, int startHeight) 
		{ 
			// invoking base-class(Bicycle) constructor 
			super(gear, speed); 
			seatHeight = startHeight; 
		}
        public void applyBrake(int decrement) 
		{ 
			speed -= decrement; 
		} 
        public void speedUp(int increment) 
		{ 
			speed += increment; 
		}
    }
    public class Test  
    { 
		public static void main(String args[])  
		{ 
          
			MountainBike mb = new MountainBike(3, 100, 25); 
			System.out.println(mb.toString()); 
        } 
	}

##### Output:
    No of gears are 3
    speed of bicycle is 100
    seat height is 25

#### Interface
Java program to illustrate the  concept of Interface
    interface Bank
    {  
    float rateOfInterest();  
    }  
    class SBI implements Bank
    {  
        public float rateOfInterest()
        {
            return 9.15f;
        }  
    }  
    class PNB implements Bank
    {  
        public float rateOfInterest()
        {   
            return 9.7f;
        }  
    }
    class TestInterface2
    {  
        public static void main(String[] args)
        {  
            Bank b=new SBI();  
            System.out.println("ROI: "+b.rateOfInterest());  
        }
    }

  ##### Output:
  ROI: 9.15

  ## FAQ
---
## Reference Materials
---
