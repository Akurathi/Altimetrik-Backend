package com.example.detailsofvehicles;

import com.example.detailsofvehicles.service.VehicleService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.*;
import org.springframework.http.ResponseEntity;


@SpringBootTest
class DetailsofvehiclesApplicationTests {
    @Autowired
    VehicleService vehicleService;

    @Test
    void contextLoads() {
    }

    @Test
    void apiTest() throws JsonProcessingException {
        String name = "benz";

       String response = vehicleService.testServiceForVehicleDetails(name);
        Assert.assertEquals(response, "200 OK" );

    }

}
