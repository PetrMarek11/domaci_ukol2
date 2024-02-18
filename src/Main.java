import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Host adela = new Host("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Host jan = new Host("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));


        System.out.println("Souhrnný popis hostů:");
        System.out.println(adela.getPopis());
        System.out.println(jan.getPopis());
        System.out.println();

        Pokoj pokoj1 = new Pokoj(1, 1, true, true, new BigDecimal("1000.0"));
        Pokoj pokoj2 = new Pokoj(2, 1, true, true, new BigDecimal("1000.0"));
        Pokoj pokoj3 = new Pokoj(3, 3, false, true, new BigDecimal("2400.0"));

        System.out.println("Popis pokojů:");
        System.out.println(pokoj1.getPopis());
        System.out.println(pokoj2.getPopis());
        System.out.println(pokoj3.getPopis());
        System.out.println();

        List<Host> adelaHosts = new ArrayList<>();
        adelaHosts.add(adela);

        List<Host> spolecnaRezervaceHosts = new ArrayList<>();
        spolecnaRezervaceHosts.add(adela);
        spolecnaRezervaceHosts.add(jan);

        Rezervace rezervaceAdela = new Rezervace(adelaHosts, pokoj1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), "rekreacni");
        Rezervace spolecnaRezervace = new Rezervace(spolecnaRezervaceHosts, pokoj3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), "pracovni");

        System.out.println("Seznam rezervací:");
        SystemRezervaci systemRezervaci = new SystemRezervaci();
        systemRezervaci.pridatRezervaci(rezervaceAdela);
        systemRezervaci.pridatRezervaci(spolecnaRezervace);
        systemRezervaci.zobrazitVsechnyRezervace();
    }
}
