import java.math.BigDecimal;

class Pokoj {
    private int cisloPokoje;
    private int pocetLuzek;
    private boolean maBalkon;
    private boolean maVyhledNaMore;
    private BigDecimal cenaZaNoc;

    public Pokoj(int cisloPokoje, int pocetLuzek, boolean maBalkon, boolean maVyhledNaMore, BigDecimal cenaZaNoc) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.maBalkon = maBalkon;
        this.maVyhledNaMore = maVyhledNaMore;
        this.cenaZaNoc = cenaZaNoc;
    }

    public String getPopis() {
        String popisBalkon = maBalkon ? "s balkonem" : "bez balkónu";
        String popisVyhled = maVyhledNaMore ? "s výhledem na moře" : "bez výhledu na moře";
        return "pokoj číslo " + cisloPokoje + " je " + pocetLuzek + "lůžkový za cenu " + cenaZaNoc + " Kč/noc, " + popisBalkon + ", " + popisVyhled;
    }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public void setPocetLuzek(int pocetLuzek) {
        this.pocetLuzek = pocetLuzek;
    }

    public boolean isMaBalkon() {
        return maBalkon;
    }

    public void setMaBalkon(boolean maBalkon) {
        this.maBalkon = maBalkon;
    }

    public boolean isMaVyhledNaMore() {
        return maVyhledNaMore;
    }

    public void setMaVyhledNaMore(boolean maVyhledNaMore) {
        this.maVyhledNaMore = maVyhledNaMore;
    }

    public BigDecimal getCenaZaNoc() {
        return cenaZaNoc;
    }

    public void setCenaZaNoc(BigDecimal cenaZaNoc) {
        this.cenaZaNoc = cenaZaNoc;
    }
}