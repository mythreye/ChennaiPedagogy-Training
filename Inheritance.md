# INHERITANCE 

##  Introduction
---
It is always nice if we could reuse something that already exists rather than creating the same all over again and again. Java supports this concept. Java classes can be reused in several ways. This is basically done by creating new classes, reusing the properties of existing ones. The mechanism of deriving a new class from an old one is called Inheritance.
## Background Information
---
Inheritance can be defined as the process where one class acquires the properties methods and fields
of another. The class which inherits the properties of other is known as subclass derivedclass, childclass and the class whose properties are inherited is known as superclass baseclass, parentclass. The idea behind inheritance is that you can create new classes that are built upon existing classes. When you
inherit from an existing class, you can reuse methods and fields of parent class and you can add new methods and
fields also. Inheritance represents the IS-A relationship, also known as parent-child relationship.
## Problem Statement
---
One of the aims of object-oriented programming is to simplify the process of building software models of
real-world objects. Since real-world objects may be related to one another, an object-oriented language
must provide some mechanism for modeling such relationships.
## Description of Problem Statement 

###   Type of Inheritance
1)  Single Inheritance.
2)  MultiLevel Inheritance.

#####   Single Inheritance
If a
class extends from only One  class then we call it a single
inheritance. The below flow diagram shows that class B
extends only one class which is A. Here A is a parent class of B and B would be a child class of A.

![alt](https://www.guru99.com/images/java/single_inheritance.png)

#####   MultiLevel Inheritance
Multilevel inheritance refers to a mechanism where one can inherit from a derived class,
thereby making this derived class the base class for the new
class. As you can see in below flow diagram C is subclass or
child class of B and B is a child class of A.

![alt](https://www.guru99.com/images/java/multilevel.png)
## Possible Technique to resolve the Problem
---
 'extends' is the keyword used to inherit the properties of a class.

    Sample Code:

    class Super
    {
        .....
        .....
    }
    class Sub extends Super
    {
        .....
        .....
    }
## Evaluation (Advantage/Disadvantages) 
---
The syntax for creating a subclass is simple. At the beginning of your class declaration, use the extends keyword, followed by the name of the class to inherit from:

    
    public class Bicycle 
    {
        ....
        ....
        ....
    }
    class RoadBike extends Bicycle 
    {
        // new fields and methods defining 
        // a mountain bike would go here
    }
    class HondaShineBike extends RoadBicycle 
    {
        // new fields and methods defining 
        // a mountain bike would go here
    }



These words would determine whether one object IS-A type of another. By using these keywords we can make one object acquire the properties of another object.

#### IS-A Relationship:
IS-A is a way of saying : This object is a type of that object. Let us see how the extends keyword is used to achieve inheritance.

Now based on the above example, In Object Oriented terms following are true:

Bicycle is the superclass of RoadBike class.
RoadBike is the superclass of HondaShineBike class.
HondaShineBike is a subclass of RoadBike therfore it is a subclass of BicycleWe

Now if we consider the IS-A relationship we can say:

RoadBike IS-A Bicycle
HondaShineBike IS-A RoadBike
Hence : HondaShineBike IS-A Bicycle as well

### Super Keyword:
1)   Super keyword can be used to refer immediate parent class instance variable.
2)   Super keyword can be used to invoke immediate parent class method.
3)   Super() can be used to invoke immediate parent class Constructor.
## Demo of the solution 
---
Java program to illustrate the  concept of inheritance 
    
    public class Bicycle 
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
		public void applyBrake(int decrement) 
		{ 
			speed -= decrement; 
		} 
        public void speedUp(int increment) 
		{ 
			speed += increment; 
		} 
          // toString() method to print info of Bicycle 
		public String toString()  
		{ 
			return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
		} 
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
        
		// the MountainBike subclass adds one more method 
		public void setHeight(int newValue) 
		{ 
			seatHeight = newValue; 
		}  
        public String toString() 
		{ 
			return (super.toString()+ 
                "\nseat height is "+seatHeight); 
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

### Output:
    No of gears are 3
    speed of bicycle is 100
    seat height is 25
## FAQ
---
## Reference Materials
---






