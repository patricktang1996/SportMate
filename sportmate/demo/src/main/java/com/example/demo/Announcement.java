package com.example.demo;
/**
 * The 'Announcement' class represents an announcement in the application, has attributes such as title, content and date.
 */
public class Announcement {
    String title, content, date;

    /**
     * Parameterized constructor for creating an Announcement with specified details.
     * @param title The title of an Announcement
     * @param content The content of an Announcement
     * @param date The date of an Announcement
     */
    public Announcement(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    /**
     * non-para constructor for the Member class.
     */
    public Announcement() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
