package arora.gurdeep.weightwatchers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {

        // Check that relative path is given as program input.
    	 
        if (args.length != 1) {
        
            System.out.println("This program requires relative path to the dictionary as the input parameter." + System.lineSeparator() + "Please run it as \"java arora.gurdeep.weightwatchers.Question1 <path_to_dictionary>\"");
        } else {
            String filePath = args[0];
            System.out.println("file "+filePath);

            // Check that file path exists and is of file type (not directory etc).
            if (!doesFileExist(filePath)) {
                System.out.println("The file path \"" + filePath + "\" does not exist."
                        + System.lineSeparator() + "Please make sure that the file exists relative to the direction where this Java program is run");
            } else if (isFileEmpty(filePath)) {
                System.out.println("The file at path: " + filePath + " is empty. Please ensure it has some content.");
            } else {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(filePath));
                    String line;
                     while ((line = br.readLine()) != null) {
            			String[] words = line.split(" – ");
            			String word = words[0];
            			System.out.println(word);
            			String[] meanings = words[0].split(", ");
            			for (String meaning : meanings) {
            				System.out.println(meaning);
            			}
            		}
            		
            		br.close();

                  
                } catch (IOException fileNotFoundException) {
                    // Should not reach here since existence of file already checked in "if" condition
                }
            }
        }
    }


    private static boolean doesFileExist(String filePath) {
        File f = new File(filePath);
        return f.exists() && f.isFile();
    }

    private static boolean isFileEmpty(String filePath) {
        File f = new File(filePath);
        return f.length() == 0;
    }

  }
