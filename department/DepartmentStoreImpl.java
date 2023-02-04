package com.department;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.exception.InvalidChioceException;
import com.exception.ProductNotFoundException;

import Sorting.SortByCost;
import Sorting.SortById;
import Sorting.SortByName;
import Sorting.SortByQuantity;

public class DepartmentStoreImpl  implements DepartmentStore{

	 Scanner sc = new Scanner(System.in);
	Map<String,Product> db = new LinkedHashMap<String,Product>();
	
	@Override
	public void addProduct() {

		// Accept name ,cost ,quantity
		// Create an instance of product
		// Add into db -->put()-->Entry

		System.out.println("Enter  Product Name");
		String name = sc.next();
		System.out.println("Enter product cost");
		double cost = sc.nextDouble();
		System.out.println("Enter product quantity");
		double quantity = sc.nextDouble();

		Product p = new Product(name,cost,quantity);

		db.put(p.getId(), p);
		System.out.println("Product Added Successfully");

	}

	@Override
	public void remove() {

		System.out.println("Enter Product id");
		String id = sc.next();
		id = id.toUpperCase();

		if(db.containsKey(id))
		{
			db.remove(id);
			System.out.println("Product removed successfully");
		}
		else
		{
			try
			{
				throw new ProductNotFoundException("Product id Not Available");
			}
			catch(ProductNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}


	}

	@Override
	public void removeAll() {
		System.out.println(db.size()+" Product Available ");
		db.clear();
		System.out.println("Delete All Products Successfully");

	}

	@Override
	public void display() {

		System.out.println("Enter product id");

		String id = sc.next();
		id = id.toUpperCase();

		if(db.containsKey(id))
		{
			Product obj = db.get(id);
			//			System.out.println("Product id       : "+obj.getId());
			//			System.out.println("Product name     : "+obj.getName());
			//			System.out.println("Product cast     : "+obj.getCost());
			//			System.out.println("Product quantity : "+obj.getQuantity());
			System.out.println(obj);//toString() Overriden
		}
		else
		{
			try
			{
				throw new ProductNotFoundException("Product id Not Available");
			}
			catch(ProductNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
			//System.out.println("Product id Not Available");
		}

	}

	@Override
	public void displayAll() {

		Set<String> keys = db.keySet();
		for(String id : keys)
		{
			Product p = db.get(id);
			System.out.println(p);
		}

	}

	@Override
	public void update() {
		System.out.println("Enter your Product id");
		String id =  sc.next();
		id = id.toUpperCase();

		if(db.containsKey(id))
		{
			Product obj = db.get(id);

			System.out.println("1:Update Product name\n2:Update Product Cost \n3:Update Product Quantity\nEnter Your Choice");
			switch(sc.nextInt())
			{
			case 1:
			{
				//Product obj = db.get(id);
				System.out.println("Enter Product name");
				obj.setName(sc.next());
				System.out.println("Product name Update successfully");
				break;
			}
			case 2:
			{
				//Product obj = db.get(id);
				System.out.println("Enter Product Cost");
				obj.setCost(sc.nextDouble());
				System.out.println("Product Cost Update successfully");
				break;

			}
			case 3:
			{
				//Product obj = db.get(id);
				System.out.println("Enter Product Quantity");
				obj.setQuantity(sc.nextDouble());
				System.out.println("Product Quantity Update successfully");
				break;

			}
			}
		}
		else
		{
			try 
			{
				throw new Exception("Invalid Product id");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void count() {

		System.out.println(db.size()+" Product Available");

	}

	@Override
	public void sortProduct()
	{
		Set<String> keys = db.keySet();
		List<Product> list = new ArrayList<Product>();

		for(String key : keys)
		{
			list.add(db.get(key));// Adding Product Object From map to List
		}


		System.out.println("1:SortByid\n2:SortByName\n3:SortByCost\n4:SortByQuantity\nEnter your choice");
		int choice = sc.nextInt();
		System.out.println("Enter your Choice \n1:Ascending \n 2:Descending");
		int value = sc.nextInt();
		switch(choice)
		{
		
		case 1:
		{
			Collections.sort(  list   , new SortById());
			if(value == 2)
			{
			
			Collections.reverse(list);
			}
			display(list);
			break;
		}
		case 2:
		{
			Collections.sort(   list   , new SortByName());
			if(value == 2)
			{
			
			Collections.reverse(list);
			}
			display(list);
			break;
		}
		case 3:
		{
			Collections.sort(   list   , new SortByCost());
			if(value == 2)
			{
			
			Collections.reverse(list);
			}
			display(list);
			break;
		}
		case 4:
		{
			Collections.sort(   list   , new SortByQuantity());
			if(value == 2)
			{
			
			Collections.reverse(list);
			}
			display(list);
			break;
		}

		default :
		{
			try
			{
				throw new InvalidChioceException("Invalid Choice Please Enter Valid Choice");
			}
			catch(InvalidChioceException e)
			{
				System.out.println(e.getMessage());
			}
		}
		}
		
		
	}
	private void display(List<Product> pros )
	{
      for(Product pr : pros)
      {
    	  System.out.println(pr);
      }
	}
}




