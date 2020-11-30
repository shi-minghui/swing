package pac2;

public class R {
	static void gender() {
		String boy_filePath ="img/boy.jpg";
		String girl_filePath ="img/girl.jpg";
		System.out.print(boy_filePath+" ");
		System.out.println(girl_filePath);
		int array2d[][]= {
				{1,2,4},
				{5,6,7},
				{8,9,10}
		};
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				System.out.print(array2d[row][column]+" ");
			}
			System.out.println();
		}
	}
}
