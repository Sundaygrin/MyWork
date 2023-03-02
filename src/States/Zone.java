package States;

public enum Zone {
    South_south("Akwa-ibom,Bayelsa,Cross-river,Delta,Edo,Rivers"),
    North_east("Adamawa,Bauchi,Borno,Gombe,Taraba, Yobe"),
    North_central("Benue, FCT, Kogi , Kwara"  ),
    South_east("Abia,Anambra,Ebonyi,Enugu,Imo"),
    South_west("Ekiti,Lagos,Osun,Ondo,Ogun,Oyo"),
    North_west("Kaduna,Kastina,Kano,Kebbi,Sokoto,Jigawa,Zamfara");

    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    Zone(String state) {
        this.state = state;
    }
}
