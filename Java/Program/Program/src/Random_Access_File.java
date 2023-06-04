import java.io.*;

public class Random_Access_File {
    public static void main(String[] args) {
        try {

            RandomAccessFile rfr = new RandomAccessFile(new File("src.txt"), "r");
            byte[] bytes = new byte[256];
            rfr.read(bytes);
            System.out.println(" src.Txt = " + new String(bytes));

            RandomAccessFile rfw = new RandomAccessFile(new File("dest.txt"), "rw");
            rfw.seek(new String("src.txt").length());
            rfw.write(bytes);
            rfw.seek(0);
            rfw.read(bytes);
            System.out.println(" dest.txt = " + new String(bytes));

            rfr.close();
            rfw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Output :

// Before Appending the File = Hello
// After Appending the File = Hello World !!!