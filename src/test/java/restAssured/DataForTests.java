package restAssured;
import org.testng.annotations.DataProvider;

public class DataForTests {

	@DataProvider(name="DataForPost")
	public Object [][] dataForPost() {
		
//		Object[][] data = new Object[2][3];
//			data [0][0] = "Leonard";
//			data [0][1] = "Hoftsteder";
//			data [0][2] = 2;
//			data [1][0] = "Sheldon";
//			data [1][1] = "Cooper";
//			data [1][2] = 1;
//			
//			return data;
		
		return new Object[][] {
			{"Graham", "Bell", 1},
			{"Henry", "Ford", 1}
		};
			
	}

	@DataProvider(name= "DeleteData")
	public Object[] dataForDelete() {
		
		return new Object[] {
			4,5,6,7	
		};
	}
	
}
