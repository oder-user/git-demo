/**
	this is test
	@author liuwei
	@version v1.0
	

*/


public class HelloJava {
	public static void main(String[] args) {
		long number=12345L;
		float num=123.4f;
		System.out.println(num);
		System.out.print("name:");
		System.out.println("刘伟");
		System.out.println();
		System.out.print("gender:");
		System.out.println("male");
		System.out.print("家庭住址");
		System.out.println("北京");

		int num1=12;
		int num2 = 24;
		int num3 = 45;
		int max1 =(num1>num2)?num1:num2;
		int max2 = (max1>num3)?max1:num3;
		System.out.println("max="+max2);

		double num4 = 12.3;
		double num5 = 34.5;
		if(num4 > 10.0 && num5 < 20){
			System.out.println(num4+num5);
		}else{
			System.out.println(num5-num4);
		}

		}
}


void test(){>>>got-fix
System.out.println();>>>>test
}


