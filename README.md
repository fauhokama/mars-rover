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
 
## Running Tests

    mvn -Dtest=GeneralTest test

or use main for manually testing any input.
