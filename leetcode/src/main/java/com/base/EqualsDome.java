
/***************************************************************************
 * @Title: EqualsDome
 * @Package com.base
 * @Description: 实验比较equals
 * @author shimingda
 * @date 2020/1/9  
 * @version V1.0
 ****************************************************************************/
public class EqualsDome
{
	public static void main(String[] args)
	{

		Object a1="a";
		Object a2="a";
		Object b1=new Object();
		Object b2=new Object();

		System.out.println("a1==a2:"+(a1==a2));
		System.out.println("b1==b2:"+(b1==b2));

		System.out.println("a1.equals(a2):"+(b1.equals(b2)));
		System.out.println("b1.equals(b2):"+(b1.equals(b2)));

		System.out.println("a1.hashCode() is : "+a1.hashCode()+"   System.identityHashCode(a1) is : "+ System.identityHashCode(a1));
		System.out.println("a2.hashCode() is : "+a2.hashCode()+"   System.identityHashCode(a2) is : "+ System.identityHashCode(a2));
		System.out.println("b1.hashCode() is : "+b1.hashCode()+"   System.identityHashCode(b1) is : "+ System.identityHashCode(b1));
		System.out.println("b2.hashCode() is : "+b2.hashCode()+"   System.identityHashCode(b2) is : "+ System.identityHashCode(b2));

	}
}