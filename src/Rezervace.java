
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Rezervace {
    private List<Host> hoste;
    private Pokoj pokoj;
    private LocalDate zacatek;
    private LocalDate konec;
    private String typPobytu;

    public Rezervace(List<Host> hoste, Pokoj pokoj, LocalDate zacatek, LocalDate konec, String typPobytu) {
        this.hoste = hoste;
        this.pokoj = pokoj;
        this.zacatek = zacatek;
        this.konec = konec;
        this.typPobytu = typPobytu;
    }

    public String getPopis() {
        StringBuilder popis = new StringBuilder("Rezervace pokoje číslo " + pokoj.getCisloPokoje() +
                " od " + zacatek + " do " + konec + " pro ");


        for (Host host : hoste) {
            popis.append(host.getPopis()).append(", ");
        }

        return popis.append(hoste.isEmpty() ? "" : "(" + typPobytu + ")").toString();
    }


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

        public List<Rezervace> getRezervace() {
            return rezervace;
        }

        public void setRezervace(List<Rezervace> rezervace) {
            this.rezervace = rezervace;
        }
    }
}