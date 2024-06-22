package Streams_Files_and_Directories;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class Get_Folder_Size {
    public static void main(String[] args) {
        File myDirectory = new File("C:\\Users\\Ovcharov-PC\\IdeaProjects\\Soft-Uni-Java-Advanced-Exercises\\resources");
        AtomicLong filesLength = new AtomicLong();
        if (myDirectory.isDirectory()){
            Arrays.stream(myDirectory.listFiles()).forEach(file -> {
                filesLength.addAndGet(file.length());
            });
        }
        System.out.println("Folder size: " + filesLength);
    }
}
