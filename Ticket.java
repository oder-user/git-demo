

import java.util.Scanner;
class  Ticket{
	public static void main(String[] args) {
		int ticketnumber = (int)(Math.random()*90+10);
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个两位数");
		int num = scan.nextInt();
		int ticketbai = ticketnumber / 10;
		int ticketge = ticketnumber % 10;
		int bai = num / 10;
		int ge = num % 10;
		if(num == ticketnumber){
			System.out.println("恭喜你，获得奖金10000美元");
		}else if((bai==ticketge) &&(ge == ticketbai)){
			System.out.println("恭喜你，获得奖金3000美元");
		}else if((bai==ticketbai) ||(ge == ticketge)){
			System.out.println("恭喜你，获得奖金1000美元");
		}else if((bai==ticketge) || (ge ==ticketbai)){
			System.out.println("恭喜你，获得奖金500美元");
		}else{
			System.out.println("很遗憾，你没有中奖");
		}
		System.out.println("中奖号码是:"+ticketnumber);
	}
}
