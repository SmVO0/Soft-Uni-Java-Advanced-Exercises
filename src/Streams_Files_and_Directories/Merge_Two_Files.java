package Streams_Files_and_Directories;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Merge_Two_Files {
    public static void main(String[] args) throws IOException {
        List<String> allLines = Files.readAllLines(Path.of("C:\\Users\\Ovcharov-PC\\IdeaProjects\\Soft-Uni-Java-Advanced-Exercises\\resources\\file1.txt"));
        allLines.addAll(Files.readAllLines(Path.of("C:\\Users\\Ovcharov-PC\\IdeaProjects\\Soft-Uni-Java-Advanced-Exercises\\resources\\file2.txt")));
        PrintWriter printer = new PrintWriter(new FileOutputStream("C:\\Softuni\\Java Advanced\\Streams, Files And Directories - Exercises\\resources\\file_output.txt"));
        allLines.forEach(printer::println);
        printer.close();
    }
}
