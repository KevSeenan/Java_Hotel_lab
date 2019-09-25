import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confroom;
    private ArrayList<Booking> roomBookings;


    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.confroom = new ArrayList<ConferenceRoom>();
        this.roomBookings = new ArrayList<Booking>();
    }

    public int guestCount() {
        return this.bedrooms.size() + this.confroom.size();
    }

    public void checkInGuest(Guest guest,Bedroom bedroom) {
        this.bedrooms.add(bedroom.addGuestToRoom(guest, bedroom));
    }

    public void checkOutGuest(Bedroom bedroom) {
        this.bedrooms.remove(bedroom.removeGuestFromRoom(bedroom));
    }

    public int bookARoom(Bedroom bedroom, Booking booking, int nightsBooked) {
        if (roomBookings.contains(bedroom)){

        } else {
            booking = new Booking(bedroom, nightsBooked);
            this.roomBookings.add(booking);
            this.bedrooms.remove(bedroom);
        }
        return this.totalBill(booking, bedroom);
    }

    public int bookingCounter(){
        return this.roomBookings.size();
    }

    public int totalBill(Booking booking, Bedroom bedroom){
        return (booking.numberOfNightsBooked() * bedroom.costOfOneNight());
    }

    public ArrayList vacantRooms(){
       ArrayList<Bedroom> vacancies = new ArrayList<Bedroom>();
       for (Bedroom room : this.bedrooms){
           if (room.checkRoomisEmpty() == 0){
               vacancies.add(room);
           }
       }
       return vacancies;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }
}
