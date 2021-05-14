import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> countryNameSet = country("India", "U.K", "U.S", "Canada", "China");
		Set<Integer> numberSet = gettingFirstTenNumbers();
		Set<Integer> modifiedNumberSet = gettingFirstFifteenNumbers();
		for (String countryName : countryNameSet) { // Iterating country list by using forEach loop.
			System.out.println(countryName);
		}
		for (Integer integer : numberSet) { // iterating List by using forEach loop.
			System.out.println(integer);
		}
		Iterator<Integer> itr = modifiedNumberSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	/**
	 * Method implementation that takes 5 strings (country names) as parameters,
	 * adding them into HashSet and returns the HashSet
	 **/
	public static Set<String> country(String country1, String country2, String country3, String country4,
			String country5) {
		Set<String> countrySet = new HashSet<>();
		countrySet.add(country1);
		countrySet.add(country2);
		countrySet.add(country3);
		countrySet.add(country4);
		countrySet.add(country5);
		return countrySet;
	}

	/**
	 * Method implementation for adding 1-10 numerics into HashSet and returns it.
	 **/
	public static Set<Integer> gettingFirstTenNumbers() {
		Set<Integer> numberSet = new HashSet<>();
		for (int i = 1; i <= 10; i++) {
			numberSet.add(i);
		}
		return numberSet;
	}

	/**
	 * Method implementation for adding 1-15 numerics into HashSet and returns it.
	 **/
	public static Set<Integer> gettingFirstFifteenNumbers() {
		Set<Integer> modifiedNumberSet = new HashSet<>();
		modifiedNumberSet.addAll(gettingFirstTenNumbers());
		for (Integer i = 11; i <= 15; i++) {
			modifiedNumberSet.add(i);
		}
		return modifiedNumberSet;
	}
}
