package pers.chh3213.classLearn20211229;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000, 4.5);
		account.withdraw(30000);
		System.out.println("您的账户余额为： "+account.getBalance());
		account.withdraw(3000);
		System.out.println("您的账户余额为： "+account.getBalance()+"\n"+"月利率为："+account.getMonthlyInterest()+"%");
	}
}
