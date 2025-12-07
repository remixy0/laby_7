package Zad3;

import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        queue.offer(new Customer("Jack", 5));
        queue.offer(new Customer("Peter", 8));
        int queueSize = queue.size();
        int serviceTime = 0;
        int waitingTime = 0;

        while(queue.size()>0){
            Customer c = queue.poll();
            System.out.println("Serving for  " + c.name + " service time: " + c.serviceTime);
            for(Customer customer: queue) customer.waitingTime += c.serviceTime;
        }


    }
}
