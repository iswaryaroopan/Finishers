package LaunchOOPS;
class Book{
	private int pageNo;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		if(pageNo>=0) {
			this.pageNo = pageNo;
		}else {
			System.out.println("Invalid page no, it should be greater than 0");
		}
		
	}
	
	
}
public class LaunchEncapsulation {

	public static void main(String[] args) {
		Book b = new Book();
		
		b.setPageNo(-1);
		System.out.println(b.getPageNo());

	}

}
