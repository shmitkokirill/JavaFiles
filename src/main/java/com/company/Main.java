package com.company;


import org.json.JSONObject;
import org.mortbay.util.ajax.JSONObjectConvertor;
import org.mortbay.util.ajax.JSON.Output;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args)
            throws
                IOException,
                InterruptedException
    {
//        // TASK 1 Testing
//        Task1_Directory task1 = new Task1_Directory();
//        task1.viewAllDevices();
//        task1.viewDrives();
//        // ---TASK1---


//        // TASK 2 Testing
//        Task2_Files task2 = new Task2_Files("myFile.txt");
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter some text:");
//        String someText = in.nextLine();
//        task2.writeToFile(someText);
//
//        System.out.println("From file:");
//        System.out.println(task2.readFile());
////        task2.deleteFile();
//        // ---TASK2---


//        // TASK 3 Testing
//        Task3_JSON task3 = new Task3_JSON();
//        Scanner in = new Scanner(System.in);
//        List<Map<String, String>> persons = new ArrayList<>();
//        String[] questions = {"first name", "last name", "age"};
//        for (int i = 0; i < 2; i++) {
//            Map<String, String> personInfo = new HashMap<>();
//            for (String question : questions) {
//                System.out.println("Enter " + question + ": ");
//                String answer = in.nextLine();
//                personInfo.put(question, answer);
//            }
//            persons.add(personInfo);
//            System.out.println("\nNext person...");
//        }
//        var json = task3.createJSONFromMap(persons);
//        Task2_Files file = new Task2_Files("task3.json");
//        file.writeToFile(json.toString());
//
//        Task2_Files fileIn = new Task2_Files("task3.json");
//        System.out.println(fileIn.readFile());
//        //fileIn.deleteFile();
//        // ---TASK3---


//        // TASK 4 Testing
//        Task4_XML task4 = new Task4_XML();
//        List<XmlMap> addList = new ArrayList<>();
//        Scanner in = new Scanner(System.in);
//
//        for (int i = 0; i < 2; i++) {
//            XmlMap line = new XmlMap();
//            System.out.println("Enter the property");
//            String key = in.nextLine();
//            System.out.println("Enter the value");
//            String value = in.nextLine();
//            line.property = key;
//            line.value = value;
//            addList.add(line);
//        }
//
//        String[] toAdd = task4.createXmlData(addList);
//        Task2_Files outFile = new Task2_Files("cat.xml");
//        var fileList = outFile.readFileToList();
//        for (int i = 0; i < toAdd.length; i++)
//            fileList.add(fileList.size() - 2, toAdd[i]);
//
//        outFile.writeToFile(fileList);
//        // ---TASK4---


//        // TASK 5 Testing
//        Task5_ZIP task5 = new Task5_ZIP();
//        task5.createZipArchive("cat.xml");
//        System.out.println(task5.unzipFile("cat.xml.zip"));
//        // ---TASK5---
    }
}
