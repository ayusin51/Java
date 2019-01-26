import java.util.*;

public class FirstRepeating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc > 0) {

            tc--;
            int n, ans = -1;
            n = sc.nextInt();
            boolean flag = true;
            Set<Integer> set = new HashSet<>();
            Integer[] arr = new Integer[n];

            for(int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();
                if(set.contains(arr[i]) && flag == true) {

                    flag = false;
                    ans = arr[i];
                } else {

                    set.add(arr[i]);
                }
            }

            if(flag == true) System.out.println("No repeating Elements");
            else System.out.println(ans);
        }
    }
}
