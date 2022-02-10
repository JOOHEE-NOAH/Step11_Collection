package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx3 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String/*생략가능*/>();
		map.put(3, "해리포터");
		map.put(1, "헤르미온느");
		map.put(4, "론위즐리");
		map.put(2, "볼드모트");
		map.put(5, "지니위즐리"); 
	
		System.out.println(map);//map은 원칙적으로 순서가 없다.
	}

}
