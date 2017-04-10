public class Bus {
  private String name;
  private Passenger[] passengers;

  public Bus(String name){
    this.name = name;
    this.passengers = new Passenger[10];
  }

  public String getName(){
    return this.name;
  }

  public int count(){
    int count = 0;
    for(Passenger passenger : passengers){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }

  public boolean isBusFull(){
    return count() == passengers.length;
  }

  public void add(Passenger passenger){
    if(isBusFull()){
      return;
    }
    int count = count();
    this.passengers[count] = passenger;
  }

  public void stop(){
    for(int i=0; i < passengers.length; i++){
    this.passengers[i] = null;
    }
  }




}
