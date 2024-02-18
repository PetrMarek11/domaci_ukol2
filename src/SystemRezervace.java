
import java.util.ArrayList;
import java.util.List;
class SystemRezervaci {
    private List<Rezervace> rezervace;

    public SystemRezervaci() {
        this.rezervace = new ArrayList<>();
    }

    public void pridatRezervaci(Rezervace rezervace) {
        this.rezervace.add(rezervace);
    }

    public void zobrazitVsechnyRezervace() {
        for (Rezervace rezervace : rezervace) {
            System.out.println(rezervace.getPopis());
        }
    }
}