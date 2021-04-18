package hokama.fau;

import hokama.fau.elements.Grid;

import java.util.ArrayList;

public class Controller {

    private Grid grid;
    private ArrayList<Drone> drones;

    public Controller(Grid grid, ArrayList<Drone> drones) {
        this.grid = grid;
        this.drones = drones;
    }

    public void start() {
        for (Drone drone: drones) {
            drone.run(grid);
            System.out.print(drone.getPosition());
        }
    }
}
