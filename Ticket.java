

import java.util.Scanner;
class  Ticket{
	public static void main(String[] args) {
		int ticketnumber = (int)(Math.random()*90+10);
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int num = scan.nextInt();
		int ticketbai = ticketnumber / 10;
		int ticketge = ticketnumber % 10;
		int bai = num / 10;
		int ge = num % 10;
		if(num == ticketnumber){
			System.out.println("��ϲ�㣬��ý���10000��Ԫ");
		}else if((bai==ticketge) &&(ge == ticketbai)){
			System.out.println("��ϲ�㣬��ý���3000��Ԫ");
		}else if((bai==ticketbai) ||(ge == ticketge)){
			System.out.println("��ϲ�㣬��ý���1000��Ԫ");
		}else if((bai==ticketge) || (ge ==ticketbai)){
			System.out.println("��ϲ�㣬��ý���500��Ԫ");
		}else{
			System.out.println("���ź�����û���н�");
		}
		System.out.println("�н�������:"+ticketnumber);
	}
}
