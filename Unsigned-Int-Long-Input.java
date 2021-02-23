import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        
    }

    public static int nextInt() throws IOException {
        int ans = 0;
        boolean flag = false;
        while(true) {
            int next = System.in.read();
            if(next == 45){flag = true; continue;}
            if(next == -1) break;
            if(next == 32) break;
            if(next == 10) break;
            ans *= 10;
            ans += next-48;
        }
        if (flag) {
            ans *= -1;
        }
        return ans;
    }

    public static long nextLong() throws IOException {
        long ans = 0;
        boolean flag = false;
        while(true) {
            int next = System.in.read();
            if(next == 45){flag = true; continue;}
            if(next == -1) break;
            if(next == 32) break;
            if(next == 10) break;
            ans *= 10;
            ans += next-48;
        }
        if (flag) {
            ans *= -1;
        }
        return ans;
    }
}
