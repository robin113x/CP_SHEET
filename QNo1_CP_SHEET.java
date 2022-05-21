import java.util.Scanner;

//https://codeforces.com/problemset/problem/282/A

public class QNo1_CP_SHEET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int x=0;
        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            if (operation.charAt(0)=='X'){
                    if (operation.charAt(1)=='+'){
                        x++;
                    }
                    if (operation.charAt(1)=='-'){
                        x--;
                    }
            }
            else if (operation.charAt(0)=='+'){
                ++x;
            }
            else {
                --x;
            }

        }
        System.out.println(x);

    }
}
