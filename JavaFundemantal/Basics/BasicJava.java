import java.util.ArrayList;
import java.util.Iterator;

public class BasicJava {
    public static void Print (int x){
        for (int i = 1; i < x; i++){
            System.out.println(i);
        }
    }
    public static void odd (int y){
        for (int i = 1; i < y; i+=2){
            System.out.println(i);
        }
    }

    public static void sum (int x){
        int sum=0;
        for (int i = 0; i < x; i++){
            sum = sum+i;
            System.out.println("New number:" + i +" " +"Sum:"+sum);
        }
    }

    public static void iterate (int[] a){
        for (int i = 0 ;i< a.length; i++){
            System.out.println(a[i]);
        }
    }
    static void max(int[] v ){
        int max =v[0]; 
        for (int i =1 ; i< v.length; i++){
        if (v[i]>max){
            max=v[i];
            
            }
        }
        System.out.println(max);
    }
    static void Average(int[] t){
        int sum = 0;
        int ave=0;
        for(int i=0;i<t.length;i++){
            sum=sum+t[i];
            ave=sum /t.length;
        }
        System.out.println(ave);
    }
    static void oddarr(int y){
        ArrayList<Object> list = new ArrayList<Object>();
        for (int i=1;i<y;i+=2){
            list.add(i);
        }
        System.out.println(list);
    }
    static void GreaterThany(int[] c ,int y){
    int max=0;
    for(int i=0;i<c.length;i++){
        if (c[i]>y){
            max+=1;
        }
    }
		System.out.println(max);
    }
    static void Square(int[]x){
        for(int i=0;i<x.length;i++){
            x[i]=x[i]*x[i];
            System.out.print(x[i]+ ", ");
        }
    }
    static void neg(int[]f) {
		for(int i=0; i<f.length; i++) {
			if(f[i]<0) {
				f[i] = 0;
			}
			System.out.print(f[i]+ ", ");
		}
	}
    static int[] all(int[]f) {
		int [] all = {f[0], f[0], f[0]};
		for(int i=0; i<f.length; i++) {
			if(f[i]> all[0]) {
				all[0]=f[i];
			} else if(f[i]< all[1]) {
				all[1] = f[i];
			}
			all[2] +=f[i];
		}
		all[2]  /= f.length;
		return all;
	}
    static void shift(int[] h) {
		for (int i=1; i< h.length; i++) {
			h[i-1] = h[i];
		}
		h[h.length-1] = 0;
		for(int i=0; i<h.length; i++) {
			System.out.println(h[i]);
		}
	}



    public static void main(String[] args) {
        BasicJava.Print (256);
        BasicJava.odd (256);
        BasicJava.sum (256);
        int[] a = {1,3,5,7,9,13};
		iterate(a);
        int [] v={-1,2,3,1,6,0};
        max(v);
        int[] t={2,10,3};
        Average(t);
        oddarr(256);
        int[] c={1,3,5,7,15};
        GreaterThany(c, 3);
        int[] x={1,5,10,-2};
        Square(x);
        int[] f= {1, 5, 10, -2};
		neg(f);
        int[] g= {1, 5, 10, -2};
		int[] all = new int[3];
		all= all(g);
        for (int i = 0; i<all.length;i++) {
			System.out.println(all[i]);
		}
        int[] h= {1, 5, 10, -2};
		shift(h);

    }
}