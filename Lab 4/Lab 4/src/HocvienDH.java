public class HocvienDH extends HocVien{
	    public float dongiaDH;
	    public HocvienDH(float dongiaDH){
	        this.dongiaDH=dongiaDH;
	    }
	    public void nhapthongtin(){
	        System.out.print("Nhap So Buoi :");
	        sobuoi=sc.nextInt();
	    }
	    public float hocPhi(){
	        if(lut=1)
	            dongiaDH=1000000;
	        else   
	            dongiaDH=500000;
	        hocPhi=(sobuoi*dongiaDH-lut);
	        return hocPhi;
	    }
	}