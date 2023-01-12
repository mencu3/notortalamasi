import java.util.Scanner;
public class Notortalamasi {
    public static void main(String [] args){

        int mat,fiz,kim,tur,tar,muz;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat=input.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fiz=input.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kim=input.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        tur=input.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tar=input.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        muz=input.nextInt();

        int toplam=mat+fiz+kim+tur+tar+muz;
        float ortalama=toplam/6f;

        System.out.println(ortalama>=60? "Ortalama= "+ortalama+ '\n' + "Sınıfı Geçti":"Ortalama= "+ortalama+" +'\n'+ Sınıfta Kaldı");
    }
}
