package br.com.passos.vehicle_exit_control.repository;

import br.com.passos.vehicle_exit_control.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
