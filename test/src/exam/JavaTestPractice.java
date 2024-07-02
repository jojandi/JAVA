package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaTestPractice {

   public static void main(String[] args) {

      // 커피 키오스크
      // 1. 메뉴 선택하는 창이 필요
      // 2. 메뉴를 선택했으면 옵션을 선택
      // 3. 옵션에 따라 출력
      
      Scanner scan = new Scanner(System.in);
      ArrayList list = new ArrayList();
      
      String cart = "";
      int price = 0;
      
      while(true) {
         System.out.println("----------------------------------------------------------");
         System.out.println("1. 주문하기 | 2. 결재하기 | 3. 장바구니 | 0. 종료");
         System.out.println("----------------------------------------------------------");
         int one = scan.nextInt();
         
         if(one == 1) { // 1. 주문하기
            System.out.println("메뉴를 선택하세요.");
            System.out.println
            ("1. 아메리카노(2000원) | 2. 카페라떼(3000원) | 3. 아이스티(2500원) | 0. 종료");
            System.out.println("----------------------------------------------------------");
            int you = scan.nextInt();
            
            if(you == 1) { // 아메리카노
               System.out.println("-- 아메리카노 --");
               System.out.println("추가 옵션을 선택하세요. ");
               System.out.println("1. 얼음양 | 2. 샷 | 0. 선택 없음");
               int op = scan.nextInt();
               
               String sum = "아메리카노";
               price += 2000;
               
               if(op == 1) { // 얼음양
                  System.out.println("-- 얼음양 --");
                  System.out.println("1. 많이 | 2. 보통 | 3. 적게");
                     int i = scan.nextInt();
                     
                     if(i == 1) {
                        sum += " : 얼음 많이  ";
                     } else if(i == 2) {
                        sum += " : 얼음 보통  ";
                     } else if(i == 3) {
                        sum += " : 얼음 적게  ";
                     } 
                     
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
                  
               } else if(op == 2) { // 샷
                  System.out.println("-- 샷 --");
                  System.out.println("1. 샷 추가(+500원) | 2. 연하게");
                  int i = scan.nextInt();
                  
                  if(i == 1) {
                     sum += " : 샷 추가  ";
                     price += 500;
                  } else if(i == 2) {
                     sum += " : 연하게  ";
                  } 
                  
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
               } else if(op == 0) {
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
               } else {
                  System.out.println("존재하지 않는 선택지입니다. ");
               }
               System.out.println(sum+"- 장바구니 추가");
            } // 아메리카노 끗
            else if(you == 2) { // 카페라뗴
               System.out.println("-- 카페라떼 --");
               System.out.println("추가 옵션을 선택하세요. ");
               System.out.println
               ("1. 얼음양 | 2. 샷 | 3. 휘핑크림 추가(+500원) | 0. 선택 없음");
               int op = scan.nextInt();
               
               String sum = "카페라뗴";
               price += 3000;
               
               if(op == 1) { // 얼음양
                  System.out.println("-- 얼음양 --");
                  System.out.println("1. 많이 | 2. 보통 | 3. 적게");
                     int i = scan.nextInt();
                     
                     if(i == 1) {
                        sum += " : 얼음 많이  ";
                     } else if(i == 2) {
                        sum += " : 얼음 보통  ";
                     } else if(i == 3) {
                        sum += " : 얼음 적게  ";
                     } 
                     
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
                  
               } else if(op == 2) { // 샷
                  System.out.println("-- 샷 --");
                  System.out.println("1. 샷 추가 | 2. 연하게");
                  int i = scan.nextInt();
                  
                  if(i == 1) {
                     sum += " : 샷 추가  ";
                     price += 500;
                  } else if(i == 2) {
                     sum += " : 연하게  ";
                  } 
                  
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
               } else if(op == 3) { // 휘핑크림
                  System.out.println("-- 휘핑크림 --");
                  
                  sum += " : 휘핑크림 추가  ";
                  price += 500;
                  
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
               } else if(op == 0) {
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
               } else {
                  System.out.println("존재하지 않는 선택지입니다. ");
               }
               System.out.println(sum+"- 장바구니 추가");
               System.out.println(price);
            } // 카페라뗴 끗
            else if(you == 3) { // 아이스티
               System.out.println("-- 아이스티 --");
               System.out.println("추가 옵션을 선택하세요. ");
               System.out.println("1. 얼음양 | 2. 샷 | 3. 휘핑크림 | 0. 선택 없음");
               int op = scan.nextInt();
               
               String sum = "아이스티";
               
               if(op == 1) { // 얼음양
                  System.out.println("-- 얼음양 --");
                  System.out.println("1. 많이 | 2. 보통 | 3. 적게");
                  int i = scan.nextInt();
                  
                  if(i == 1) {
                     sum += " : 얼음 많이  ";
                  } else if(i == 2) {
                     sum += " : 얼음 보통  ";
                  } else if(i == 3) {
                     sum += " : 얼음 적게  ";
                  } 
                  
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
                  
               } else if(op == 2) { // 샷
                  System.out.println("-- 샷 --");
                  System.out.println("1. 샷 추가 | 2. 연하게");
                  int i = scan.nextInt();
                  
                  if(i == 1) {
                     sum += " : 샷 추가  ";
                  } else if(i == 2) {
                     sum += " : 연하게  ";
                  } 
                  
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
               } else if(op == 3) { // 휘핑크림
                  System.out.println("-- 휘핑크림 --");
                  
                  sum += " : 휘핑크림 추가  ";
                  
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
               } else if(op == 0) {
                  cart += sum; // 장바구니에 추가
//                  System.out.println(sum);
//                  System.out.println(cart);
               } else {
                  System.out.println("존재하지 않는 선택지입니다. ");
               }
               System.out.println(sum+"- 장바구니 추가");
            } // 아이스티 끗
         } // 1.  주문하기 끗
         else if(one == 2) { // 결재하기
            
         } // 2. 결재하기 끗
         else if(one == 3) { // 장바구니
            System.out.println(cart);
         } //3. 장바구니 끗
         else if(one == 0) { // 종료
            System.out.println("시스템을 종료합니다. ");
            break;
         } // 0. 종료 끗
         else {
            System.out.println("존재하지 않는 옵션입니다. ");
         }
      } // while 끗
      int op = scan.nextInt();
      if(op == 1) { // 샷옵션
			System.out.println("~ 샷 옵션 ~");
			System.out.println
			("1. 샷 추가(+500원) | 2. 연하게 | 0. 재선택");
			int i = scan.nextInt();
			if(i == 1) {
				price += 500;
				list.add("<- 샷추가");
			} else if(i == 2) {
				list.add("<- 연하게");
			} else if(i == 0) {
				System.out.println("옵션을 재선택합니다. ");
			} 
		} // 샷 옵션 끝
   }
}

