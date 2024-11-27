package br.com.passos.vehicle_exit_control.repository;

import br.com.passos.vehicle_exit_control.model.Driver;

import java.util.Optional;

public interface DriverRepositoryCriteria {

    Optional<Driver> findByCnh(Integer cnh);

}
