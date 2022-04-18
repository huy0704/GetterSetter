package advance.dev;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SinhVien p = new SinhVien();
//		p.setName("Man");
//		p.setOld(19);
//		p.setHoa(6);
//		p.setToan(10);
//		p.setLy(7);		
		SinhVien arr[] = new SinhVien[5];		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new SinhVien();
			System.out.println(" Nhập Sinh Viên Thứ : " + (i+1));
			System.out.println("Nhap ten :");
			arr[i].setName(sc.nextLine()) ;
			arr[i].setOld(sc.nextInt()) ;
			arr[i].setToan(sc.nextFloat()) ;
			arr[i].setHoa(sc.nextFloat()) ;
			arr[i].setLy(sc.nextFloat()) ;
			
			arr[i].setDtb(sc.nextFloat()) ;
			sc.nextLine();
			
			
			System.out.println("Diem Trung binh" + arr[i].getDtb() );
			System.out.println((arr[i].getToan() + arr[i].getHoa() + arr[i].getLy()) / 3);
			}
			System.out.println("---------------------------");
		
	
		System.out.println("Ten :" + p.getName() + "Tuoi :" + p.getOld() +"Hoa :" + p.getHoa()+"Ly :" + p.getLy()+"Toan :" + p.getToan()+ "Diem trung binh :" + p.getDtb() );
	}
}