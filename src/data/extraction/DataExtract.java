package data.extraction;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

/**
 *
 * @author mark
 */
public abstract class DataExtract {

    /**
     * Parses a file and gets the ASCII byte value of each character in the file
     * storing it in a byte array.
     * @param inputFile Class File - text file to be parsed.
     * @return byte[] containing ASCII value of each character in the file.
     */
    public static byte[] parseDataBytes(File inputFile) {

        Path filePath = inputFile.toPath();
        List<String> fileContents;
        byte[] charBytes = null;

        try {
            charBytes = Files.readAllBytes(filePath);

        } catch (IOException ex) {
            Logger.getLogger(DataExtract.class.getName()).log(Level.SEVERE, null, ex);
        }

        return charBytes;
    }

    /**
     * Parses a file by separating each character in the file and storing in a
     * char array.
     * @param inputFile Class File - text file to be parsed.
     * @return char[] each element being a single character in the file.
     */
    public static char[] parseDataChars(File inputFile) {
        
        List<String> fileContents;
        Path filePath = inputFile.toPath();
        char[] fileChars = null;

        try {
            fileContents = Files.readAllLines(filePath, StandardCharsets.US_ASCII);
            fileChars = splitString(fileContents);
            
        } catch (IOException ex) {
            Logger.getLogger(DataExtract.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return fileChars;
    }

    /**
     * Iterates over a String list and takes each character and stores it in a
     * char array.
     * @param fileContents List of strings.
     * @return char[] containing all the characters within a string.
     */
    private static char[] splitString(List<String> fileContents) {
        
        char[] fileChars;
        int arrSize = 0;

        for (String fileContent : fileContents) {
            arrSize += fileContent.length();
        }

        fileChars = new char[arrSize];

        fileContents.forEach((sentence) -> {
            for (int i = 0; i < sentence.length(); i++) {
                fileChars[i] = sentence.charAt(i);
            }
        });

        return fileChars;
    }
}
