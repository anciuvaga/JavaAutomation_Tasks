package com.myapplication.task5_reading_writing_files;



import java.io.*;
        import java.nio.ByteBuffer;
        import java.nio.channels.FileChannel;
        import java.nio.file.Files;
        import java.nio.file.Paths;

public class WritingFiles  {


    public void writeUsingFiles(String text) throws IOException {
        Files.write(Paths.get("C:\\Users\\anciuvaga\\IdeaProjects\\JavaAutomation_Tasks\\src\\com\\myapplication\\task5_reading_writing_files\\writeUsingFiles"), text.getBytes());
    }

    public void writeUsingBufferedWriter(String text, int noOfLines) {
        File file = new File("C:\\Users\\anciuvaga\\IdeaProjects\\JavaAutomation_Tasks\\src\\com\\myapplication\\task5_reading_writing_files\\fileBufferedWriter.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        String dataWithNewLine = text + System.getProperty("line.separator");
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (int i = noOfLines; i > 0; i--) {
                bw.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeUsingFileWriter(String text) {
        File file = new File("C:\\Users\\anciuvaga\\IdeaProjects\\JavaAutomation_Tasks\\src\\com\\myapplication\\task5_reading_writing_files\\fileFileWriter.txt");
        FileWriter fw = null;

        try {
            fw = new FileWriter(file);
            fw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeUsingOutputStream(String text) {
        OutputStream ops = null;
        try {
            ops = new FileOutputStream(new File("C:\\Users\\anciuvaga\\IdeaProjects\\JavaAutomation_Tasks\\src\\com\\myapplication\\task5_reading_writing_files\\fileOutputStream"));
            ops.write(text.getBytes(), 0, text.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void writeUsingFileChannel(String text) throws IOException {
        RandomAccessFile ra = new RandomAccessFile("C:\\Users\\anciuvaga\\IdeaProjects\\JavaAutomation_Tasks\\src\\com\\myapplication\\task5_reading_writing_files\\fileChannel.txt", "rw");
        FileChannel fc = ra.getChannel();
        byte[] strBytes = text.getBytes();
        ByteBuffer buffer = ByteBuffer.allocate(strBytes.length);
        buffer.put(strBytes);
        buffer.flip();
        fc.write(buffer);
        ra.close();
        fc.close();
    }
}