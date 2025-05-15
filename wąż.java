public class wąż extends Zwierze{
    private double dlugośćwężą;

    public wąż(String nazwa, int wiek, double dlugośćwężą) {
        super(nazwa, wiek);
        this.dlugośćwężą = dlugośćwężą;
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("ssssssss");
    }

    public double getDlugośćwężą() {
        return dlugośćwężą;
    }

    public void setDlugośćwężą(double dlugośćwężą) {
        this.dlugośćwężą = dlugośćwężą;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("nazwa:"+nazwa+" "+"wiek:"+" "+wiek+"nachyleniedzioba:"+"dlugosc weza:"+dlugośćwężą);
    }

    @Override
    public void poruszaSie() {
        System.out.println("wije sie");
    }
    public void  czyDuzy(double dlugośćwężą){
        if (dlugośćwężą>2.5){
            System.out.println("ten wąz jest naprawde duży");
        }
        else {
            System.out.println("ten wąż nie jest az taki duży");
        }
    }
}
