import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void setUp() {
        bedroom = new Bedroom(1, 1, "single", 30);
        guest = new Guest("Mrs Richards");
    }

    @Test
    public void canAddAGuest(){
        //Given I have a bedroom
        assertNotNull(bedroom);
        //AND I have a guest
        assertNotNull(guest);
        //When a guest checks in
        bedroom.addGuestToRoom(guest, bedroom);
        //Then increase guests in room to 1
        assertEquals(1, bedroom.checkRoomisEmpty());
    }

    @Test
    public void canRemoveAGuest(){
        //Given I have a bedroom
        assertNotNull(bedroom);
        //AND I have a guest
        assertNotNull(guest);
        bedroom.addGuestToRoom(guest, bedroom);
        //When a guest checks out
        bedroom.removeGuestFromRoom(bedroom);
        //Then set guests in room to 0
        assertEquals(0, bedroom.checkRoomisEmpty());
    }
}
