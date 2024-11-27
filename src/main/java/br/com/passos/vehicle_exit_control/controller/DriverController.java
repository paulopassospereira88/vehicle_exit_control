package br.com.passos.vehicle_exit_control.controller;

import br.com.passos.vehicle_exit_control.model.Driver;
import br.com.passos.vehicle_exit_control.service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/driver")
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping
    public ResponseEntity<Void> addDriver(@RequestBody Driver driver) {
        driverService.add(driver);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{cnh}")
    public ResponseEntity<Driver> getDriver(@PathVariable Integer cnh) {
        Driver driver = driverService.findByCnh(cnh);
        return ResponseEntity.status(HttpStatus.OK).body(driver);
    }

}
