package com.example.demo;

import javafx.scene.control.TextField;
/**
 * The 'Event' class represents an event in the application, has attributes such as event name, event type, time, and location.
 */
public class Event {
    private String eventName;
    private String eventType;
    private String time;
    private String loca;


    /**
     * ReWrite toString method.
     */
    public String toString() {
        return eventName + "," + eventType + "," + time + "," + loca ;
    }
    /**
     * non-para constructor for the Event class.
     */
    public Event() {
    }
    /**
     * Parameterized constructor for creating an Event.
     *
     * @param eventName The name of the event.
     * @param eventType The type or category of the event.
     * @param time      The time or date of the event.
     * @param loca      The location of the event.
     */
    public Event(String eventName, String eventType, String time, String loca) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.time = time;
        this.loca = loca;
    }
    /**
     * Gets the name of the event.
     *
     * @return The event name.
     */
    public String getEventName() {
        return eventName;
    }
    /**
     * Sets the name of the event.
     *
     * @param eventName The event name to set.
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    /**
     * Gets the type of the event.
     *
     * @return The event type.
     */
    public String getEventType() {
        return eventType;
    }
    /**
     * Sets the type of the event.
     *
     * @param eventType The event type to set.
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    /**
     * Gets the time of the event.
     *
     * @return The event time.
     */
    public String getTime() {
        return time;
    }
    /**
     * Sets the time of the event.
     *
     * @param time The event time to set.
     */
    public void setTime(String time) {
        this.time = time;
    }
    /**
     * Gets the location of the event.
     *
     * @return The event location.
     */
    public String getLoca() {
        return loca;
    }
    /**
     * Sets the location of the event.
     *
     * @param loca The event location to set.
     */
    public void setLoca(String loca) {
        this.loca = loca;
    }
}
