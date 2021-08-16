package Basic;

public class ForTest05 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 100; i <= 999; i++) {
            if (((i % 10) * (i % 10) * (i % 10) + (i / 10 % 10) * (i / 10 % 10) * (i / 10 % 10) +
                    (i / 10 / 10 % 10) * (i / 10 / 10 % 10) * (i / 10 / 10 % 10)) == i) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
