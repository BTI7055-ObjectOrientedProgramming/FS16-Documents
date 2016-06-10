package topic04;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

	private static Lock lock = new ReentrantLock();

	private static final int INITIAL_BALANCE = 100;
	private static Random random = new Random();

	private int balance;

	public BankAccount() {
		this.balance = INITIAL_BALANCE;
	}

	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}

	public void withdraw(int amount) {
		if (amount > this.balance) {
			throw new IllegalArgumentException();
		}
		this.balance = this.balance - amount;
	}

	public void randomTransfer(BankAccount other) {
		lock.lock();
		{
			int amount = random.nextInt(this.balance);
			this.withdraw(amount);
			other.deposit(amount);
		}
		lock.unlock();
	}

	public int getBalance() {
		return this.balance;
	}

}
