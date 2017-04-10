public class BusStop{
  private Passenger[] queue;

  public BusStop(){
    this.queue = new Passenger[20];
  }

  public boolean isQueueFull(){
    return count() == queue.length;
  }

  public int count(){
    int count = 0;
    for(Passenger passenger : queue){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }

  public void add(Passenger passenger){
    if(isQueueFull()){
    return;
  }
  int count = count();
  this.queue[count] = passenger;
  }

  public void addToBus(Bus bus){

    int count = count();

    for(int i=0; i < count; i++){
      if(bus.isBusFull() == false){
        bus.add(queue[i]);
        queue[i] = null;
      }
    }

  }
}
