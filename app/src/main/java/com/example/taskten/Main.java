package com.example.taskten;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File("/Users/pok/Documents/TaskTen.txt");
        FileWriter writer = new FileWriter(file,true);

        System.out.print("Вводите данные для записи: ");
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();

        writer.write(command);

        System.out.println("");
        while (!Objects.equals(command, "0")){
            System.out.print("Введите что-нибудь еще: ");
            command = input.nextLine();
            if (!command.equals("0")) {
                writer.write("\n"+command);
            }
            System.out.println("");
        }
        writer.close();
        System.out.println("\nФайл создан");
//        FileReader reader = new FileReader(file);
//        char[] str = new char[200];
//        reader.read(str);
//        System.out.println(str);
//        reader.close();
    }
}
