


	package com.example.demo;

	import org.springframework.beans.factory.annotation.Autowired;

	public class BankAccountServiceImpl implements bankaccountservice {
		
		@Autowired
		BankAccountRepository repo;
		public void setRepo(BankAccountRepository repo) {
			this.repo = repo;
		}
		@Override
		public double withdraw(long accountid, double balance) {
			double currentBalance = repo.getBalance(accountid);
			if(currentBalance>balance) {
				currentBalance-=balance;
				repo.updateBalance(accountid, currentBalance);
			}
			return currentBalance;
		}
		@Override
		public double deposit(long accountid, double balance) {
			// TODO Auto-generated method stub
			double current = repo.getBalance(accountid);
			repo.updateBalance(accountid, current +balance);
			return repo.getBalance(accountid);
		}
		@Override
		public double getBalance(long accountid) {
			// TODO Auto-generated method stub
			return repo.getBalance(accountid);
		}
		@Override
		public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
			// TODO Auto-generated method stub
			try {
				double from_balance = repo.getBalance(fromAccount);
				if(from_balance > amount) {
					repo.updateBalance(fromAccount, from_balance - amount);
					double to_balance = repo.getBalance(toAccount);
					repo.updateBalance(toAccount, to_balance + amount);
					return true;
				}
			}
			catch(Exception e) {
				return false;
			}
			return false;
		}

	

}
