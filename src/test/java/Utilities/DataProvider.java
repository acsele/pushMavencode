package Utilities;

public class DataProvider {
	
	
	@org.testng.annotations.DataProvider
	public Object[][] getdata(){
		
		Object[][] data = new Object[][]{
		
		{"pixel"},
		{"samsung"},
		{"iphone"}
	};
	return data;

}}
