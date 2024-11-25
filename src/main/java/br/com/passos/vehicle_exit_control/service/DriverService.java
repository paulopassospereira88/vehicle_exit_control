package br.com.passos.vehicle_exit_control.service;

import br.com.passos.vehicle_exit_control.model.Driver;
import br.com.passos.vehicle_exit_control.repository.DriverRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DriverService {

    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public void add(Driver driver) {
        try {
            driverRepository.save(driver);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
