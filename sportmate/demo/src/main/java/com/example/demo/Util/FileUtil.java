package com.example.demo.Util;

import com.example.demo.Event;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * The FileUtil interface provides a set of methods for reading, adding, deleting, and editing data in a file.
 * Implementations of this interface can be used to interact with file-based data storage.
 */
public interface FileUtil {

    /**
     * Reads data from a file and returns a list of objects.
     *
     * @return A list of objects read from the file, or null if an error occurs during reading.
     */
    public static List<Object> readData(){
        return null;
    };

    /**
     * Adds the specified object to the file.
     *
     * @param o The object to be added to the file.
     */
    public static void addData(Object o){}

    /**
     * Deletes data from the file based on the provided name.
     *
     * @param name The name of the data to be deleted.
     */
    public static void deleteData(String name){
    }

    /**
     * Edits data in the file with the provided object.
     *
     * @param o The object containing the data to be edited in the file.
     */
    public static void editData(Object o){
    }
}
