package arraySamples;

public class HotelBookings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrival = { 1, 3, 5 };
		int[] departure = { 2, 6, 8 };
		int rooms = 2;
		System.out.println("Is booking possible for the given dates? " + bookingPossible(arrival, departure, rooms));
	}

	private static String bookingPossible(int[] a, int[] d, int r) {
		// TODO Auto-generated method stub
		int roomCount = 0;
		int dept = d[0];
		for (int i = 1; i < a.length; i++) {
			roomCount++;
			if (a[i] >= dept)
				roomCount--;
			else {
				if (r == roomCount)
					return "No";
				else
					roomCount++;
			}
			dept = d[i];
		}
		return "Yes";
	}

}
