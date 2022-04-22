package com.example.demo.classes;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FarmerBudjet {
	@Id
	public int fid;
	public String username;
	public double mincome;
	public double loanamt;
	public double loaninterest;
	public double noofyears;
    public double mexpenses;
    public double profit;
  
	public FarmerBudjet() {
		super();
	}
	public FarmerBudjet(int fid, String username, double mincome, double loanamt, double loaninterest, double noofyears,
			double mexpenses, double profit) {
		super();
		this.fid = fid;
		this.username = username;
		this.mincome = mincome;
		this.loanamt = loanamt;
		this.loaninterest = loaninterest;
		this.noofyears = noofyears;
		this.mexpenses = mexpenses;
		this.profit = profit;
		
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getMincome() {
		return mincome;
	}
	public void setMincome(double mincome) {
		this.mincome = mincome;
	}
	public double getLoanamt() {
		return loanamt;
	}
	public void setLoanamt(double loanamt) {
		this.loanamt = loanamt;
	}
	public double getLoaninterest() {
		return loaninterest;
	}
	public void setLoaninterest(double loaninterest) {
		this.loaninterest = loaninterest;
	}
	public double getNoofyears() {
		return noofyears;
	}
	public void setNoofyears(double noofyears) {
		this.noofyears = noofyears;
	}
	public double getMexpenses() {
		return mexpenses;
	}
	public void setMexpenses(double mexpenses) {
		this.mexpenses = mexpenses;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	
	@Override
	public String toString() {
		return "FarmerBudjet [fid=" + fid + ", username=" + username + ", mincome=" + mincome + ", loanamt=" + loanamt
				+ ", loaninterest=" + loaninterest + ", noofyears=" + noofyears + ", mexpenses=" + mexpenses
				+ ", profit=" + profit + "]";
	}
   
     
}
