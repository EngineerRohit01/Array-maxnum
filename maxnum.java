import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int size;
        System.out.print("enter the size: ");
        size = input.nextInt();
        
        int[] a = new int[size];
        
        int i = 0;
        while(i<a.length){
            System.out.print("enter the data :" + (i+1));
            a[i] = input.nextInt();
            i++;
        }
        
        int value = 0;
         i =0;
        while(i<a.length){
            if(a[i]>value){
                value = a[i];
            }
            i++;
        }
        System.out.print(value);
    }
}
