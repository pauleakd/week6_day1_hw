import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Passenger passenger;

  @Before
  public void before(){
    bus = new Bus("Ocean Terminal");
    passenger = new Passenger();
  }

  @Test
  public void hasName(){
    assertEquals("Ocean Terminal", bus.getName());
  }

  @Test
  public void busIsEmpty(){
    assertEquals(0, bus.count());
  }

  @Test
  public void busCanAddPassenger(){
    bus.add(this.passenger);
    assertEquals(1, bus.count());
  }

  @Test
  public void busisFull(){
    for(int i=0; i<10; i++){
      this.bus.add(passenger);
    }
    assertEquals(true, this.bus.isBusFull());
  }

  @Test
  public void cannotAddPassengersWhenBusIsFull(){
    for(int i=0; i<15; i++){
      this.bus.add(passenger);
    }
    assertEquals(10, bus.count());
  }

  @Test
  public void busIsEmptyAfterStopping(){
    this.bus.stop();
    assertEquals(0, bus.count());
  }




}
