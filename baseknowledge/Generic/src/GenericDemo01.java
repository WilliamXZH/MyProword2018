class Point<T> {
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
}

/**
 * 经纬度 int float String
 * 
 * @author william zeky
 */

/**
 * 
 * Project Name: Generic Class Name: GenericDemo01 Class Description:
 * 
 * @author william zeky Create Time: 2018年1月29日 上午11:16:22
 * 
 *         Modified By: william zeky Modified Time: %{date} 上午11:16:22 Modified
 *         Remarks:
 *
 * @version
 * @Copyright
 */
public class GenericDemo01 {

	public static void main(String[] args) {

//		Point p = new Point();
//		p.setX(10);
//		p.setY(10);
//		int px = (Integer)p.getX();
//		int py = (Integer)p.getY();
		
		Point<Integer> p = new Point<Integer>();
		p.setX(10);
		p.setY(100);
		
		System.out.println("x=" + p.getX() + "    y=" + p.getY());
		
	}

}
