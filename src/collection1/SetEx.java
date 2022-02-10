package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set : 집합, 중복허용 x, 순서유지x
//입력값들 중에서 고유한 값 1개만 저장하는 특성을 가지는 컬렉션
public class SetEx {
		@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		Set set=new HashSet();//Set 꼭 자동완성으로 하자
		set.add("one");//add(Object)를 대입.반드시 참조자료형이어야함
		set.add(Double.valueOf(2));
		set.add(2);//int-->Integer로 변환 후 대입 (Boxing)
		set.add(new Float(3));//동작은 됨.
		set.add(Integer.valueOf(4));
		set.add(2.0);
		
		System.out.println(set);
		
		if(set.contains("one"))
			System.out.println("ㅇㅇ 있음");
		else
		System.out.println("없어요 없어..");
		
		System.out.println(set.size());
		
		Iterator iter=set.iterator();//이터레이터 메소드:set의 값을 가지는 iterator  데이터 타입의 인스턴스 iter
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		}

}
