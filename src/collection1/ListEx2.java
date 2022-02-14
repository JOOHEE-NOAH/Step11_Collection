package collection1;

import java.util.ArrayList;
import java.util.List;

//제네릭스(generics)
public class ListEx2 {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>(); //<String>:받아쓰는애는 String자료형이어야한다는 의미//object자료형은 수퍼
		
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(Integer.valueOf(10));//  근데 그러면 이건 자료형이 안맞아서 에러뜸 따라서 위의 <String>을 <Object>로 바꿔주면 아무거나 사용가능(부모 클래스의 자료형이면 다른 자료형도 사용 가능하다.)
		list.add(4.0f);
		list.add(10.0);
		
		System.out.println(list);
	}

}
