package com.company;
import java.io.File;
// Importing the IOException class for handling errors
import java.io.IOException;
class CreateFile
{
    public void create() {
        try {
            // This below code is for the creating the file any system with any Operating system.

            /*String filename = "newFile.txt";
            String workingDirectory = System.getProperty("user.dir");
            String absoluteFilePath = "";
            //absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
            absoluteFilePath = workingDirectory + File.separator + filename;
            System.out.println("Final filepath : " + absoluteFilePath);
            File file = new File(absoluteFilePath);*/

            // Creating an object of a file
            File file = new File("D:FileOperationExample.txt");
            if (file.createNewFile()) {
                System.out.println("File " + file.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }
    }
}
