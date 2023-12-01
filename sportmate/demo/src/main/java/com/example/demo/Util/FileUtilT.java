package com.example.demo.Util;

import com.example.demo.Team;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * The 'FileUtilT' class has transfer data functions such as reading, adding, deleting, and editing Team data.
 */
public class FileUtilT implements FileUtil{
    private static final String DATA_FILET= "C:\\Users\\tangjing1\\eclipse-workspace\\sportmate.zip_expanded\\sportmate\\demo\\src\\main\\java\\com\\example\\demo\\Util\\dataT.txt";
    /**
     * Reads Team data from a txt file and returns a list of Team objects.
     *
     * @return A list of Team objects read from the txt file.
     */
    public static List<Team> readData(){
        List<Team> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILET))){
            String line = reader.readLine();
            while (line != null){
                String[] dataArray = line.split(",");
                String teamName = dataArray[0];
                String type = dataArray[1];
                String leader = dataArray[2];
                String memberList = dataArray[3];
                Team team = new Team(teamName,type,leader,memberList);
                result.add(team);
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
     * Writes a Team object's data to the data file.
     *
     * @param team The Team object to be added to the data file.
     */
    public static void addData(Team team){
        List<Team> result = new ArrayList<>();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILET, true))){
            writer.write(team.toString());
            writer.newLine();
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * Delete a Team's data from the file.
     * @param teamName The name of the deleted Team.
     */
    public static void deleteData(String teamName){
        List<Team> teams = readData();
        File file = new File(DATA_FILET);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        teams.removeIf(x -> x.getTeamName().equals(teamName));
        for (Team team : teams){
            addData(team);
        }

    }
    /**
     * Edit a Team's info and refresh the data.
     * @param t the Team to be edited.
     */
    public static void editData(Team t){
        List<Team> teams = readData();
        File file = new File(DATA_FILET);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index = -1;
        for (Team team : teams) {
            if (team.getTeamName().equals(t.getTeamName())){
                index = teams.indexOf(team);
                break;
            }
        }
        if (index != -1){
            teams.set(index, t);
        }
        for (Team team : teams){
            addData(team);
        }

    }
}
