package practice.day07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EntryManager {
    private Stack<Fan> vipStack = new Stack<>();
    private Queue<Fan> normalQueue = new LinkedList<>();
    private int ticketCount;

    public EntryManager(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    void registerFan(Fan fan) {
        if (fan.isVip()) {
            vipStack.push(fan);
        } else {
            normalQueue.offer(fan);
        }
    }

    synchronized boolean processEntry(Fan fan) {
        if (!vipStack.isEmpty()) {
            if (vipStack.peek() == fan) {
                vipStack.pop();
                ticketCount--;
                System.out.println("VIP " + fan.getName() + " 입장 완료!");
                return true;
            }
            return false;
        }
        if (!normalQueue.isEmpty()) {
            if (normalQueue.peek() == fan) {
                normalQueue.poll();
                ticketCount--;
                System.out.println(fan.getName() + " 입장 완료!");
                return true;
            }
        }
        return false;
    }
}
