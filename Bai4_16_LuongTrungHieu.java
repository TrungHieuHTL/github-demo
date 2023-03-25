
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author TRUNG HIEU
 */
public class Bai4_16_LuongTrungHieu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int k,n;
        System.out.println("Nhap k: ");
        k = sc.nextInt();
        System.out.println("Nhap n: ");
        n = sc.nextInt(); 
        System.out.println("C("+k+" , " + n + ") = " + Combine(k,n));
       }
    public static int Combine (int n, int k){
        if(k>n){
            return 0;
        }else if( k == 0 || k == n){
            return 1;
        }else {
            return (Combine(n - 1, k) + Combine (n - 1,k - 1));
        
         }
    }
    
}
