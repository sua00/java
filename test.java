import java.util.*;
public class test {
    public static void main(String[] args) {
        String s = "Hello World";
        String[] arr = s.split("");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        String[] arr2 = s.split(" ");
        for(int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }
        String num = "010-1234-5678";
        String[] arr3 = num.split("-");
        for(int i = 0;i < arr3.length;i++) {
            System.out.println(arr3[i]);
        }
    }
}
