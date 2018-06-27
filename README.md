# SOLID design principles

This repository contains examples of the five SOLID design principles of object-oriented programming. The examples are written in Java. Each example has a "good" and "bad" version to demonstrate adherence to and violation of the principle, respectively.

- Single Responsibility Principle
- Open/Closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle

Based on work originally found at https://github.com/mikeknep/SOLID.


# Single Responsibility Principle

**Every class should have a single responsibility. There should never be more than one reason for a class to change.**

This example is derived from a Tic Tac Toe game. The bad example provides a generic Board class that does board-related things--it stores the values of spots on the board, returns the board's rows, and prints the board out to the screen. This approach reminds me of models in many Rails apps. On the surface, everything seems legitimately related to a real-world Board object, but the Single Responsibility Principle tells us that this class is actually handling far too many responsibilities.

Consider the Board class in the "good" example. The only thing it is responsible for is knowing the values of its spots. It is entirely unconcerned with how those spots are being manipulated per the rules of Tic Tac Toe (rows, columns, diagonals) or displayed to the user (in a console, on the web, etc.). The BoardShaper and BoardPresenter classes are similarly focused on specific tasks. They are also only passed attributes they need; for example, BoardShaper objects are initialized with only a size (they don't need the whole board).


# Open/Closed Principle

**Software entitites should be open for extension, but closed for modification**

I find the Strategy Pattern a great demonstration of the open/closed principle. Notice how in the bad example, any time we want to add a new style of greeting, we have to change the Greeter class to accept a new type of personality. We don't want to have to modify our existing, working code to add something new. Instead, as demonstrated in the good example, we have a high-level Greeter class that is instantiated with some Personality... we don't know which yet, just that it will be some object that implements the Personality interface. Now we can add new objects like FormalPersonality, CasualPersonality, and IntimatePersonality, and just make sure they correctly implement the Personality interface (in this case that means they must have a `greet()` method). The Greeter class is now open for future extension, while remaining closed for modification.                                            


# Liskov Substitution Principle

**Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.**

The key to understanding the Liskov Substitution Principle is thinking about _processes that use_ (sub)classes, rather than the (sub)classes themselves. In the bad example here, the UnitUpgrader purports to accept any Apartment (an abstract class) and upgrade it. However, once the UnitUpgrader starts upgrading the apartment (`upgrade(Apartment)`), it checks the specific class/subtype of the Apartment object to make sure it doesn't add a bedroom to a Studio (which by definition has zero bedrooms). A Studio object therefore cannot be substituted in for any Apartment.

If you don't follow the LSP, external processes will either break, behave improperly, or need to know too much information.


# Interface Segregation Principle

**Clients should not be forced to depend on interfaces they do not use.**

It's easy to get caught in a trap of naming interfaces or abstract classes after real-world things. The problem with this approach is two-fold: the collection of methods defined in the interface increase as one adds more and more functionality of the object to the code (a violation of the Single Responsibility Principle), and implementations of the interface start to require exceptions to the rules of the interface. Consider the bad example here. It may seem reasonable to create a Bird interface that outlines the basic features of birds--they can fly and they can shed their feathers. It works for plenty of birds (like an eagle), but then we want to add penguins to our code. The penguin is technically a bird, but if we set it to implement our Bird interface, we have to throw an exception for the `fly()` method. The penguin should not be forced to depend on an action it cannot perform.

Instead, make interfaces more abstract. It helps adhere to both the SRP (the interface is only responsible for one particular behavior) and this Interface Segregation Principle because specific objects (like eagles and penguins) only implement the functionality they need.


# Dependency Inversion Principle

**High-level modules should not depend on low-level modules. Both should depend on abstractions.**

**Abstractions should not depend on details. Details should depend on abstractions.**

The DIP is concerned with reusability. The high-level modules or interfaces of an application should only be describing the "general flow" of behavior. In some cases this may be considered "business logic". Meanwhile, the low-level modules are written in such a way to apply their concrete details to the abstraction. (The Adapter Pattern is a good example of DIP.)

In the bad example here, the WeatherTracker depends on the low-level details of the different notification systems (a phone, an emailer, etc.). These should instead be depending on some abstraction. The good example introduces this abstraction--a "Notifier" interface.

Strongly recommended reading: [Heuristics and Coffee](http://docs.google.com/file/d/0BwhCYaYDn8EgY2I3ZjUzNWMtMzE0ZS00ZDhlLTlmZGItMThkOTQzYzM0MTE3/edit?hl=en) by Uncle Bob
