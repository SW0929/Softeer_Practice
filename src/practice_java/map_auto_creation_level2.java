package practice_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class map_auto_creation_level2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int init = 2;
        for (int i = 0; i < N; i++){
            init = init + (init-1);
        }

        System.out.println(init*init);
    }
}
