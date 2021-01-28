package p06_generics;
//키와 값을 저장하는 클래스

//상품클래스
//필드:상품명(key),판매수량(value)
//학생 클래스
//필드:학생명(key),번호(value)

//K:key의 형, V:value의 형
class GObject<K,V>{ 
	private K key;
	private V value;
	GObject(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "GObject [key=" + key + ", value=" + value + "]";
	}
	
	
}

public class J201221_04_item {

	public static void main(String[] args) {
		//상품 판매량 저장객체
		GObject<String,Integer> item=new GObject<>("콜라", 1500);
		System.out.println(item);
	}

}
