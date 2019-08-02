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

        ResponseEntity<List<University>> response = restTemplate.exchange("http://localhost:8080/universities", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<University>>() {
                });

        System.err.println("Find All Universities -------------");
        List<University> univerities = response.getBody();
        for (University university : univerities) {

            System.out.println(university.toString());
        }

        System.err.println("Find one()Get-------------");
        University university = restTemplate.getForObject("http://localhost:8080/universities/2", University.class);
        System.out.println(university.toString());

        System.err.println("Creating university post-------------");
        University newuniversity1 = new University("Strathmore", "Ole", 400);
        University createdUniversity = restTemplate.postForObject("http://localhost:8080/universities/", newuniversity1, University.class);
        System.out.println(createdUniversity.toString());

        System.err.println("Creating course-------------");
        String createCourse = "http://localhost:8080/universities/" + createdUniversity.getId() + "/course";
        Course newCourse = new Course("Bsc Computer Engineering");
        Course createdCourse = restTemplate.postForObject(createCourse, newCourse, Course.class);
        System.out.println(createdCourse.toString());

        System.err.println("Updating course-----------");
        String updateCourse = "http://localhost:8080/universities/19/course";
        Course newUpdate= new Course("Mathematics");
        Course updated = restTemplate.patchForObject("http://localhost:8080/universities/19/course",newUpdate,Course.class);



    }
}


