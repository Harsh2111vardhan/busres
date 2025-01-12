package repository;

import com.capstone.bus_reservation_system.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusRepository<Bus> extends JpaRepository<Bus, Long> {
    List<Bus> findByFromCityAndToCity(String from, String to);
}
