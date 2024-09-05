package org.example;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Lesson19 {
    public static void main(String[] args) {
        Random random = new Random();
//        generateStudents(random);
//        getFile();
//        setFile();
        generateFile();
    }

    private static void generateFile() {
        File file = new File("/Users/owner/Documents/test.txt");
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(new Student(1,2,"Testiiiiii", StudentType.HONOR));

            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void getFile() {
        File file = new File("/Users/owner/Documents/Android Projects/eWallet-Kompanion/app/src/main/assets/data/vl_license.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[inputStream.available()];
            while (inputStream.read(bytes) != -1) {
                inputStream.read(bytes);
            }
            inputStream.close();
            String text = new String(bytes);
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void setFile() {
        File file = new File("/Users/owner/Documents/Android Projects/eWallet-Kompanion/app/src/main/assets/data/vl_license.txt");
        try {
            OutputStream outputStream = new FileOutputStream(file);
            InputStream inputStream = new FileInputStream(file);
            byte[] bytesIn = new byte[100];
            byte[] bytesOut = new byte[100];
            inputStream.read(bytesIn);
            outputStream.write(bytesIn);
            inputStream.close();
            outputStream.close();
            String text = new String(bytesIn);
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void generateStudents(Random random) {
        List<Student> temp = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            temp.add(new Student(
                    random.nextInt(16, 35),
                    random.nextInt(1, 5),
                    UUID.randomUUID().toString(),
                    i % 2 !=0 ? StudentType.HONOR : StudentType.GRANT
                    )
            );
        }

        var firstGrade = temp.stream().filter(n -> n.getGrade() == 1).toList();
        var secondGrade = temp.stream().filter(n -> n.getGrade() == 2).toList();
        var thirdGrade = temp.stream().filter(n -> n.getGrade() == 3).toList();
        var fourthGrade = temp.stream().filter(n -> n.getGrade() == 4).toList();

        firstGrade.forEach(System.out::println);
        secondGrade.forEach(System.out::println);
        thirdGrade.forEach(System.out::println);
        fourthGrade.forEach(System.out::println);
    }
}
