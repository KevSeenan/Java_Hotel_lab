import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.name = name;
    }

    public ConferenceRoom addGuestToRoom(Guest guest, ConferenceRoom conferenceroom){
        if (this.guests.size() < this.capacity) {
            this.guests.add(guest);
        }
        return conferenceroom;
    }

    public ConferenceRoom removeGuestFromRoom(ConferenceRoom conferenceRoom){
        if (guests.size() > 1){
            for (int i = 0; i < guests.size(); i++) {
                this.guests.remove(i);
            }
        }
        this.guests.remove(0);
        return conferenceRoom;
    }

    public int checkRoomisEmpty(){
        return this.guests.size();
    }
}
