import java.util.Scanner;
class IsPrime {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
            if(count>2){
                System.out.println(num+" is not a prime number");
                break;
            }
        }
        if(count==2){
            System.out.println(num+" is a prime number");
        }
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)