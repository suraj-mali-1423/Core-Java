package Synchronyzation;

public class Counter {
     private  int counter = 0;

     public synchronized void Incre(){
           counter++;
     }

     public int getCounter(){
           return counter;
     }
}
