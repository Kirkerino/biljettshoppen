import java.time.LocalDateTime;

public class Arena {
    private Event event; // Composition: Arena has an Event
    private int Id;
    private String Plats;
    private String Adress;
    private String ArenaNamn;
    private String Kopare;
    private boolean Betald;
    private String Betalningsmetod;

    public Arena(Event event, int Id, String Plats, String Adress, String ArenaNamn, String Kopare, boolean Betald, String Betalningsmetod) {
        this.event = event;
        this.Id = Id;
        this.Plats = Plats;
        this.Adress = Adress;
        this.ArenaNamn = ArenaNamn;
        this.Kopare = Kopare;
        this.Betald = Betald;
        this.Betalningsmetod = Betalningsmetod;
    }

    // getters and setters for event and other attributes...
}


/* import java.time.LocalDateTime;

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
*/