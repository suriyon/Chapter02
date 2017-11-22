package cs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Discount {

	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String tmp;
		
		try {
			do {
				System.out.println("                     คำนวณราคาขายสุทธิ");
				System.out.println("****************************************************");
				System.out.print("กรุณาป้อนราคาสินค้า : ");
				tmp = br.readLine();
				int Price = Integer.parseInt(tmp);
				System.out.print("จำนวนสินค้าที่ขาย : ");
				tmp = br.readLine();
				int Qty = Integer.parseInt(tmp);
				float Discout = Price*Qty*0.05f;
				System.out.println("ส่วนลด 5% : " + Discout);
				System.out.println("****************************************************");
				float NetPrice = Price*Qty - Discout;
				System.out.println("ราคาสุทธิ : " + NetPrice);
				System.out.println("****************************************************");
				System.out.print("ต้องการทำงานต่อหรือไม่ [Y/N] : ");
				tmp = br.readLine();
			}while(tmp.equals("Y") || tmp.equals("y"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
