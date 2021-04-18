# Exercise

## Some Assumptions:
- Drones can't collide with each other.
- If a drone wants to go out of bounds, java throws Error.

## Explanation:

- Parser generates a Controller via its method parseController(input).
- Controller could be think aswell as the "scenario" that instructions scripted.
- The controller has a elements.Grid (a desert plateau in this exercise) and a List of Drones.
- Drones can turn or move. They implement this methods when reading a Queue of Instructions.
- Finally, they can transmit their position via getPosition.
 
