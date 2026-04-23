package session_08;
//public class A<T>
public class A<T> {
	T t;
	
	public void add(T t)
	{
		this.t = t;
	}
	
	public T getT()
	{
		return t;
	}
	
	public static void main(String[] args) {
		A<Integer> a = new A<Integer>();
		A<String> a1 = new A<String>();//CTE
		A<Float> f1 = new A<Float>();
	}

}
