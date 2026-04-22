package session_14;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	public static void main(String[] args) {
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		System.out.println(l.isLocked());
		System.out.println(l.isHeldByCurrentThread());
		System.out.println(l.getQueueLength());
		l.unlock();
		System.out.println(l.getHoldCount());//1
		l.unlock();
		System.out.println(l.isLocked());
		System.out.println(l.getHoldCount());//0
	}
}
