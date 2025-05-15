public class Lew extends Zwierze {
    private boolean grzywaCzyDluga=true;

    public Lew(String nazwa, int wiek, boolean grzywaCzyDluga) {
        super(nazwa, wiek);
        this.grzywaCzyDluga = grzywaCzyDluga;
    }

    @Override
    public void wydajDzwiek() {
         System.out.println("ROAR!!!");
    }

    public boolean getGrzywaCzyDluga() {
        return grzywaCzyDluga;
    }

    public void setGrzywaCzyDluga(boolean grzywaCzyDluga) {
        this.grzywaCzyDluga = grzywaCzyDluga;
    }

    @Override
    public void  poruszaSie() {
        System.out.println("wstaje i biegnie");
    }
    public void czyZdrowyiSilny(boolean grzywaCzyDluga){
        if (grzywaCzyDluga){
            System.out.println("Lew ten jest zdrowy i silny");
        }
        else {
            System.out.println("Lew ten nie jest atrakcyjny ani zdrowy");
        }
    }

    @Override
    public void wyswietlInformacje() {
         System.out.println("nazwa:"+nazwa+" "+"wiek:"+" "+wiek+"czyDlugaGrzywa:"+grzywaCzyDluga);
    }
}
