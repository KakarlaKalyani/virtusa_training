import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> countryNameList = country("India", "U.K", "U.S", "Canada", "China");
		List<Integer> numberList = numbersList();
		List<Integer> modifiedNumberList = modifyNumbersList();
		for (String countryName : countryNameList) { // Iterating country list by using forEach loop.
			System.out.println(countryName);
		}
		for (int i = 0; i < numberList.size(); i++) { // iterating List by using for loop.
			System.out.println(numberList.get(i));
		}
		Iterator<Integer> itr = modifiedNumberList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	/**
	 * Method implementation that takes 5 strings (country names) as parameters,
	 * adding them into arrayList and returns the arrayList
	 **/
	public static List<String> country(String country1, String country2, String country3, String country4,
			String country5) {
		List<String> countryList = new ArrayList<>();
		countryList.add(country1);
		countryList.add(country2);
		countryList.add(country3);
		countryList.add(country4);
		countryList.add(country5);
		return countryList;
	}

	/**
	 * Method implementation for adding 1-10 numerics into arrayList and returns it.
	 **/
	public static List<Integer> numbersList() {
		List<Integer> n = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			n.add(i);
		}
		return n;
	}

	/**
	 * Method implementation for adding 1-15 numerics into arrayList and returns it.
	 **/
	public static List<Integer> modifyNumbersList() {
		List<Integer> modifiedNumberList = new ArrayList<>();
		modifiedNumberList.addAll(numbersList());
		for (Integer i = 11; i <= 15; i++) {
			modifiedNumberList.add(i);
		}
		return modifiedNumberList;
	}
}
