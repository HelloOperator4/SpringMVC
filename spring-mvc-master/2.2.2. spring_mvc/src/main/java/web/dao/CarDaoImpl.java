package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> listCar() {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("Kamaz", "cargo", 10));
        listCar.add(new Car("Belaz", "cargo", 20));
        listCar.add(new Car("Volga", "not cargo", 30));
        listCar.add(new Car("Uaz", "not cargo", 40));
        listCar.add(new Car("Maz", "cargo", 50));
        return listCar;
    }

}
