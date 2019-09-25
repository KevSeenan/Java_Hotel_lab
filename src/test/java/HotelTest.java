import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom;
    ConferenceRoom conferenceroom;
    Booking booking;

    @Before
    public void setUp() {
        hotel = new Hotel();
        guest = new Guest("Uncle Ben");
        bedroom = new Bedroom(2, 2, "double", 50);
        conferenceroom = new ConferenceRoom(10, "Lommond");
    }

    @Test
    public void countNumberOfGuests() {
        //Given I have a hotel
        assertNotNull(hotel);
        //When there are no guests
        //Then number of guests will be 0
        assertEquals(0, hotel.guestCount());
    }

    @Test
    public void canCheckAGuestIn() {
        //Given I have a hotel
        assertNotNull(hotel);
        //AND I have a bedroom
        assertNotNull(bedroom);
        //AND I have a guest
        assertNotNull(guest);
        //When a guest checks in
        hotel.checkInGuest(guest, bedroom);
        //Then add make number of guests equal 1
        assertEquals(1, hotel.guestCount());
    }

    @Test
    public void canCheckAGuestOut() {
        //Given I have a hotel
        assertNotNull(hotel);
        //AND I have a bedroom
        assertNotNull(bedroom);
        //AND I have a guest
        assertNotNull(guest);
        hotel.checkInGuest(guest, bedroom);
        //When a guest checks out
        hotel.checkOutGuest(bedroom);
        //Then add make number of guests equal 0
        assertEquals(0, hotel.guestCount());
    }

    @Test
    public void canBookARoom() {
        //Given I have a hotel
        assertNotNull(hotel);
        //AND I have a bedroom
        assertNotNull(bedroom);
        //When I book a room
        hotel.bookARoom(bedroom, booking, 3);
        //Then return the booking
        assertEquals(1, hotel.bookingCounter());
    }

    @Test
    public void canGetTotalBill() {
        //Given I have a hotel
        assertNotNull(hotel);
        //AND I have a bedroom
        assertNotNull(bedroom);
        //When I book a room I get a bill

        //Then return the bill
        assertEquals(150, hotel.bookARoom(bedroom, booking, 3));
    }

    @Test
    public void canHaveVacantRooms() {
        //Given I have a hotel
        assertNotNull(hotel);
        //AND I have a room
        assertNotNull(bedroom);
        //When a room is not booked
        //Then it is vacant
        assertEquals(this.hotel.getBedrooms(), hotel.vacantRooms());
    }
    
}
