public class ArrayController {
	private int[] nums;
	
	public ArrayController() {
		nums = new int[] {23, 67, 8, 91, 45, 12, 78};
	}
	
	public void setNums(int[] num) {
		this.nums = nums;
	}
	
	public int[] getNums(){
		return nums;
	}
	
	public int getSize() {
		return nums.length;
	}
	
	public void display(String message) {
		System.out.print(message);
		boolean first_element = true;
		for (int i=0; i<nums.length; i++) {
			///if (first_element == false) {
				///System.out.print(", ");
			///}
			System.out.print((!first_element ? "," : "")+i);
			first_element = false;
		}
	}
}
