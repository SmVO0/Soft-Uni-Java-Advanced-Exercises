package Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sum_Lines {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new FileInputStream("C:\\Users\\Ovcharov-PC\\IdeaProjects\\Soft-Uni-Java-Advanced-Exercises\\resources\\file1.txt"));
        while (file.hasNextLine()){
            String line = file.nextLine();
            byte[] lineAsciiValues = line.getBytes();
            int sum = 0;
            for (byte currentByte : lineAsciiValues) {
                sum += currentByte;
            }
            System.out.println(sum);
        }
    }
}
