package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.Member;
import com.example.demo.Util.FileUtilM;


class FileUtilMTest {
	private Path temp;
	@BeforeEach
	void setUp() throws IOException{//This method is executed before each test to set up a temporary data file.
		temp = Files.createTempFile("testData", ".txt");
	}
	@AfterEach
	void destroy() throws IOException{ //This method is executed after each test to clean up and delete the temporary file.
		Files.deleteIfExists(temp);
	}	
	
    @Test
    public void testReadData() throws IOException {
     // Create sample Member data
        List<Member> testData = new ArrayList<>();
        testData.add(new Member("Abc", "30", "male", "fgsdgs", "1234567890", "TeamA"));
     // Write sample data to the temporary file
        writeTestDataToFile(testData, temp);
     // Simulate copying the temporary data file to the actual data file location
        copyFileLoc(temp);
     // Call the 'readData' method to read data from the file
        List<Member> result = FileUtilM.readData();
     // Compare the result with the expected sample data
        assertArrayEquals(result.toArray(), testData.toArray());
    }
    
    //Write sample Member data to a given file path.
    private void writeTestDataToFile(List<Member> testData, Path testFile) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(testFile)) {
            for (Member member : testData) {
                writer.write(member.toString());
                writer.newLine();
            }
        }
    }
    
    // Simulate copying the temporary data file to the actual data file location
    private void copyFileLoc(Path testFile) throws IOException {
    	File dataFile = new File(FileUtilM.getDataFile());
    	Files.copy(testFile, dataFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
