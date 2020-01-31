package com.example.detailsofvehicles.controller;

import com.example.detailsofvehicles.model.Vehicle;
import com.example.detailsofvehicles.service.VehicleService;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;



@ApiOperation(value = "View a vehicle manufacturing details")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved list"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
}
)
@RestController
public class VechicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping(value = "/getVechicleByName", produces = "application/json")
    public List<Vehicle> getVechicleByName(@RequestParam(name = "vehicleName") String vehicleName) throws JsonProcessingException {

        System.out.println("came to controller " + vehicleName);
        return vehicleService.serviceForVehicleDetails(vehicleName);
    }

}
