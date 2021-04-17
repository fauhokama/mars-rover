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

    public String test() {
        ArrayList<String> droneOutput = new ArrayList<>();
        for (Drone drone: drones) {
            drone.run(grid);

            droneOutput.add(drone.getPosition().toString());
        }

        String listString = String.join("", droneOutput).trim();

        return listString;
    }
}
