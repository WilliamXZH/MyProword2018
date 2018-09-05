
public class GenericDemo07 {

	public static void main(String[] args) {
		String arr[] = {"www","jiekexueyaun","com"};
		tell(arr);
	}
	
	public static <T>void tell(T arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
}
