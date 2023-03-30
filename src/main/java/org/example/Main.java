package org.example;



import org.example.model.ModelAttendance;
import org.example.model.ModelUser;

import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Connection connection = DBHandler.connect();

        String username  ;
        String id;
        String attendance;


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        username = scanner.nextLine();
        ModelUser user = new ModelUser ("norah",22,"ilovecats");

        Scanner myInput = new Scanner( System.in );
        System.out.println("enter id");


        System.out.println("enter password");
        int password = scanner.nextInt();

    }
}

