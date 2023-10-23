import java.time.LocalDateTime;

public class Arena extends Event {
    private int Id;
    private int EventId;
    private String Plats;
    private String Adress;
    private String ArenaNamn;


    private String Kopare;
    private boolean Betald;
    private String Betalningsmetod;

    public Arena(String Arena, String Namn, LocalDateTime Datum, int Tid, int biljetterTotalt, int biljetterSalda, Biljett[][] sittplatsInfo) {
        super(Arena, Namn, Datum, Tid, biljetterTotalt, biljetterSalda, sittplatsInfo);
    }


    public void setArenaNamn(String ArenaNamn) {
        this.ArenaNamn=ArenaNamn;
    }
    public String getArenaNamn() {
        return this.ArenaNamn;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }
    public String getAdress() {
        return this.Adress;
    }


} //end
