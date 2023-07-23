import MP3.Play;
import MP3.Pause;
import MP3.Stop;
import MP3.Add;

import java.util.*;



public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Add a = new Add(n1,n2);
        Add a1 = new Add(10,20);
        System.out.println(" Packages ");
        Play p = new Play();
        Pause ps = new Pause();
        Stop s = new Stop();
    }
}