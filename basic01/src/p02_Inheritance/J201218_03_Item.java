package p02_Inheritance;
interface ItemInterface{ //품목
	String itemType();
}


public class J201218_03_Item {

	public static void main(String[] args) {
		// 익명클래스 만들기
		ItemInterface item=new ItemInterface() {
			private String name="라면";
			@Override
			public String itemType() {
				return "공산품";
			}
			@Override
			public String toString() {
				return name;
			}
			
		};
		System.out.println(item.itemType());
		System.out.println(item);
	}

}
