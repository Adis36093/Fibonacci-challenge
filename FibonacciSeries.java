/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseries;

import java.util.Scanner;

/**
 *
 * @author adis3
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number,n1=0,n2=1;
        number=scan.nextInt();
        
        for(int i=0;i<number;i++){
            
            System.out.print(n1+" + ");
            int sum=n1+n2;
            n1=n2;
            n2=sum;
            
        }
    }}
        
