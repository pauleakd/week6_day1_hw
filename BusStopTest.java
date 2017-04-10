import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{
  Bus bus;
  Passenger passenger;
  BusStop busStop;


@Before
public void before(){
  bus = new Bus("Ocean Terminal");
  passenger = new Passenger();
  busStop = new BusStop();
}

@Test
public void canAdd(){
  busStop.add(passenger);
  assertEquals(1, busStop.count());
}

@Test
public void canAddFromBusStoptoBus(){

  busStop.add(passenger);
  busStop.addToBus(bus);

  assertEquals(1, bus.count());
  assertEquals(0, busStop.count());
}

@Test
public void cannotAddFromBusStoptoBusWhenBusIsFull(){
  for(int i=0; i<15; i++){
    this.busStop.add(passenger);
  }
  this.busStop.addToBus(bus);

  assertEquals(10, bus.count());
  assertEquals(5, busStop.count());
}


}
