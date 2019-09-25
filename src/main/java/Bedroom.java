import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int nightlyRate;

    public Bedroom(int roomNumber, int capacity, String type, int nightlyRate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public Bedroom addGuestToRoom(Guest guest, Bedroom bedroom){
        if (this.guests.size() < this.capacity) {
            this.guests.add(guest);
        }
        return bedroom;
    }

    public Bedroom removeGuestFromRoom(Bedroom bedroom){
        if (guests.size() > 1){
            for (int i = 0; i < guests.size(); i++) {
                this.guests.remove(i);
            }
        }
        this.guests.remove(0);
        return bedroom;
    }

    public int checkRoomisEmpty(){
        return this.guests.size();
    }

    public int costOfOneNight(){
        return this.nightlyRate;
    }
}
