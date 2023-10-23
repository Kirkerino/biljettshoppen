    import java.time.LocalDateTime;

    public class Event {

        private String Arena;
        private String Namn;
        private LocalDateTime Datum;
        private int Tid;
        private int biljetterTotalt;
        private int biljetterSalda;
        private  Biljett[][] sittplatsInfo;


        public Event(String Arena, String Namn, LocalDateTime Datum, int Tid, int biljetterTotalt, int biljetterSalda, Biljett[][] sittplatsInfo) {
            this.Arena = Arena;
            this.Namn = Namn;
            this.Datum = Datum;
            this.Tid = Tid;
            this.biljetterTotalt = biljetterTotalt;
            this.biljetterSalda = biljetterSalda;
            this.sittplatsInfo = sittplatsInfo;
        }

        public String getArena() {
            return Arena;
        }

        public void setArena(String Arena) {
            this.Arena = Arena;
        }

        public String getNamn() {
            return Namn;
        }

        public void setNamn(String Namn) {
            this.Namn = Namn;
        }

        public LocalDateTime getDatum() {
            return Datum;
        }

        public void setDatum(LocalDateTime Datum) {
            this.Datum = Datum;
        }

        public int getTid() {
            return Tid;
        }

        public void setTid(int Tid) {
            this.Tid = Tid;
        }

        public int getBiljetterTotalt() {
            return biljetterTotalt;
        }

        public void setBiljetterTotalt(int biljetterTotalt) {
            this.biljetterTotalt = biljetterTotalt;
        }

        public int getBiljetterSalda() {
            return biljetterSalda;
        }

        public void setBiljetterSalda(int biljetterSalda) {
            this.biljetterSalda = biljetterSalda;
        }

        public Biljett[][] getSittplatsInfo() {
            return sittplatsInfo;
        }

        public void setSittplatsInfo(Biljett[][] sittplatsInfo) {
            this.sittplatsInfo = sittplatsInfo;
        }

        // Boka biljetter

        public boolean bookTickets(User user, int numberOfTickets) {
            if (numberOfTickets > 5) {
                System.out.println("Cannot book more than 5 tickets.");
                return false;
            }

            int availableSeatsCount = 0;
            for (Biljett[] row : sittplatsInfo) {
                for (Biljett seat : row) {
                    if (seat != null && !seat.platsUpptagen()) {
                        availableSeatsCount++;
                    }
                }
            }

            if (availableSeatsCount < numberOfTickets) {
                System.out.println("Not enough available seats.");
                return false;
            }

            int bookedCount = 0;
            for (Biljett[] row : sittplatsInfo) {
                for (Biljett seat : row) {
                    if (seat != null && !seat.platsUpptagen()) {
                        seat.boka();
                        bookedCount++;
                        if (bookedCount == numberOfTickets) {
                            break;
                        }
                    }
                }
                if (bookedCount == numberOfTickets) {
                    break;
                }
            }

            System.out.println(numberOfTickets + " tickets booked successfully!");
            return true;
        }

    }



