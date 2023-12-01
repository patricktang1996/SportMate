package com.example.demo.Util;

import com.example.demo.Announcement;
import com.example.demo.Gallery;

import java.util.ArrayList;
import java.util.List;
/**
 * The 'FileUtilG' class has transfer data functions such as reading, adding, deleting, and editing Gallery data.
 */
public class FileUtilG implements FileUtil{

    private static final String DATA_FILEE= "demo/src/main/java/com/example/demo/Util/dataA.txt";
    /**
     * Reads Gallery data from a txt file and returns a list of Gallery objects.
     *
     * @return A list of Gallery objects read from the txt file.
     */
    public static List<Gallery> readData(){
        List<Gallery> result = new ArrayList<>();
        return result;
    }
    /**
     * Writes a Gallery object's data to the data file.
     *
     * @param gallery The Gallery object to be added to the data file.
     */
    public static void addData(Gallery gallery){

    }
    /**
     * Delete an Gallery's data from the file.
     * @param gallery The name of the deleted Gallery.
     */
    public static void deleteData(String gallery){
    }
    /**
     * Edit an Gallery's info and refresh the data.
     * @param gallery the Event to be edited.
     */
    public static void editData(Gallery gallery){

    }

}
