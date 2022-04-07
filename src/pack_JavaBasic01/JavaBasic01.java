package pack_JavaBasic01;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaBasic01 {
	
	   // field
	   private String name;
	   private String id;
	   private String pw;
	   private int age;
	   private boolean ask;
	   private double height;
	   
	   
	   // constructor
	   public JavaBasic01(String name, String id, String pw, int age, double height) {
	      this.name = name;
	      this.id = id;
	      this.pw = pw;
	      this.age = age;
	      this.height = height;
	   }

	   // method
	   boolean Login(String id, String pw) {
	      if (id.equals("dhdlsrnr1231") && pw.equals("1231")) {
	         return true;
	      } else {
	         return false;
	      }
	   }

	   void logout() {
	      System.out.println("로그아웃 되었습니다.");
	   }

	   void println() {
	      System.out.println(this.ask);
	      System.out.println("이름:\t" + this.name);
	      System.out.println("나이:\t" + this.age + "세");
	      System.out.println(" \s 키:\t" + this.height + "척");
	   }

	   // Example
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   ArrayList<String> Info = new ArrayList<>();
		   System.out.print("이름 : ");
		   Info.add(sc.nextLine());
		   System.out.print("ID : ");
		   Info.add(sc.nextLine());
		   System.out.println("PW : ");
		   Info.add(sc.nextLine());
		   System.out.println("나이 : ");
		   Info.add(sc.nextLine());
		   System.out.println("키 : ");
		   Info.add(sc.nextLine());
		   
		   JavaBasic01 user = new JavaBasic01(Info.get(0), Info.get(1), Info.get(2), Integer.parseInt(Info.get(3)), Double.parseDouble(Info.get(4)));
		   boolean result = user.Login(Info.get(1).toString(), Info.get(2).toString());

		   if (result) {
	         System.out.println("로그인 되었습니다.");
	         user.println();
	         user.logout();
		   } else {
	         System.out.println("id 또는 password가 올바르지 않습니다.");
		   }
	   }
	}

