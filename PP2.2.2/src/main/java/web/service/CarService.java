package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("Lada Granta", "red", 15000));
        carList.add(new Car("Ford Focus", "blue", 25000));
        carList.add(new Car("Haval F7", "black", 50000));
        carList.add(new Car("Toyota Corolla", "white", 35000));
        carList.add(new Car("Kia Rio", "white", 33000));

    }

    public List<Car> getCars(int count) {
        if ((count < 0) || (count > 5)) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
