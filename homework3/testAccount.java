package homework3;

import java.util.Date;

//测试类
public class testAccount{
	
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withDraw(2500);
		account.deposit(3000);
		double balance = account.getBalance();
		double monthlyInterestRate = account.getMonthlyInterestRate();
		String dateCreated = account.getDateCreated().toString();
		System.out.println("账户余额："+balance);
		System.out.println("月利息："+monthlyInterestRate/100*balance);
		System.out.println("开户日期："+dateCreated);
	}
}

class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	//构造方法
	public Account() {
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	//id的访问器和修改器
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//balance的访问器和修改器
	public double getBalance() {
		return balance;
	}
	public void setBanlance(double balance) {
		this.balance = balance;
	}
	
	//annualInterestRate的访问器和修改器
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//dateCreated的访问器
	public Date getDateCreated() {
		return dateCreated;
	}
	
	//返回月利率
	public double getMonthlyInterestRate() {
		double MonthlyInterestRate = annualInterestRate/12;
		return MonthlyInterestRate;
	}
	
	//从账户提取特定数额
	public void withDraw(double amount) {
		balance -= amount;
	}
	
	//向账户存储特定数额
	public void deposit(double amount) {
		balance += amount;
	}
}


