import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConferenceRoomTest {

        ConferenceRoom conferenceroom;
        Guest guest;

        @Before
        public void setUp() {
            conferenceroom = new ConferenceRoom(1, "Lochgoil");
            guest = new Guest("Mr Fawlty");
        }

        @Test
        public void canAddAGuest(){
            //Given I have a conferenceroom
            assertNotNull(conferenceroom);
            //AND I have a guest
            assertNotNull(guest);
            //When a guest checks in
            conferenceroom.addGuestToRoom(guest, conferenceroom);
            //Then increase guests in room to 1
            assertEquals(1, conferenceroom.checkRoomisEmpty());
        }

        @Test
        public void canRemoveAGuest(){
            //Given I have a conferenceroom
            assertNotNull(conferenceroom);
            //AND I have a guest
            assertNotNull(guest);
            conferenceroom.addGuestToRoom(guest, conferenceroom);
            //When a guest checks out
            conferenceroom.removeGuestFromRoom(conferenceroom);
            //Then set guests in room to 0
            assertEquals(0, conferenceroom.checkRoomisEmpty());
        }
}
