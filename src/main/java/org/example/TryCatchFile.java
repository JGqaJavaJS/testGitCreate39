package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchFile {


        public static void main(String[] args) {
            String inputFile = "some.txt";

//            FileInputStream inputStream = null;
//            InputStreamReader reader = null;
//
//            try {
//                inputStream = new FileInputStream(inputFile);
//                reader = new InputStreamReader(inputStream);
//
//                int character;
//
//                // Read characters until the end of the stream
//                while ((character = reader.read()) != -1) {
//                    // Process the character (in this case, simply print it)
//                    System.out.print((char) character);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    // Close the InputStreamReader and FileInputStream in the reverse order of creation
//                    if (reader != null) {
//                        reader.close();
//                    }
//                    if (inputStream != null) {
//                        inputStream.close();
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }



            try (FileInputStream inputStream = new FileInputStream(inputFile);
                 InputStreamReader reader = new InputStreamReader(inputStream)) {
                int character;

                // Read characters until the end of the stream
                while ((character = reader.read()) != -1) {
                    // Process the character (in this case, simply print it)
                    System.out.print((char) character);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


}
