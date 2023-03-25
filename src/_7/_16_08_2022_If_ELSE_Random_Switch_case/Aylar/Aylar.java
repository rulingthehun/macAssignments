package _7._16_08_2022_If_ELSE_Random_Switch_case.Aylar;

public enum Aylar {
    OCAK(1, 31, "OCAK"),
    SUBAT(2, 28, "SUBAT"),
    MART(3, 31, "MART"),
    NISAN(4, 30, "NISAN"),
    MAYIS(5, 31, "MAYIS"),
    HAZIRAN(6, 30, "HAZIRAN"),
    TEMMUZ(7, 31, "TEMMUZ"),
    AGUSTOS(8, 31, "AGUSTOS"),
    EYLUL(9, 30, "EYLUL"),
    EKIM(10, 31, "EKIM"),
    KASIM(11, 30, "KASIM"),
    ARALIK(12, 31, "ARALIK");

    final int ayNo;
    final int gunMiktari;
    final String ayAd;

    Aylar(int ayNo, int gunMiktari, String ayAd) {
        this.ayNo = ayNo;
        this.gunMiktari = gunMiktari;
        this.ayAd = ayAd;
    }
}
