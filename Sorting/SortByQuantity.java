package Sorting;
import java.util.Comparator;

import com.department.Product;

public class SortByQuantity implements Comparator<Product> {
	/*
	 * In Sorting using double change in to wrapper class 
	 *  Double x1 = x.getQuantity();
	 *  Double y1 = y.getQuantity();
	 *  x1 and y1 compare the logic
	 * */
	@Override
	public int compare(Product x, Product y) {
		// TODO Auto-generated method stub
		Double x1 = x.getQuantity();
		Double y1 = y.getQuantity();
		return x1.compareTo(y1);
	}
}
