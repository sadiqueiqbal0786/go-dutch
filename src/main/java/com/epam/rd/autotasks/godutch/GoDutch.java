package com.epam.rd.autotasks.godutch;
import java.util.Scanner;
public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner=new Scanner((System.in));
        int bill=scanner.nextInt();
        if(bill<0){
            System.out.print("Bill total amount cannot be negative");
            return;} else if (bill==0) {
            System.out.print(0);
            return;

        }
        int nm=scanner.nextInt();

       if (nm<=0) {
            System.out.print("Number of friends cannot be negative or zero");
            return;

        }

            double amount=(bill*0.10)+bill;
            int per= (int) (amount/nm);
            // int am=bill/nm;
            //int total = per+am;
            System.out.print(per);



    }
}
