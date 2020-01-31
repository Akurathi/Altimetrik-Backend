package com.example.detailsofvehicles.service;

import com.example.detailsofvehicles.model.Vehicle;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class VehicleService {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    private RestTemplate restTemplate = new RestTemplate();

    public List<Vehicle> serviceForVehicleDetails(String name) throws JsonProcessingException {


        String resourceUrl = "https://vpic.nhtsa.dot.gov/api/vehicles/GetManufacturerDetails/"+name+"?format=json";
        System.out.println("provided name with the url is " + resourceUrl);

        ResponseEntity<String> response = null;

        response = restTemplate.getForEntity( resourceUrl, String.class);

            ObjectMapper mapper = new ObjectMapper();
            JsonNode jnode = mapper.readTree(response.getBody()).get("Results");

            Iterator<JsonNode> iter = jnode.iterator();
            List<Vehicle> finalRes = new ArrayList<>();
            //List<Map<HttpStatus, Vehicle>> lst = new ArrayList<>();


            while (iter.hasNext()) {
                JsonNode jsonNode = iter.next();
                Map<HttpStatus, Vehicle> hmap= new HashMap<>();
                Vehicle v = new Vehicle();
                v.setMfr_ID(jsonNode.get("Mfr_ID").asLong());
                v.setMfr_Name(jsonNode.get("Mfr_Name").asText());
                v.setCity(jsonNode.get("City").asText());
                v.setState(jsonNode.get("StateProvince").asText());
                v.setCountry(jsonNode.get("Country").asText());

                finalRes.add(v);
//                hmap.put(response.getStatusCode(), v);
//                lst.add(hmap);
            }



//        return lst;
        return finalRes;
    }

    public String testServiceForVehicleDetails(String name){


        String status;

        String resourceUrl = "https://vpic.nhtsa.dot.gov/api/vehicles/GetManufacturerDetails/"+name+"?format=json";
        System.out.println("provided name with the url is " + resourceUrl);

        ResponseEntity<String> response = null;

        response = restTemplate.getForEntity( resourceUrl, String.class);

        System.out.println(response.getStatusCode());
        status = response.getStatusCode().toString();
        return status;

    }
}
