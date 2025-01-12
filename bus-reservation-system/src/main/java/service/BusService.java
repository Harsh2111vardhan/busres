package service;

import model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BusRepository;

import java.util.List;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public List getBuses(String fromCity, String toCity) {
        return busRepository.findByFromCityAndToCity(fromCity, toCity);
    }

    public Bus getBusById(Long id) {
        return null;
    }

    public Bus addBus(Bus bus) {
        return bus;
    }

    public Bus updateBus(Long id, Bus bus) {
        return bus;
    }

    public List<Bus> getAllBuses() {
        return List.of();
    }
}
