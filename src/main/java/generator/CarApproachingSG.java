package generator;

import project.Driver;
import project.MyFactory;
import project.Vehicle;

import java.lang.reflect.InvocationTargetException;

public class CarApproachingSG extends BaseScenarioGenerator {

    public CarApproachingSG(MyFactory factory, String baseIRI) {
        super(factory, baseIRI);
    }

    @Override
    public Model generate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Model model = super.generate();

        Vehicle vehicle = factory.createVehicle(ObjectNamer.getName("vehicle"));

        Driver driver = factory.createDriver(ObjectNamer.getName("driver"));

        model.getVehicle().addHas_at_the_back(vehicle);

        vehicle.addVehicle_has_driver(driver);
        vehicle.addVehicle_has_location(model.getRoadType());
        vehicle.addVehicle_has_speed_kmph(80);
        vehicle.addHas_on_the_right(model.getSurrounding().get("RIGHT"));
        vehicle.addHas_on_the_left(model.getSurrounding().get("LEFT"));
        vehicle.addHas_in_the_front(vehicle);

        return model;
    }
}
