public class Booking {

    private Bedroom room;
    private int nightsBooked;

    public Booking(Bedroom room, int nightsBooked){
        this.room = room;
        this.nightsBooked = nightsBooked;
    }

    public int numberOfNightsBooked(){
        return this.nightsBooked;
    }

}
