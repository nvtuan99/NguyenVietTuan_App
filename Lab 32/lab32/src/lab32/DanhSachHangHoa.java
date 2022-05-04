package lab32;

	import java.util.Scanner;
	public class DanhSachHangHoa {
	    Scanner sc = new Scanner(System.in);
	    int a;
	    int b[] = null;
	    public void nhaphanghoa(){
	         HangHoa b[];
	            do{
	            System.out.print("nhap so luong hang hoa: ");
	            a = sc.nextInt();
	         if(a<=0){
	            System.out.print("nhap sai yeu cau nhap lai! ko được <=0 ");
	         }
	        }while(a<=0);
	        b = new HangHoa[a];
	       for(int i=0; i<a;i++){
	        System.out.print("hang hoa t" + (i+1)+" : ");
	          b[i] = new HangHoa();
	       }
	       
	    }
	    public void InDanhSachHangHoa(){
	        int b[] = null;
	        HangHoa b[];
	        b = HangHoa[a];
	        for(int i=0; i<a;i++){
	            System.out.print("hang hoa t" + (i+1)+" : ");
	              b[i].intthanghoa();;
	           }
	    }
	    public static void main(String[] args) throws Exception {
	        HangHoa a = new HangHoa();
	        
     }
}
