package com.myapplication.task5_reading_writing_files;




import javax.xml.xpath.XPath;
import java.io.*;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.List;
        import java.util.Scanner;

public class ReadingFiles {

    public void readFileReader() throws IOException {

        File file = new File("C:\\Users\\anciuvaga\\IdeaProjects\\JavaAutomation_Tasks\\src\\com\\myapplication\\task5_reading_writing_files\\test.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String info;

        while ((info = br.readLine()) != null) {
            System.out.println(info);
        }
    }
    public void readFileAsString(String fileName) throws IOException {
        String text = "";
        text = new String(Files.readAllBytes(Paths.get(fileName)));
        System.out.println(text);
    }
    public void readFileWithScanner(String filePath) throws FileNotFoundException {
        Scanner file = new Scanner(new File(filePath));
        while (file.hasNextLine()) {
            System.out.println(file.nextLine());
        }
    }
    //Read a single charcater
    public void readFileInputStream(String filepath) {

        try {
            FileInputStream fin = new FileInputStream(filepath);
            int x = fin.read();
            System.out.println((char)x);
            fin.close();

        } catch (FileNotFoundException e ) {
            System.out.println("File cannot be found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readTextFromList(String filepath) throws IOException {
        List<String> contents = Files.readAllLines(Paths.get(filepath));

        for (String content : contents){
            System.out.println(content);
        }
    }
}