package ch02;

public class GenericPrinter<T> {
	
	// T라는 대체 문자를 사용, E - element, K- key, V -value(사실은 아무 문자나 가능하다)
	// 자료형 매개 변수(type parameter)
	// 이 클래스를 사용하는 시정에서 실제 사용될 자료형이 결정 된다.
	
	private T material; // T 대체 문자형으로 변수를 선언
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// GenericPrinter<T>  -- 참조 변수를 sysout (참조변수) --> 나의멤버 material 에  toString() 설계
	@Override
	public String toString() {
		return material.toString();
	}
	
}
