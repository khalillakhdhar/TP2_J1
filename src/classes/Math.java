package classes;

public class Math {
	private int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Math(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int somme()
	{
		
		return a+b;
	}
public int produit()
{
return a*b;

}
public int max()
{
if(a>b)
	return a;
else 
	return b;
}

@Override
public String toString() {
	return "Math [a=" + a + ", b=" + b + ", somme=" + somme() + ", produit=" + produit() + ", max=" + max() + "]";
}





}

