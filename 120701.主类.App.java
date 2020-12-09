package pac2;

public class App2 {

	public static void main(String[] args) {
		
		//示例
		int [][]array2d2={
				{1,2,3,4,5,6},
				{7,8,9,10,0,12},
				{7,8,9,10,11,12},
				{7,8,9,10,11,12},
				{88,66,22,44,33,77}
		};
		new Find().findZero2(array2d2);
		new Find().findLeft2(array2d2);
		new Find().findRight2(array2d2);
		new Find().findUp2(array2d2);
		new Find().findDown2(array2d2);
		
		
		int [][]array2d= {
				{0,1},
				{2,3},
				{4,5}	
		};
		new Find().findZero(array2d);
		new Find().findLeft(array2d);
		new Find().findRight(array2d);
		new Find().findUp(array2d);
		new Find().findDown(array2d);
	}
}
