package Sorting;

import java.util.Comparator;

import com.department.Product;

public class SortByCost implements Comparator<Product> {
	@Override
	public int compare(Product x, Product y) {
		// TODO Auto-generated method stub
		Double x1 = x.getCost();
		Double y1 = y.getCost();
		return x1.compareTo(y1);
	}
}
