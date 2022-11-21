package org.study.collection;

public class GStack<T> {

	public int idx;//배열의 인덱스
	
	public Object[] oStack;
	
	public GStack() {
		idx=0;
		oStack=new Object[10];//Object 배열 10개
	}
	
	//push매서드-> idx->0~9번지까지 1씩 증가 10번지가 되면 중단
	//매개변수로 입력받은 인자를 oStack배열에 추가
	
	public void push(T element) {
		if(idx==10) {
			return;//10번지 중단
		}
		oStack[idx]=element;//매개변수로 입력받은 인자를 oStack배열에 추가(10개)
		idx++;//1~9번지		
	}
	//pop매서드->배열 oStack 마지막 번지부터 첫번째 번지까지 값을 출력
	//0번지가 되면 중단
	public T pop() {
		if(idx==0) {
			return null;
		}		
		idx--;//10->9
		return (T) oStack[idx];
	}
	
	
	
	
	
	
	
	
}
