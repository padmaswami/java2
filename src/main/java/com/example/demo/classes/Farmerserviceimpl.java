package com.example.demo.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.FarmerBudjetRepository;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Repository.farmerRepository;

@Service
public class Farmerserviceimpl implements FarmerService  {
@Autowired
farmerRepository f1;
@Autowired
ProductRepository p;
@Autowired
FarmerBudjetRepository fbr;
 farmer f6;


FarmerBudjet fb;

HashMap<Integer,List<product>> h = new HashMap<Integer,List<product>>();
	@Override
	public List<farmer> fetchdetails() {
		List<farmer> list = f1.findAll();
		return list;
		
		}
	@Override
	public farmer addfarmer(farmer f12) {
		return f1.save(f12);
	}
	/*@Override
	public void deletefarmer(farmer f2) {
		f1.delete(f2);
		
	}
	@Override
	public farmer addfarmerbyid(int fid) {
		return f1.save(f1.getById(fid));
	}*/
	
	
  @Override
  public farmer deletebyId(int fid) {
	  farmer f4 = f1.getById(fid);
	  f1.deleteById(fid);
	  return f4;
  }
  @SuppressWarnings("static-access")
@Override
  public List<farmer> sortbyname(){
	
	  ArrayList<List<farmer>> l = new ArrayList<List<farmer>>();
	  List<farmer> list = f1.findAll();
		list = list.stream().sorted((o1,o2) ->o1.getFname().valueOf(o2).compareTo(o2.getFname().valueOf(o1)) ).collect(Collectors.toList());
	 // l.sort((Comparator<? super List<farmer>>) list);
	return list;
	  
 }
  @Override
  public List<product> fetchproductlist(){
	  
List<product> list = p.findAll();
	return list;
	  
  }
 
 public HashMap<Integer,List<product>> mapping(int fid,int pid){
	 List<product> list = p.findAll();
	  h.put(fid, list);
	  
	return h;
	  
  }
@Override
public void calctotalexpenses() {
	double totalexpenses = fb.getMincome()-fb.getMexpenses();
	System.out.println(+totalexpenses);
	// TODO Auto-generated method stub
	
}
@Override
public String calcgovtsubsidy() {
	try {
		 if(fb.getLoanamt()>100000&&fb.getLoaninterest()>10&&fb.getNoofyears()>4) {
			 double govtsubsidy = 400000;
			 System.out.println(+govtsubsidy);
			
		 }
		 else  {
			 double govtsubsidy = 300000;
			 System.out.println(+govtsubsidy);
		 }
		
	}catch(ArithmeticException e)
	{
		return "sorry";
	}
	return "govtsubsidy";
 
}

@Override
public String updatedetails(farmer f3 ){
	if(f1.getById(f3.getFid()) != null) {
		f1.save(f3);
		
		return "Upadation is successful";
	}
	else
		return "Farmer with the given id is not found";
	
}
@Override
public boolean loginfarmer(int username ,String password)  {

	try {
		farmer f = f1.getById(username);
		if(f!=null) {
			if(f.getFid()==username&& f.getFpasswd().equalsIgnoreCase(password) ) {
				return true;}
				else
				{
					
					return false;
				}
		}
		
		
	}catch(InputMismatchException i) {
		return false;
	}
	return false;
	
	// TODO Auto-generated method stub
	
}

}

