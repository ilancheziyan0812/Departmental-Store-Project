package Sorting;

import java.util.Comparator;

import com.department.Product;



public class SortByName implements Comparator<Product> {

	
	

	@Override
	public int compare(Product x, Product y) {
		// TODO Auto-generated method stub
		return x.getName().compareTo(y.getName());
	}

	
	
}
