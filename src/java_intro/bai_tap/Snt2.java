package java_intro.bai_tap;
public class Snt2 {
    public static void main(String[] args) {
        int num = 2;
        int check =0;
        while ( num < 100 ){
            for (int i=2; i < num;i++){
                if (num % i ==0 ){
                    check++;
                    break;
                }
            } if ( check == 0 ){
                System.out.println(num);
            }
            check=0;
            num++;

        }
    }

}
