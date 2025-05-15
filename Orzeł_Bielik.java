public class Orzeł_Bielik extends Zwierze{
    private int nachyleniedzioba;//w stopniach

    public Orzeł_Bielik(String nazwa, int wiek, int nachyleniedzioba) {
        super(nazwa, wiek);
        this.nachyleniedzioba = nachyleniedzioba;
    }

    public int getNachyleniedzioba() {
        return nachyleniedzioba;
    }

    public void setNachyleniedzioba(int nachyleniedzioba) {
        this.nachyleniedzioba = nachyleniedzioba;
    }

    @Override
    public void wydajDzwiek() {
       System.out.println("pphhhhhhhiu");
    }

    @Override
    public void poruszaSie() {
        System.out.println("leci w przestworza");
    }

    @Override
    public void wyswietlInformacje() {
       System.out.println("nazwa:"+nazwa+" "+"wiek:"+" "+wiek+"nachyleniedzioba:"+nachyleniedzioba);
    }

    public void typdzioba(int nachyleniedzioba) {
        if (nachyleniedzioba>60) {
            System.out.println("dziob mało zakrzywiony");
        }
        else {
            System.out.println("dziob mocno zakrzywiony");
        }
    }
}
