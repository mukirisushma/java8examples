package Multilevel;


class calculator {
	public float mul(float p,float q) {
		return p*q;
	}
	public float dif(float a, float b) {
		return a-b;
	}
	public float sum(float x, float y) {
		return x+y;
	}
	public float div(float m, float n) {
		return m/n;
	}
}

class advanced  extends calculator{
	public  float mod(float m , float n) {
		return m%n;
	}
	public float sqr(float n) {
		return n*n;
	}
	public float  sqrt(float m ) {
		System.out.println(Math.sqrt(m));
		return m;
	}
}
class area extends  advanced{
	public float  square(float m) {
		return  m*m;
	}
	public float  rectangle(float l, float b) {
		return l*b;
	}
	public float circle(float r) {
		return (float)(3.14*r*r);
	}
	
}
public class baseclass {
	public static void main(String args[]) {
	
	area areaobj =new area();
	float addresult= areaobj.sum(10, 20);
	float cirresult = areaobj.circle(16);
	float  difresult = areaobj.dif(8, 4);
	float mulresult = areaobj.mul(3,3);
	float divresult = areaobj.div(5,10);
	float sqrresult = areaobj.sqr(5);
	float sqrtresult = areaobj.sqrt(6);
	float  modresult = areaobj.mod(100, 20);
	float squareresult =areaobj.square(8);
	float rectangleresult = areaobj.rectangle(10,12);
	
	System.out.println(addresult);
	
	System.out.println("cirresult"+cirresult);
	System.out.println("difresult"+difresult);
	System.out.println("mulresult"+mulresult);
	System.out.println("divresult"+divresult);
	System.out.println("sqrresult"+sqrresult);
	System.out.println("sqrtresult"+sqrtresult);
	System.out.println("modresult"+modresult);
	System.out.println("squareresult"+squareresult);
	System.out.println("rectangleresult"+rectangleresult);

}
}