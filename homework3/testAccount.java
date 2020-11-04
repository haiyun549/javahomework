package homework3;

import java.util.Date;

//������
public class testAccount{
	
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withDraw(2500);
		account.deposit(3000);
		double balance = account.getBalance();
		double monthlyInterestRate = account.getMonthlyInterestRate();
		String dateCreated = account.getDateCreated().toString();
		System.out.println("�˻���"+balance);
		System.out.println("����Ϣ��"+monthlyInterestRate/100*balance);
		System.out.println("�������ڣ�"+dateCreated);
	}
}

class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	//���췽��
	public Account() {
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	//id�ķ��������޸���
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//balance�ķ��������޸���
	public double getBalance() {
		return balance;
	}
	public void setBanlance(double balance) {
		this.balance = balance;
	}
	
	//annualInterestRate�ķ��������޸���
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//dateCreated�ķ�����
	public Date getDateCreated() {
		return dateCreated;
	}
	
	//����������
	public double getMonthlyInterestRate() {
		double MonthlyInterestRate = annualInterestRate/12;
		return MonthlyInterestRate;
	}
	
	//���˻���ȡ�ض�����
	public void withDraw(double amount) {
		balance -= amount;
	}
	
	//���˻��洢�ض�����
	public void deposit(double amount) {
		balance += amount;
	}
}


