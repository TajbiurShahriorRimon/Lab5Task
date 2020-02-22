package Lab5Triangle;

public class Triangle {
	private int x;
	private int y;
	private int z;
	public Triangle(int x, int y, int z) {
		//super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Triangle(){
	
	}
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public void testTriangle(){
		if(x == y && x == z && z == y){
			System.out.println("Equilateral. 3 equal sides");
	}
	else if(x == y || y == z || z == x){
		System.out.println("Isoceles. 2 equal sides");
	}
	else{
		System.out.println("Scalane. No equal sides");
	}
	}
	public void showInfo(){
		System.out.println(x + " " +y + " " + z);
	}
}