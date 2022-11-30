package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gün sayısını alınız ve gün ismini ekrana yazdırınız
        1==>Pazar   2==>Pazartesi
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Gün numarasını giriniz");
        byte gunNo = input.nextByte();
        if(gunNo==1){
            System.out.println("Gün: Pazar");
        } else if (gunNo==2) {
            System.out.println("Gün:Pazartesi");
        }else if (gunNo==3) {
            System.out.println("Gün:Salı");
        }else if (gunNo==4) {
            System.out.println("Gün:çarşamba");
        }else if (gunNo==5) {
            System.out.println("Gün:perşembe");
        }else if (gunNo==6) {
            System.out.println("Gün:cuma");
        }else if (gunNo==7) {
            System.out.println("Gün:cumartesi");
        }else{
            System.out.println("Geçerli gün sayısı giriniz");
        }

        //2.YOL--SWİTCH İLE ÇÖZÜNÜZ
        switch (gunNo){
            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("salı");
                break;
            case 4:
                System.out.println("çarşamba");
                break;
            case 5:
                System.out.println("perşembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("Geçerli gün sayısı giriniz");
        }
    }
}
