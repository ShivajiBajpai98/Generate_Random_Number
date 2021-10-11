package com.company;

import java.io.FileWriter;


import java.io.IOException;

class WriteToFile
{

    public  void main( int random_number)
    {

        try
        {
            int generated_random_number  =random_number;
            FileWriter fileWriter = new FileWriter("D:FileOperationExample.txt");
            // writing the content into the FileOperationExample.txt file
            fileWriter.write("Random number is = " + generated_random_number);

            // Closing the stream
            fileWriter.close();
            System.out.println("Content is successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }
}
