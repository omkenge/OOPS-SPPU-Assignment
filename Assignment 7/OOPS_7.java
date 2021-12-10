public class OOPS_7 {
    static boolean isPrime(int num) {
        int flag = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }

        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

    static <T> void count(String type, T[] element) {
        int even = 0, odd = 0, prime = 0, palim = 0;
        if (type.equals("even")) {
            for (T value : element) {
                if (Integer.parseInt(value.toString()) % 2 == 0) {
                    even++;
                }

            }
            System.out.println("Total even: " + even);
        }
        if (type.equals("odd")) {
            for (T value : element) {
                if (Integer.parseInt(value.toString()) % 2 != 0) {
                    odd++;
                }

            }
            System.out.println("Total odd: " + odd);
        }
        if (type.equals("prime")) {
            for (T value : element) {
                if (isPrime(Integer.parseInt(value.toString()))) {
                    prime++;
                }

            }
            System.out.println("Total prime: " + prime);
        }
        if (type.equals("palindrome")) {
            for (T value : element) {
                StringBuffer rev = new StringBuffer(value.toString());
                if (value.toString().equals(new String(rev.reverse()))) {
                    palim++;
                }

            }

            System.out.println("Total palindrome: " + palim);
        }
    }

    public static void main(String[] args) {
        Integer iarrray[] = { 45, 7, 12, 84, 38, 115, 29, 30 };
        count("even", iarrray);
        Byte barray[] = { 45, 7, 12, 84, 38, 115, 29, 30 };
        count("even", barray);
        Short sarray[] = { 45, 73, 12, 84, 38, 115, 29, 30, 19 };
        Long larry[] = { 45L, 73L, 12L, 84L, 38L, 151L, 29L, 30L, 19L };
        count("even", sarray);
        count("odd", sarray);
        count("prime", larry);
        count("palindrome", larry);
    }
}