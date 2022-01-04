package proje;

public class Ogrenci {
    //bir ogrenci listesi olusturun -> Main Class
    // Task 01 -> ad soyad yas diplomaNotu cinsiyet -> Ogrenci Class
    // Task 02 -> toString methodu ile ogrenci bilgilerin yazdirin
    // Task 03 -> Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
    // Task 04 -> Öğrencileri yaşlarına göre sıralayark yazdırin
    // Task 05 -> Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin
    // Task 06 -> Öğrencileri isimlerine göre yazdırın
    // Task 07 -> Öğrencileri soyisimlerine göre yazdırin
    // Task 08 -> Öğrencileri cinsiyetlerine göre yazdıran
    // Task 09 -> listeyi yazdırırken içinde veri var mı diye kontrol edin
    // Task 10 -> reduce metoduyla ortalama hesaplayin
    // Task 11 -> Girilen ogrenci ismini sil
    // Task 12 -> Test amaçlı Öğrenci nesneleri oluşturun.

    String ad;
    String soyAd;
    int yas;
    double diplomaNotu;
    String cinsiyet;

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                ", diplomaNotu=" + diplomaNotu +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }

    public Ogrenci(String ad, String soyAd, int yas, double diplomaNotu, String cinsiyet) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
        this.diplomaNotu = diplomaNotu;
        this.cinsiyet = cinsiyet;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getDiplomaNotu() {
        return diplomaNotu;
    }

    public void setDiplomaNotu(double diplomaNotu) {
        this.diplomaNotu = diplomaNotu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
