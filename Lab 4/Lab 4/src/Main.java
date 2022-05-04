public class Main {
    public static void main(String[] args) {
    	String lct;
    	HocvienDH DH=new HocvienDH(0);
	    HocvienLT LT=new HocvienLT(0);
	    DH.nhapthongtin(lct);
        if(lct="DH"){
            DH.hocPhi();
            DH.inthongtin();
        }
        else if(lct="LT"){
            LT.hocPhi();
            LT.inthongtin();
        }
        else
            System.out.print("\nLoai chuong trinh khong hop le !"); 
    }
}