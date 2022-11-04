import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int tarih, matematik, fizik, kimya, turkce, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Tarih notunuz : ");
        tarih = inp.nextInt();
        System.out.println("Matematik notunuz : ");
        matematik = inp.nextInt();
        System.out.println("Fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.println("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.println("Turkce notunuz : ");
        turkce = inp.nextInt();
        System.out.println("Muzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = tarih+ matematik+ fizik+ kimya+ tarih+ muzik;
        int ortalama =  toplam/6;

        System.out.print(ortalama+" "+"ile"+" ");
        System.out.println((ortalama<60)? "kaldınız" : "geçtiniz");

        }

    }
