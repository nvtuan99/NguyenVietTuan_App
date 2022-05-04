import java.util.Scanner;

public abstract class HocVien {
	    public String Hoten,diachi,lct;
	    float lut;
		public int sobuoi;
	    public float hocPhi;
	    Scanner sc=new Scanner(System.in);
	    public HocVien(){
	        Hoten=diachi=lct=" ";
	        lut=hocPhi= 0;
	    }
	    public String nhapthongtin(String lct){
	        System.out.print("Nhap Ho ten:");
	        Hoten=sc.nextLine();
	        System.out.print("Nhap Dia Chi:");
	        diachi=sc.nextLine();
	        System.out.print("Nhap Loai Chuong Trinh (DH/LT):");
	        lct=sc.nextLine();
	        System.out.print("Nhap Loai Uu Tien (1/2):");
	        lut=sc.nextInt();
	        return lct;
	    }
	    public abstract float hocPhi();
	    public void inthongtin(){
	        System.out.printf(" Ho ten Sinh Vien: %s",Hoten);
	        System.out.printf("\nDia Chi Sinh Vien: %s",diachi);
	        System.out.printf("\nLoai chuong trinh dang ki hoc : %s",lct);
	        System.out.printf("\nLoai uu tien: %s",lut);
	        System.out.printf("\n =>Hoc Phi: %f",hocPhi);
    }
}