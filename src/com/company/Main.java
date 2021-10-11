package com.company;

// Java Program to guess a Random Number Generation


import java.util.Scanner;

public class Main
{

    int min = 1;
    int max = 100;
    int random_number;
    int guess_number;


    // This code for making the class as Singleton.
    private static Main main =null;
    private Main()
    {
    }

    public static Main getMain()
    {
        if (main==null)
        {
        main=new Main();
         }
        return main;
    }



    public int random()
    {
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);
        this.random_number = random_int;

    Scanner scanner = new Scanner(System.in);
    boolean correct = false;

    while (!correct)
        {
            System.out.println("Guess a number between 1 and 100: ");
             guess_number = scanner.nextInt();
             if (guess_number > random_number) {
            System.out.println("Too high,please try again");
    }
    else if (guess_number <random_number)
    {
        System.out.println("Too low, please try again");
    }
    else
    {

        System.out.println("Yes, you guessed the  as same as  random number generated.");
        correct = true;
    }
        }
        return random_int;

    }
    public static void main(String[] args)
    {
        Main mainonject = Main.getMain();
        mainonject.random();


        //Checking the program
       // System.out.println("Random number"+mainonject.random_number);

        FileInfo fileInfo = new FileInfo();
        fileInfo.info();
        
        CreateFile createFile = new CreateFile();
        createFile.create();
        
        WriteToFile writeToFile = new WriteToFile();
        writeToFile.main(mainonject.random_number);
        
        ReadFromFile readFromFile = new ReadFromFile();
        readFromFile.main();
    }
}











