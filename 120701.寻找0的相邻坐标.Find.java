package pac2;

public class Find {
	
	//示例
	void findZero2(int array2d2[][]) {
		for (int row = 0; row < array2d2.length; row++) {
			for (int column = 0; column < array2d2.length; column++) {
				if (array2d2[row][column]==0) {
					System.out.println("R_zero2("+column+","+row+")");
				}
			}
		}
	}
	void findLeft2(int array2d2[][]) {
		for (int row = 0; row < array2d2.length; row++) {
			for (int column = 0; column < array2d2.length; column++) {
				if (array2d2[row][column]==0) {
					int leftX=column-1;
					System.out.println("R_left2("+leftX+","+row+")");
				}
			}
		}
	}
	void findRight2(int array2d2[][]) {
		for (int row = 0; row < array2d2.length; row++) {
			for (int column = 0; column < array2d2.length; column++) {
				if (array2d2[row][column]==0) {
					int rightX=column+1;
					System.out.println("R_right2("+rightX+","+row+")");
				}
			}
		}
	}
	void findUp2(int array2d2[][]) {
		for (int row = 0; row < array2d2.length; row++) {
			for (int column = 0; column < array2d2.length; column++) {
				if (array2d2[row][column]==0) {
					int upY=row-1;
					System.out.println("R_up2("+column+","+upY+")");
				}
			}
		}
	}
	void findDown2(int array2d2[][]) {
		for (int row = 0; row < array2d2.length; row++) {
			for (int column = 0; column < array2d2.length; column++) {
				if (array2d2[row][column]==0) {
					int downY=row+1;
					System.out.println("R_down2("+column+","+downY+")");
				}
			}
		}
	}
	
	
	//第二个
	void findZero(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d.length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_zero("+column+","+row+")");
				}
			}
		}
	}
	void findLeft(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d.length; column++) {
				if (array2d[row][column]==0) {
					int leftX=column-1;
					System.out.println("R_left("+leftX+","+row+")");
				}
			}
		}
	}
	void findRight(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d.length; column++) {
				if (array2d[row][column]==0) {
					int rightX=column+1;
					System.out.println("R_right("+rightX+","+row+")");
				}
			}
		}
	}
	void findUp(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d.length; column++) {
				if (array2d[row][column]==0) {
					int upY=row-1;
					System.out.println("R_up("+column+","+upY+")");
				}
			}
		}
	}
	void findDown(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d.length; column++) {
				if (array2d[row][column]==0) {
					int downY=row+1;
					System.out.println("R_down("+column+","+downY+")");
				}
			}
		}
	}
}
