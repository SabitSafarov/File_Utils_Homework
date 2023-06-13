package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Введите путь откуда копировать: "); // C:\Users\ssabi\Desktop\Экзамен Java
            String path1 = scr.nextLine();
            System.out.print("Введите путь куда копировать: "); // C:\Users\ssabi\Desktop\Пример
            String path2 = scr.nextLine();
            copyFolder(path1, path2);
        }
    }


    private static void copyFolder(String path1, String path2) {
        File file1 = FileUtils.getFile(path1);
        File file2 = FileUtils.getFile(path2);
        try {
            FileUtils.copyDirectoryToDirectory(file1, file2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Файлы успешно скопированы!");
    }
}