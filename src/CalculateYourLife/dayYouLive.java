package CalculateYourLife;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dayYouLive {
	public static void main(String []args) throws ParseException {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	SimpleDateFormat a = new SimpleDateFormat(
			"yyyy-MM-dd"
			);
	Date date=a.parse(str);
	Date now = new Date();
	System.out.println(now.getTime());
	long time = now.getTime()- date.getTime();
	time = time /1000/60/60/24;
	System.out.println("��ϲ�㣬�Ѿ�����"+time);
	
	// ��10000���ʣ������
	time = 10000-time;
	System.out.println("����10000��ʣ��"+time);
	// 10000�������
	//long  time2=date.getTime();
	 //time2 += 10000*1000*60*60*24; // ����������int�����ˣ�������
	 //now.setTime(time2);
	now.setTime(now.getTime()+time*60*1000*60*24);
	long time2 = now.getTime()+time*60*1000*60*24;
	System.out.println("10000���������"+a.format(now));
	//System.out.println(time2);
	System.out.println(date.getTime());
	long a2 =10000l*1000*60*60*24; //�����Ȼ�����711573504
	System.out.println(a2);   // ��Ϊ������int ��ʾ����Ŀ��
}
}
