package enumahome;

public enum KyrgyzRespublic {
    CHUI(22000,"Borborgo jakyn "),
    OSH(29200,"Sulaiman too bar "),
    BATKEN(16995,"Aigul gulu bar "),
    NAARYN(45200,"Tashrabat munarasy bar"),
    JALALABAD(33700,"Bul dagy ozgocho"),
    TALAS(11400,"Manas kumbozu bar"),
    YSSYKKOL(43100,"Kol bar");

    int ayant;
    String ozgocholuk;

    KyrgyzRespublic(int ayant, String ozgocholuk) {
        this.ayant = ayant;
        this.ozgocholuk = ozgocholuk;
    }
    private void Method(){
        System.out.println("Eto Kyrgyzstan detka:) ");
    }

    public int getAyant() {
        return ayant;
    }

    public void setAyant(int ayant) {
        this.ayant = ayant;
    }

    public String getOzgocholuk() {
        return ozgocholuk;
    }

    public void setOzgocholuk(String ozgocholuk) {
        this.ozgocholuk = ozgocholuk;
    }

    @Override
    public String toString() {
        return "KyrgyzRespublic! " + " " +
                "ayant: " + ayant + " "+
                ", ozgocholuk: " + ozgocholuk ;

    }
}
