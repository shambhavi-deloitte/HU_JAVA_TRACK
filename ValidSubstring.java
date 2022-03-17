import java.util.*;
import java.lang.*;
class ValidSubstring{
    public static void main(String args[]){
        String s1="lil";
        String s2="gip";
        String s3="glitip";
        int i1=0,i2=0,i3=0;
        while(i1<s1.length() || i2<s2.length() || i3<s3.length()){
            if(s3.charAt(i3)==s1.charAt(i1)){
                i1++;i3++;
            }
            else if(s3.charAt(i3)==s2.charAt(i2)){
                i2++;i3++;
            }
            else{
                System.out.print("valid");
                System.exit(0);
            }
        }
        if(i3==i1+i2){
            System.out.print("InValid");
        }
        else{
            System.out.print("valid");
        }
    }
}