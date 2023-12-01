package com.example.demo.Util;

import com.example.demo.Event;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * The 'FileUtilE' class has transfer data functions such as reading, adding, deleting, and editing Event data.
 */
public class FileUtilE implements FileUtil{
    private static final String DATA_FILEE= "C:\\Users\\tangjing1\\eclipse-workspace\\sportmate.zip_expanded\\sportmate\\demo\\src\\main\\java\\com\\example\\demo\\Util\\dataE.txt";
    /**
     * Reads Event data from a txt file and returns a list of Event objects.
     *
     * @return A list of Event objects read from the txt file.
     */
    public static List<Event> readData(){
        List<Event> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILEE))){
            String line = reader.readLine();
            while (line != null){
                String[] dataArray = line.split(",");
                String eventName = dataArray[0];
                String eventType = dataArray[1];
                String time = dataArray[2];
                String loca = dataArray[3];
                Event event = new Event(eventName,eventType,time,loca);
                result.add(event);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * Writes a Event object's data to the data file.
     *
     * @param event The Event object to be added to the data file.
     */
    public static void addData(Event event){
        List<Event> result = new ArrayList<>();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILEE, true))){
            writer.write(event.toString());
            writer.newLine();
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * Delete a Event's data from the file.
     * @param eventName The name of the deleted Event.
     */
    public static void deleteData(String eventName){
        List<Event> events = readData();
        File file = new File(DATA_FILEE);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        events.removeIf(x -> x.getEventName().equals(eventName));
        for (Event event : events){
            addData(event);
        }

    }
    /**
     * Edit an Event's info and refresh the data.
     * @param ee the Event to be edited.
     */
    public static void editData(Event ee){
        List<Event> events = readData();
        File file = new File(DATA_FILEE);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index = -1;
        for (Event event : events) {
            if (event.getEventName().equals(ee.getEventName())){
                index = events.indexOf(event);
                break;
            }
        }
        if (index != -1){
            events.set(index, ee);
        }
        for (Event event : events){
            addData(event);
        }

    }
}
