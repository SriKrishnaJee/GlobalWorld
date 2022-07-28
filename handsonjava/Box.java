package handsonjava;

public class Box {
	double height;
	double depth;
	double width;
	Box(double height, double depth, double width){
		this.height=height;
		this.depth=depth;
		this.width=width;
		
	}
	double getVolume() {
		return height*depth*width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(4.0,21.0,12.0);
		System.out.println("The volume of the BOx is "+box.getVolume());
	}

}
