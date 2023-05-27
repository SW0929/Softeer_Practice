package practice_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class safecracker_level2 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String st = br.readLine();
        if (ascending(st)){
            System.out.println("ascending");
        }else if(descending(st)){
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }

    }
    public static boolean ascending(String string) {
        StringTokenizer st = new StringTokenizer(string, " ");
        boolean check = false;
        for (int i = 1; i <= 8; i++) {
            if (i != Integer.parseInt(st.nextToken())) {
                check = false;
                break;
            } else {
                check =  true;
            }
        }
        return check;
    }
    public static boolean descending(String string) {
        StringTokenizer st = new StringTokenizer(string, " ");
        boolean check = false;
        for (int i = 8; i >= 1; i--) {
            if (i != Integer.parseInt(st.nextToken())) {
                check = false;
                break;
            } else {
                check =  true;
            }
        }
        return check;
    }

}
