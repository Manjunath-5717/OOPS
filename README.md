# Object-Oriented Programming (OOP) Concepts

## 📌 Introduction

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of **objects**, which contain data (variables) and methods (functions). It helps in organizing code, improving reusability, and making applications scalable.

---

## 🎯 Core OOP Concepts

### 1. Class

A **class** is a blueprint or template used to create objects.

```java
class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}
```

---

### 2. Object

An **object** is an instance of a class.

```java
Student s1 = new Student();
s1.name = "Rahul";
s1.age = 20;
s1.display();
```

---

### 3. Encapsulation

Encapsulation means **binding data and methods together** and restricting direct access using access modifiers.

```java
class Account {
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}
```

---

### 4. Inheritance

Inheritance allows one class to **acquire properties and methods of another class**.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

---

### 5. Polymorphism

Polymorphism means **many forms**.

#### Method Overloading (Compile-time)

```java
class MathUtil {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

#### Method Overriding (Run-time)

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
```

---

### 6. Abstraction

Abstraction means **hiding implementation details** and showing only essential features.

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
```

---

## 🧩 Additional Concepts

### Constructor

A constructor is used to initialize objects.

```java
class Car {
    String brand;

    Car(String b) {
        brand = b;
    }
}
```

---

### Interface

An interface is used to achieve full abstraction.

```java
interface Vehicle {
    void start();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts");
    }
}
```

---

## 🚀 Advantages of OOP

* Code reusability
* Better organization
* Easy maintenance
* Scalability
* Security through encapsulation

---

## 📚 Conclusion

OOP concepts are fundamental for modern programming and are widely used in languages like Java, C++, Python, and C#. Understanding these concepts is essential for building efficient and maintainable software.

---

## 👨‍💻 Author

Manjunath-5717
