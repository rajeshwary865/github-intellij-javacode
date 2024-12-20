package inheritance;

import java.lang.String;

public class ABC {
    public static void main(String[] args) {
        int n = 10;
        int firstNum=0;
        int secNum=1;
        System.out.println("fibonnaci series till"+n+"terms");
        for(int i=1;i<n;++i) {
            System.out.println(firstNum+"");
            int nextTerm=firstNum+secNum;
            firstNum=secNum;
            secNum=nextTerm;


        }
    }
}
