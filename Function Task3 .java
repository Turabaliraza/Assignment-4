public class Main {
    public static void main(String[] args) {
        int n=220;
        int digit=2;
        int result=count_digit(n,digit);
        System.out.println("The digit"+digit+"appears"+result+"times in the No"+n+",");

    }

    public static int count_digit(int n, int digit) {
        if(n==0)
        {
            return 0;
        }
        if(n%10==digit)
        {
            return 1+count_digit(n/10,digit);
        }
        else
        {
            return count_digit(n/10,digit);
        }
    }


}
