package practice_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class conference_room_reservation_level2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); //회의실 개수
        int m = Integer.parseInt(st.nextToken()); //예약된 회의

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i ++){
            //회의실 이름
            list.add(br.readLine());
        }
        System.out.println(n + " " + m);
    }
}
