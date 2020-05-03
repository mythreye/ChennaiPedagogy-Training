# INHERITANCE 

####  Introduction
---
It is always nice if we could reuse something that already exists rather than creating the same all over again and again. Java supports this concept. Java classes can be reused in several ways. This is basically done by creating new classes, reusing the properties of existing ones. The mechanism of deriving a new class from an old one is called Inheritance.

#### Background Information
---
Inheritance can be defined as the process where one class acquires the properties methods and fields
of another. The class which inherits the properties of other is known as subclass derivedclass, childclass and the class whose properties are inherited is known as superclass baseclass, parentclass. The idea behind inheritance is that you can create new classes that are built upon existing classes. When you
inherit from an existing class, you can reuse methods and fields of parent class and you can add new methods and
fields also. Inheritance represents the IS-A relationship, also known as parent-child relationship.

#### Problem Statement
---
One of the aims of object-oriented programming is to simplify the process of building software models of
real-world objects. Since real-world objects may be related to one another, an object-oriented language
must provide some mechanism for modeling such relationships.

####    Possible Technique to resolve this concern
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
#####   Type of Inheritance
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

![alt](https://www.tutorialride.com/images/cpp-inheritance-programs/multilevel-inheritance.jpeg)







