package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//리스트: 서로다른 자료형의 연속된 기억공간
//List(인터페이스): 중복허용 o 순서유지o
//배열과 유사, 담을 수 있는 값의 개수가 자동으로 증가
public class ListEx1 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("one");// 마찬가지로 객체 자료형 와야함
		list.add("second");
		list.add("3rd");
		list.add(4);
		list.add(new Integer(4));
		list.add(Double.valueOf(4));
		list.add("second");
		for(int i=0;i<100000;i++) {
			list.add(i);
		}
	//	System.out.println(list);
		
		//-----Iterator-----
		long start=System.currentTimeMillis();//시작시점
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}	
		long end=System.currentTimeMillis();//종료시점
		
		
		//-----향상된 for문-----
		long _start=System.currentTimeMillis();
		for(Object ob:list) 
			System.out.println(ob);
		long _end=System.currentTimeMillis();
		
		//----- for문-----
		long __start=System.currentTimeMillis();
		for(int i=0;i<list.size();i++) 
			System.out.println(list.get(i));
		long __end=System.currentTimeMillis();
		
		System.out.println("====="+(end-start));//iterator쓰면 속도 느림
		System.out.println("====="+(_end-_start));//향상된 for문이 젤 속도 빠름
		System.out.println("====="+(__end-__start));//for문 속도 빠름
		//그렇지만 상황에 따라 속도 서로 차이 얼마 안날수도 있음.
		
		System.out.println(list.get(2)); //get(index) 인덱스에 해당하는 값을 리턴
		System.out.println(list.size()); //size(): list의 데이터 개수리턴
		System.out.println(list.remove("second"));
		list.remove("second1");
		list.remove(0);
		
		System.out.println(list.remove(0)); //해당 인덱스의 값을 삭제
		list.clear(); //리스트가 가진 데이터를 모두 삭제
		System.out.println(list);
	}

}
