package Zad1;





public class Kandydat implements Cloneable, Comparable<Kandydat>{

    private String nazwa;
    private int wiek;
    private String wyksztalcenie;
    private int lataDoswiadczenia;


    public Kandydat(String nazwa, int wiek, String wykształcenie, int lataDoswiadczenia) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcenie = wykształcenie;
        this.lataDoswiadczenia = lataDoswiadczenia;
    }

    @Override
    public int compareTo(Kandydat k) {
        int compared = 0;

        if(this.wyksztalcenie.equals("magister") ){
            if(k.wyksztalcenie.equals("licencjat"))
                compared+=1000;
        }
        if(this.wyksztalcenie.equals("licencjat")){
            if(k.wyksztalcenie.equals("magister")){
                compared-=500;
            }
        }
        if(this.wiek > k.wiek)
            compared+=100;
        if(this.wiek < k.wiek)
            compared-=100;
        if(this.lataDoswiadczenia > k.lataDoswiadczenia)
            compared+=10;
        if(this.lataDoswiadczenia < k.lataDoswiadczenia)
            compared -=10;

        return compared;
    }





    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getWykształcenie() {
        return wyksztalcenie;
    }

    public void setWykształcenie(String wykształcenie) {
        this.wyksztalcenie = wykształcenie;
    }

    public int getLataDoswiadczenia() {
        return lataDoswiadczenia;
    }

    public void setLataDoswiadczenia(int lataDoswiadczenia) {
        this.lataDoswiadczenia = lataDoswiadczenia;
    }




}
