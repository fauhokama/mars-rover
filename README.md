# Exercise

## Some Assumptions:
- Drones can't collide with each other.
- ~If a drone wants to go out of bounds, java throws Error.~
- Now, the drone turns around and gets back to the grid.

## Explanation:

- Parser generates a Controller via its method parse(input).
- Controller could be think aswell as the "scenario" that instructions scripted.
- The controller has a Grid (a desert plateau in this exercise) and a List of Drones.
- Drones can turn or move. They implement this methods when reading a Queue of Instructions.
- Finally, they can transmit their position via getPosition.
 
## Simple Diagram
(![UML class](https://user-images.githubusercontent.com/15642357/115329821-42d7a980-a169-11eb-8782-8743f8bfe9ae.png)

Thoughts: Right now, it has some issues:
- Grid & Direction are "useless". Just abstractions that could be more useful.
- Move should be deleted.

 
## Running Tests

    mvn -Dtest=GeneralTest test

or use main for manually testing any input.
