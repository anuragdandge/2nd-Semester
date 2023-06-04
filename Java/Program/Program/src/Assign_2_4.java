// // Write a program which will accept file name from command line and will show the content of the file

// import java.io.*;
// import java.util.Scanner;

// public class Assign_2_4 {
//     public static void main(String[] args) throws IOException {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter file name with Extension ");
//         String file_name = sc.nextLine();
//         RandomAccessFile rf = new RandomAccessFile(file_name, "rw");
//         byte[] bytes = new byte[10240];
//         rf.seek(0);
//         rf.read(bytes);
//         System.out.println(new String(bytes));
//         rf.close();
//     }
// }

// // Output :

// // Enter file name with Extension 
// // App.java
// // public class App {
// //     public static void main(String[] args) throws Exception {
// //         System.out.println("Hello, World!");
// //     }
// // }

import java.io.*;

public class Assign_2_4 {
    public static void main(String[] args) {
        // Check if the file name is provided as a command line argument
        if (args.length < 1) {
            System.out.println("Provide File Name as Argument");
            System.exit(1);
        }

        // Get the file name from the command line argument
        String fileName = args[0];

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error !!! " + e.getMessage());
        }
    }
}
// Output :
// java Assign_2_4 App.java                                                                        
// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }