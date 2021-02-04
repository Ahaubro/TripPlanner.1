package com.company;

public class Trip {

    //Fields
    private String title;
    private String location;
    private int duration;
    private int cost;

    //Constructor
    public Trip(String title, String location, int duration, int cost) {
        this.title = title;
        this.location = location;
        this.duration = duration;
        this.cost = cost;
    }
    //Methods // Getters
    public String getTitle() {
        return title;
    }
    public String getLocation() {
        return location;
    }
    public int getDuration() {
        return duration;
    }
    public int getCost() {
        return cost;
    }
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    //Tostring
    public String toString() {
        return("\nThe title of the trip: " + title + "\nThe location of the trip: " + location + "\nThe duration of the trip in days: " + duration
        + "\nThe trips cost in DKK: " + cost);
    }



}
