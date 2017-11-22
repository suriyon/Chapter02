package cs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grade {

	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		String tmp;
				
		try {
			do {
			System.out.println("                    เกรดนักเรียน");
			System.out.print("กรุณาป้อนชื่อ-นามสกุล : ");
			String StdName = br.readLine();
			System.out.print("คะแนนรวม : ");
			tmp = br.readLine();
			int Score = Integer.parseInt(tmp);
			if(Score >= 0 && Score <= 100) {
				if(Score >= 80)
					System.out.println("เกรดที่ได้คือ A");
				else if(Score >= 70)
					System.out.println("เกรดที่ได้คือ B");
				else if(Score >= 60)
					System.out.println("เกรดที่ได้คือ C");
				else if(Score >= 50)
					System.out.println("เกรดที่ได้คือ D");
				else
					System.out.println("เกรดที่ได้คือ F");
			}
			System.out.println();
			System.out.print("ต้องการทำงานต่อหรือไม่? [Y/N] : ");
			tmp = br.readLine();
			}while(tmp.equals("Y") || tmp.equals("y"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
