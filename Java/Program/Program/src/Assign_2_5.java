
// Write A Program to concatenate multiple files sequentially into single file.
// Accept file names from command line argument
import java.io.*;

public class Assign_2_5 {

    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Please provide two or more file names as command line arguments.");
            System.exit(1);
        }

        String outputFileName = args[0];

        try (FileOutputStream fos = new FileOutputStream(outputFileName);
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            for (int i = 1; i < args.length; i++) {
                String inputFileName = args[i];
                try (FileInputStream fis = new FileInputStream(inputFileName);
                        BufferedInputStream bis = new BufferedInputStream(fis)) {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = bis.read(buffer)) != -1) {
                        bos.write(buffer, 0, bytesRead);
                    }
                }
            }

            System.out.println("Files are successfully concatenated into " + outputFileName);
        } catch (IOException e) {
            System.out.println("An error occurred while concatenating the files: " + e.getMessage());
        }
    }
}
// Output
// java Assign_2_5 output.txt src.txt dest.txt
// Files are successfully concatenated into output.txt