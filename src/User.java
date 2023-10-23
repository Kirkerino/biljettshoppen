

//import java.util.ArrayList;

   public class User {
        private String Namn;
        private String Efternamn;
        private String Username;
        private String Email;
        private String Adress;
        private int Telnum;

//    private int id;
//
//    private List<Biljett> köptaBiljetter = new ArrayList<>();
//
//    public void läggTillBiljett(Biljett biljett) {
//        köptaBiljetter.add(biljett);
//    }
//
//    public void taBortBiljett(Biljett biljett) {
//        köptaBiljetter.remove(biljett);
//    }
//

      public User (String Namn, String Efternamn, String Username, String Email, String Adress, int Telnum ) {

                 this.Namn = Namn;
                 this.Efternamn = Efternamn;
                 this.Username = Username;
                 this.Email = Email;
                 this.Adress = Adress;
                 this.Telnum = Telnum;
      }



        public void setNamn(String Namn) {
            this.Namn=Namn;
        }
        public String getNamn() {
            return this.Namn;
        }
        public void setEfternamn(String Efternamn) {
            this.Efternamn = Efternamn;
        }
        public String getEfternamn() {
            return this.Efternamn;
        }

        // Kanske sätta och kolla om den finns i systemet eller inte?
        public void setEmail(String Email) {
            this.Email = Email;
        }
        public String getEmail() {
            return this.Email;
        }
        // Kanske sätta och kolla om den finns i systemet eller inte?
        public void setUsername(String Username) {
            this.Username = Username;
        }
        public String getUsername() {
            return this.Username;
        }

        public void setAdress(String Adress) {
            this.Adress = Adress;
        }
        public String getAdress() {
            return this.Adress;
        }
        // Kanske sätta och kolla om den finns i systemet eller inte?
        public void setTelnum(int Telnum) {
            this.Telnum = Telnum;
        }
        public int getTelnum() {
            return this.Telnum;
        }


    }// End


