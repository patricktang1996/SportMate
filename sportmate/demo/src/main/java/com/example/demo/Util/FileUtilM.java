package com.example.demo.Util;

import com.example.demo.Member;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * The 'FileUtilM' class has transfer data functions such as reading, adding, deleting, and editing Member data.
 */
public class FileUtilM implements FileUtil{
    private static final String DATA_FILE= "C:\\Users\\tangjing1\\eclipse-workspace\\sportmate.zip_expanded\\sportmate\\demo\\src\\main\\java\\com\\example\\demo\\Util\\dataM.txt";
    public static String getDataFile() {
		return DATA_FILE;
	}
	/**
     * Reads Member data from a txt file and returns a list of Member objects.
     *
     * @return A list of Member objects read from the txt file.
     */
    public static List<Member> readData(){
        List<Member> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))){
            String line = reader.readLine();
            while (line != null){
                String[] dataArray = line.split(",");
                String name = dataArray[0];
                String age = dataArray[1];
                String gender = dataArray[2];
                String email = dataArray[3];
                String phone = dataArray[4];
                String team = dataArray[5];
                Member member = new Member(name,age,gender,email,phone,team);
                result.add(member);
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
     * Writes a Member object's data to the data file.
     *
     * @param member The Member object to be added to the data file.
     */
    public static void addData(Member member){
        List<Member> result = new ArrayList<>();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILE, true))){
            writer.write(member.toString());
            writer.newLine();
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Delete a Member's data from the file.
     * @param name The name of the deleted Member.
     */
    public static void deleteData(String name){
        List<Member> members = readData();
        File file = new File(DATA_FILE);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        members.removeIf(x -> x.getName().equals(name));
        for (Member member : members){
            addData(member);
        }

    }

    /**
     * Edit a Member's info and refresh the data.
     * @param m the Member to be edited.
     */
    public static void editData(Member m){
        List<Member> members = readData();
        File file = new File(DATA_FILE);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index = -1;
        for (Member member : members) {
            if (member.getName().equals(m.getName())){
                index = members.indexOf(member);
                break;
            }
        }
        if (index != -1){
            members.set(index, m);
        }
        for (Member member : members){
            addData(member);
        }

    }
}
