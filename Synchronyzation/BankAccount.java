package Synchronyzation;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 50;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "attemping to withdraw.");

          try{
              if(lock.tryLock(10000 , TimeUnit.MINUTES)){ // check it is free or not if free allow to the another
                     if(balance >= amount){
                          try{
                              System.out.println(Thread.currentThread().getName() + " processing.....");
                              Thread.sleep(3000);
                              balance -= amount;

                              System.out.println(Thread.currentThread().getName() +" Successfully withdraw amount "+amount+"Rs.");
                          }catch (Exception e){
                              System.out.println(e);
                          }
                          finally {
                              lock.unlock();
                          }
                     }else {
                         System.out.println(Thread.currentThread().getName() + " Not the Sufficient Amount in your Bank .");

                     }
              }else{
                  System.out.println(Thread.currentThread().getName()+" could not acquire the lock, will try later.");
              }
          }catch (Exception e) {
              System.out.println(e);
          }
    }
}
