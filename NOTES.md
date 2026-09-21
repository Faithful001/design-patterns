# DESIGN PRINCIPLES

## Strategy Pattern

### Definition:
The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.

- Identify the parts of your application that vary and separate them from what stays the same
- Program to an interface, not an implementation
- Favor composition over inheritance

## Observer Pattern

### Definition:
The Observer Pattern defines a one-to-many
dependency between objects so that when one
object changes state, all of its dependents are
notified and updated automatically

- Strive for loosely coupled designs between objects that interact.