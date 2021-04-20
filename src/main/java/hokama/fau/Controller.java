package hokama.fau;

import hokama.fau.elements.Grid;

import java.util.List;

public class Controller {

    private final Grid grid;
    private final List<Drone> drones;

    public Controller(Grid grid, List<Drone> drones) {
        this.grid = grid;
        this.drones = drones;
    }

    public String start() {
        StringBuilder result = new StringBuilder();
        drones.forEach(drone -> {
            drone.run(grid);
            result.append(drone.getPosition());
        });

        return result.toString();
    }
}
