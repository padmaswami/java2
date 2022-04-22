package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class bankaccountrepositoryimpl implements BankAccountRepository{
	
	@Autowired
	static JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public double getBalance(long accountid) {
		// TODO Auto-generated method stub
		String sql = " select balance  from bankAccount where accountid = ?";
		return jdbcTemplate.queryForObject(sql,new Object[] {accountid},Double.class);
	}

	@Override
	public double updateBalance(long accountid, double newBalance) {
		// TODO Auto-generated method stub
		String sql = "update bankaccount set balance = ? where accountid = ?";
		return jdbcTemplate.update(sql,newBalance,accountid);
	}

}
