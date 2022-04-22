package com.example.demo.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface FarmerService  {
	
	
  public List<farmer> fetchdetails();

public farmer addfarmer(farmer f1);

//void deletefarmer(farmer f2);

//public farmer addfarmerbyid(int fid);

public farmer deletebyId(int fid);

List<product> fetchproductlist();

public void calctotalexpenses();

String calcgovtsubsidy();







boolean loginfarmer(int username, String password);



String updatedetails(farmer f3);

List<farmer> sortbyname();


}
