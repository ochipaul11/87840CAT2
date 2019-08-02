package com.example.demo;

public class University {
    private Long id;
    private String universityName;
    private String location;
    private Integer capacity;

    public University(String universityName, double latitude, double longitude) {
        this.universityName = universityName;
        ;
    }

    public University(String universityName, String location, int capacity) {
        this.universityName = universityName;
        this.location = location;
        this.capacity = capacity;
    }

    private University() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", universityName='" + universityName + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
