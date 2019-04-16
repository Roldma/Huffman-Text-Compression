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
import huffmantree.nodes.HuffmanTree;
import data.extraction.DataExtract;

public class HuffmanCoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (String arg : args) {
            System.out.println(arg);
        }

        try {
            File inputFile = new File(args[0]);
            
            if (inputFile.isFile() && inputFile.canRead()) {
                byte[] dataBytes = DataExtract.parseDataBytes(inputFile);
                char[] dataChars = DataExtract.parseDataChars(inputFile);
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Provided path to file or file name is incorrect");
            System.out.println(e);
        }
    }

}
