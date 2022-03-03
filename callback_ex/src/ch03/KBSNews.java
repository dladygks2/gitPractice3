package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class KBSNews implements WriteArticle{

	private String printDate() {
		DateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());
	}
	
	
	@Override
	public void printArticle(String article) {
		// TODO Auto-generated method stub
		System.out.println("KBS �ѱ���� KBS");
		System.out.println();		
		System.out.println(article);		
		System.out.println();		
		System.out.println("��� �ۼ��� : " + printDate());		
	}

}