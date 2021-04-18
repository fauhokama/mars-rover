# hokama.fau.Exercise

## Some Assumptions:
- Drones can't collide with each other.
- If a drone wants to go out of bounds, java throws Error.

## Explanation:

- hokama.fau.Parser generates a hokama.fau.Controller via its method parseController(input).
- hokama.fau.Controller could be think aswell as the "scenario" that instructions scripted.
- The controller has a hokama.fau.elements.Grid (a desert plateau in this exercise) and a List of Drones.
- Drones can turn or move. They implement this methods when reading a Queue of Instructions.
- Finally, they can transmit their position via getPosition.
 
