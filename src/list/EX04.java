package list;

import java.util.ArrayList;
import java.util.Scanner;


public class EX04 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	Scanner input = new Scanner(System.in);

for(int i = 0;i<3;i++) {
	System.out.println(i+1+".번째 메뉴 등록");
	//String menu = input.next();
	arr.add(input.next() );
}
System.out.println("====등록된 메뉴====");
System.out.println(arr);
System.out.println("========");
System.out.println("수정할 메뉴 입력");
String search = input.next();
System.out.println(arr.conta
		ins(search)); //메뉴 수정
System.out.println(arr.indexOf(search)); 
System.out.println("------------------");
int index = arr.indexOf(search);
if(index != -1) {//해당 메뉴는 존재한다
	//arr = [김밥,라면,순대]
	System.out.println("수정할 이름 입력");
	String change = input.next();
	System.out.println(arr.get(index)+"=>"+change);
	arr.set(index, change);
	System.out.println("수정 후 arr :"+arr);
}else {//존재하지 않는 메뉴
	System.out.println("존재하지 않는 메뉴는 수정 불가!!");
}
}
}
