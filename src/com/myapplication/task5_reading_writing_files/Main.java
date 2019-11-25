package com.myapplication.task5_reading_writing_files;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ReadingFiles readingFile = new ReadingFiles();
        String path = "C:\\Users\\anciuvaga\\IdeaProjects\\JavaAutomation_Tasks\\src\\com\\myapplication\\task5_reading_writing_files\\test.txt";
        readingFile.readFileReader();
        readingFile.readFileAsString(path);
        readingFile.readFileWithScanner(path);
        readingFile.readFileInputStream(path);
        readingFile.readTextFromList(path);

        WritingFiles writingFile = new WritingFiles();
        String data = "I will write this String to file in Java";
        int noOfLines = 100;
        writingFile.writeUsingFiles(data);
        writingFile.writeUsingBufferedWriter(data, noOfLines);
        writingFile.writeUsingFileWriter(data);
        writingFile.writeUsingOutputStream(data);
        writingFile.writeUsingFileChannel(data);


    }
}
