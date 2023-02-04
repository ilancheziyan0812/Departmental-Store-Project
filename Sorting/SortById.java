package Sorting;

import java.util.Comparator;

import com.department.Product;

public class SortById  implements Comparator<Product>{

	@Override
	public int compare(Product x, Product y) {
		// TODO Auto-generated method stub
		return x.getId().compareTo(y.getId());
	}

}
