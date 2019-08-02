package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class RestTesting implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        RestTemplate restTemplate = new RestTemplate();

        System.err.println("Creating student registration post-------------");
        Student newStudent = new Student((long) 4,"Paul Okeyo",87840);
        Student createdStudent = restTemplate.postForObject("http://10.51.10.111:1000/registrations", newStudent, Student.class);
        System.out.println(createdStudent.toString());

        System.err.println("Creating student registration post-------------");
        Unit createdUnit= new Unit((long) 2,"Application programming");
        String newUnit = ("http://10.51.10.111:1000/" + createdUnit.getId() + "/enroll/"+ createdStudent.getId());
        Unit createUnit = restTemplate.postForObject(newUnit,createdUnit,Unit.class);
        System.out.println(createdStudent.toString());



    }
}


