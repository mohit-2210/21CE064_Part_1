import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int a=sc.nextInt();
        int[] Arr1 =new int[a];
        System.out.println("Enter array :");
        for(int i=0;i<a;i++){
            Arr1[i]=sc.nextInt();
            }
        boolean c=array123(Arr1);
        System.out.println(c);
    }
    static boolean array123(int Arr1[]){
        int count1=0;
        for(int i=0;i<Arr1.length;i++){
            if(Arr1[i]==1 && Arr1[i+1]==2 && Arr1[i+2]==3){
                count1++;
                }
            if(i==Arr1.length-2){
                break;
                }
            }
            if(count1>=1)
                return true;
            else
                return false;
        }
}
