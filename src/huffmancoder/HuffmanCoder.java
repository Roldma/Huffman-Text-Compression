/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmancoder;

/**
 *
 * @author mark
 */
import java.io.File;
import java.nio.file.Paths;
import java.nio.file.Path;

public class HuffmanCoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (String arg : args) {
            System.out.println(arg);
        }
        Path currPath = Paths.get("");
        String currDirectory = currPath.toAbsolutePath().toString();
        System.out.println("Current path is " + currDirectory);
        
        try {
            File inputFile = new File(args[0]);
            if (inputFile.exists()) {
                System.out.println(args[0]);
            } else {
                System.out.println("File not found");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
