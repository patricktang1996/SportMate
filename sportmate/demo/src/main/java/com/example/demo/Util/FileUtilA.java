package com.example.demo.Util;

import com.example.demo.Announcement;
import com.example.demo.Event;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * The 'FileUtilA' class has transfer data functions such as reading, adding, deleting, and editing Announcement data.
 */
public class FileUtilA implements FileUtil{

    private static final String DATA_FILEE= "demo/src/main/java/com/example/demo/Util/dataA.txt";
    /**
     * Reads Announcement data from a txt file and returns a list of Announcement objects.
     *
     * @return A list of Announcement objects read from the txt file.
     */
    public static List<Announcement> readData(){
        List<Announcement> result = new ArrayList<>();
        return result;
    }
    /**
     * Writes a Announcement object's data to the data file.
     *
     * @param announcement The Announcement object to be added to the data file.
     */
    public static void addData(Announcement announcement){

    }
    /**
     * Delete an Announcement's data from the file.
     * @param announcementName The name of the deleted Announcement.
     */
    public static void deleteData(String announcementName){
    }
    /**
     * Edit an Announcement's info and refresh the data.
     * @param announcement the Announcement to be edited.
     */
    public static void editData(Announcement announcement){

    }

}
