package Results;

public class Results {

	public static void main(String[] args) {
	displayResults(70, 67, 80); 
		
	}
	private static void displayResults(int phy, int bio, int chem) {
		double totalMark = phy + bio + chem;
		System.out.println("Physics:" + phy);
		System.out.println("Biology:" + bio);
		System.out.println("Chemistry:" + chem);
		System.out.println("Total:" + totalMark);

		
		
	}

}
