package _12_08_2022_if_else;

import java.util.Scanner;

public class _12_08_2022_if_else {
    public static void main(String[] args) {
//        Soru 1:
//        Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup oladığını kontrol ediniz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi girin = ");
        int sayi = oku.nextInt();
        int sayiBirler = sayi % 10;
        int sayiOnlar = sayi / 10 % 10;
        System.out.println("sayiBirler = " + sayiBirler);
        System.out.println("sayiOnlar = " + sayiOnlar);
        if (sayiBirler % 2 == 1 && sayiOnlar % 2 == 1 && sayiBirler == sayiOnlar)
            System.out.println("Sayinin birler ve onlar basamagi tek ve esit");
        else
            System.out.println("Sayinin birler ve onlar basamagi cift ya da esit degil");
//        Cikti:
//        Sayi girin = 537
//        sayiBirler = 7
//        sayiOnlar = 3
//        Sayinin birler ve onlar basamagi cift ya da esit degil
//        Soru 2:
//        Girilen bir kelimede bosluk veya A harfinin olup olmadığını kontrol ediniz.
        Scanner oku2 = new Scanner(System.in);
        System.out.print("Kelime ya da cumle girin = ");
        String cumle = oku2.nextLine();
        if (cumle.contains(" "))
            System.out.println("\" \" bosluk karakteri var");
        else
            System.out.println("\" \" bosluk karakteri yok");
        cumle = cumle.toUpperCase();
        if (cumle.contains("A"))
            System.out.println("A harfi var");
        else
            System.out.println("A harfi yok");
//        Cikti:
//        Kelime ya da cumle girin = kelime ya da cumle
//        " " bosluk karakteri var
//        A harfi var
//        Soru 3:
//        Kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
//        bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.
        Scanner oku3 = new Scanner(System.in);
        System.out.print("Sayinin tam kismini girin = ");
        int tamSayi = oku3.nextInt();
        System.out.print("Sayinin ondalikli kismini girin = ");
        int ondalikliSayi = oku3.nextInt();
        String sayiKelime = tamSayi+"."+ondalikliSayi;
        double gercekSayi= Double.parseDouble(sayiKelime);
        System.out.println("gercekSayi = " + gercekSayi);
//        Cikti:
//        Sayinin tam kismini girin = 55
//        Sayinin ondalikli kismini girin = 44
//        gercekSayi = 55.44
//        Soru 4:
//        Girilen bir sayı
//        Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
//        Eğer int 4'e bölününce kalan 0 ise ve 15'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
        Scanner oku4 = new Scanner(System.in);
        System.out.print("Bir sayi girin = ");
        int sayi2 = oku4.nextInt();
        if (sayi2 % 9 == 0 && sayi2 % 5 == 0)
            System.out.println("Able to divide by 9 and 5");
        if (sayi2 % 4 == 0 && sayi2 % 15 == 0)
            System.out.println("Able to divide by 4 and 15");
//        Cikti:
//        Bir sayi girin = 60
//        Able to divide by 4 and 15
//        Bir sayi girin = 45
//        Able to divide by 9 and 5
//        Soru 5:
//        Girilen 3 sayıdan en küçük olanını bulunuz.
        Scanner oku5 = new Scanner(System.in);
        System.out.print("1. sayiyi girin = ");
        int sayi3 = oku5.nextInt();
        System.out.print("2. sayiyi girin = ");
        int sayi4 = oku5.nextInt();
        System.out.print("3. sayiyi girin = ");
        int sayi5 = oku5.nextInt();
        if (sayi3 < sayi4) {
            if (sayi3 < sayi5)
                System.out.println("En kucuk sayi = " + sayi3);
        } else if (sayi4 < sayi5)
            System.out.println("En kucuk sayi = " + sayi4);
        else
            System.out.println("En kucuk sayi = " + sayi5);
//        Cikti:
//        1. sayiyi girin = 66
//        2. sayiyi girin = 77
//        3. sayiyi girin = 55
//        En kucuk sayi = 55
//        Soru 6:
//        Girilen bir string
//        Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
//        Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
//        Aksi halde (else) "no money" yazdırın.
        Scanner oku6 = new Scanner(System.in);
        System.out.print("Kelime ya da cumle girin = ");
        String cumle2 = oku6.nextLine();
        if (cumle2.contains("€"))
            System.out.println("This is euro");
        else if (cumle2.contains("$"))
            System.out.println("This is dollar");
        else
            System.out.println("no money");
//        Cikti:
//        Kelime ya da cumle girin = $ ewarf
//        This is dollar
//        Soru 7:
//        Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
//        Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve
//        notu aşağıdaki kurallara göre belirleyecektir:
//        Eğer ortalama not >=90 =>not=A
//        Eğer ortalama not >= 70 ve<90 => not=B
//        Eğer ortalama not >=50 ve <70 =>not=C
//        Eğer ortalama not <50 =>note=F
//        Aşağıdaki örnek çıktıya bakın:
//        int Quiz_score: 80
//        int mid_term_score: 68
//        int Final_score: 90
//        print (Your grade is B)
//        (Notunuz B'dir)
        Scanner oku7 = new Scanner(System.in);
        System.out.print("quiz notunu girin = ");
        int not1 = oku7.nextInt();
        System.out.print("mid term notunu girin = ");
        int not2 = oku7.nextInt();
        System.out.print("final notunu girin = ");
        int not3 = oku7.nextInt();
        double notOrt = (not1 * 0.10) + (not2 * 0.30) + (not3 * 0.60);
        System.out.println("not ortalamaniz = " + notOrt);
        if (notOrt >= 90)
            System.out.println("Notunuz A");
        else if (notOrt >= 70)
            System.out.println("Notunuz B");
        else if (notOrt >= 50)
            System.out.println("Notunuz C");
        else
            System.out.println("Notunuz F");
//        Cikti:
//        quiz notunu girin = 10
//        mid term notunu girin = 50
//        final notunu girin = 90
//        not ortalamaniz = 70.0
//        Notunuz B
//        Soru 8:
//        Girilen 2 basamaklı bir sayının tersi olan sayıyı bulunuz.
        Scanner oku8 = new Scanner(System.in);
        System.out.print("2 basamakli bir sayi girin = ");
        int ikiBasamak = oku8.nextInt();
        if (ikiBasamak < 10 && ikiBasamak > 99)
            System.out.println("Hatali giris");
        int birler = ikiBasamak % 10;
        System.out.println("birler = " + birler);
        int onlar = ikiBasamak / 10;
        System.out.println("onlar = " + onlar);
        String tersKelime = birler + " " + onlar;
        System.out.println("tersKelime = " + tersKelime);
        int tersIkiBasamak = Integer.parseInt(tersKelime.replace(" ", ""));
        System.out.println("tersIkiBasamak = " + tersIkiBasamak);
//        Cikti:
//        2 basamakli bir sayi girin = 92
//        birler = 2
//        onlar = 9
//        tersKelime = 2 9
//        tersIkiBasamak = 29
//        Soru 9:
//        Girilen 3 basamaklı bir sayının tersi olan sayıyı bulunuz.
        Scanner oku9 = new Scanner(System.in);
        System.out.print("3 basamakli bir sayi girin = ");
        int ucBasamak = oku9.nextInt();
        if (ucBasamak < 100 && ucBasamak > 999)
            System.out.println("Hatali giris");
        int birler2 = ucBasamak % 10;
        System.out.println("birler = " + birler2);
        int onlar2 = ucBasamak / 10 % 10;
        System.out.println("onlar = " + onlar2);
        int yuzler = ucBasamak / 100;
        System.out.println("yuzler = " + yuzler);
        String tersKelime2 = birler2 + " " + onlar2 + " " + yuzler;
        System.out.println("tersKelime = " + tersKelime2);
        int tersUcBasamak = Integer.parseInt(tersKelime2.replace(" ", ""));
        System.out.println("tersIkiBasamak = " + tersUcBasamak);
//        Cikti:
//        3 basamakli bir sayi girin = 958
//        birler = 8
//        onlar = 5
//        yuzler = 9
//        tersKelime = 8 5 9
//        tersIkiBasamak = 859
    }
}
