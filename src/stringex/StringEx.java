package stringex;

public class StringEx {

	public static void main(String[] args) {
		//뮤터블 자료형, 문자열 내부의 내용에 대한 변경 가능 자료형
	StringBuffer st=new StringBuffer();// 문자열 객체 만들어줌	
	st.append("abc");
	st.append(" 123");
	st.append(" 가나다");
	
	System.out.println(st);
	
	System.out.println("용량 : "+st.capacity()); //현재의 용량을 리턴
	System.out.println("길이 : "+st.length()); //글자길이
	
	st.delete(3, 6);// 스트링버퍼로 만든거 딜리트 가능 3~6미만만큼 제거
	System.out.println(st);
	System.out.println(st.reverse());//역순
	st.trimToSize();//용량 조절 가능
	System.out.println("용량 : "+st.capacity());
	
	String buf="abc";//이뮤터블 자료형, 문자열 내부의 내용에 대한 변경 불가 자료형// 따라서 딜리트 사용 불가
	buf+=" 123";
	buf+=" 가나다";
	System.out.println(buf);
		
		
//-------------------2-------------------------------		
//		String str1="korea";
//		String str2=" fighting";
//		
//		String str3=str1.concat(str2);// concat  str1과 st2를 연결하다.
//		String str4=str3.substring(6); //지정한 인데스 부터 문자열의 끝까지 리턴
//		String str5=str3.substring(6,11); // 6이상11미만 인덱스까지 리턴
//		String str6=str3.toUpperCase();//대문자로 바꾸기
//		String str7=str6.toLowerCase();//소문자로 바꾸기
//		
//		
//		System.out.println(str3);
//		System.out.println(str1+str2);
//		System.out.println(str4);
//		System.out.println(str5);
//		System.out.println(str6);
//		System.out.println(str7);
//		System.out.println(str3.getBytes());//문자열에 대한 크기 리턴
//		System.out.println(str3.lastIndexOf("t"));//표현하고자하는 값을 표현 t->10번째 자리다.4
//		System.out.println(str3.format(str7,args)); //필요한 서식 지정해서 출력
//		
//		
		
//----------------1---------------------------------		
//		String s1="hello";
//		String s2="hello";
//		String s3=s2;
//		String s4=new String("hello");
//		String s5=new String("hello");
//		
//		
//		System.out.println(s1==s2);//true로 뜸
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s3));// 이 방식을 더 쓸것.
//		System.out.println(s1.equals(s2));
//		System.out.println(s4.hashCode());
//		System.out.println(s5.hashCode());
//		System.out.println(s4==s5);//hello라는 값을 비교한느게 아니고 선언된 객체를 비교. 객체는 이퀄스로 비교
//		System.out.println(s4.equals(s5));//true. 객체의 내용을 비교
	}

}
