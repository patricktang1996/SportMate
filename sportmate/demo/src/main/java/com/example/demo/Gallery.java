package com.example.demo;
/**
*The 'Announcement' class represents an announcement in the application, has attributes such as title, content and date.
*/
public class Gallery {
    String title, fileAddress, date;


    /**
     * non-para constructor for the Gallery class.
     */
    public Gallery(){
    }

    /**
     * Parameterized constructor for creating a Gallery with specified details.
     * @param title The title of the Gallery
     * @param fileAddress The file address of the Gallery
     * @param date The date of the Gallery
     */
    public Gallery(String title, String fileAddress, String date) {
        this.title = title;
        this.fileAddress = fileAddress;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
