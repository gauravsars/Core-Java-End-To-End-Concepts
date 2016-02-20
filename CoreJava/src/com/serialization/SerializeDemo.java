package com.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.bean.Address;
import com.bean.Country;
import com.bean.Employee;

public class SerializeDemo {
	public static void main(String [] args)
	   {
	      Employee e = new Employee();
	      
	      e.name = "Reyan Ali";
	      Address add = new Address ("Phokka Kuan, Ambehta Peer", new Country("Pune", "MH 12"),"MG Street","PUne");
	      e.setAddress(add);
	      e.SSN = 11122333;
	      e.number = 101;
	      
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("employee.txt");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(add);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
}
