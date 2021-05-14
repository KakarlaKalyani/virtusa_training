import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> studentDetailsMap = studentsDetails();
		for (Map.Entry<Integer, String> student : studentDetailsMap.entrySet()) {
			System.out.println("Roll Number:" + student.getKey() + "  " + "Student Name:" + student.getValue());
		}
	}

	/**
	 * Method implementation for adding 3 students details into HashMap with roll
	 * no. and name as key, value pair in hashMap
	 **/
	public static Map<Integer, String> studentsDetails() {
		Map<Integer, String> studentHashMap = new HashMap<>();
		studentHashMap.put(1, "Kalyani");
		studentHashMap.put(2, "Deepika");
		studentHashMap.put(3, "Sasivarna");
		return studentHashMap;
	}
}
