public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Lew lew=new Lew("lew królewski",20,true);
        Orzeł_Bielik orzel=new Orzeł_Bielik("orzel maciek",6,45);
        wąż anakonda=new wąż("anakonda ",6,7);
        System.out.println(" ------------------------------------------------------------    ");
         lew.wydajDzwiek();
        orzel.wydajDzwiek();
        anakonda.wydajDzwiek();
        System.out.println(" ------------------------------------------------------------    ");
        lew.poruszaSie();
        orzel.poruszaSie();
        anakonda.poruszaSie();
        System.out.println(" ------------------------------------------------------------    ");
        lew.czyZdrowyiSilny(lew.getGrzywaCzyDluga());
        orzel.typdzioba(orzel.getNachyleniedzioba());
        anakonda.czyDuzy(anakonda.getDlugośćwężą());
        System.out.println(" ------------------------------------------------------------    ");
        lew.wyswietlInformacje();
        orzel.wyswietlInformacje();
        anakonda.wyswietlInformacje();



    }
}
