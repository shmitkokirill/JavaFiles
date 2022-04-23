package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task2_Files {
    private File file;
    private static String FILE_DIRECTORY = "~/Documents/testing/Java/";

    public Task2_Files(String fileName) throws IOException {
        file = new File(fileName);
        file.createNewFile();
    }

    protected void finalize() throws Throwable {
    }

    public void writeToFile(String text) {
        try(FileWriter writer = new FileWriter(file))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void writeToFile(List<String> text) {
        String toWrite = new String();
        for (var line : text) {
            toWrite += line + "\n";
        }
        try(FileWriter writer = new FileWriter(file))
        {
            writer.write(toWrite);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }


    public String readFile() {
        String fileText = new String();
        try(FileReader reader = new FileReader(file))
        {
            int c;
            while((c = reader.read())!= -1){
                fileText += (char) c;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return fileText;
    }
    public List<String> readFileToList() {
        List<String> fileText = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line != null) {
                fileText.add(line);
                line = reader.readLine();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return fileText;
    }

    public boolean deleteFile() {
        return file.delete();
    }

}
