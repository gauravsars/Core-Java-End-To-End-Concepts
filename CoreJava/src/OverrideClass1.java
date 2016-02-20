import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.test.SysOut;

interface i1{
	public void getList(List l);
}

interface i2{
	public void getList(ArrayList l);
}

class interImpl implements i1,i2 {

	@Override
	public void getList(ArrayList l) {
		// TODO Auto-generated method stub
		System.out.println(" In ArrayLIst Method ");
		
	}

	@Override
	public void getList(List l) {
		// TODO Auto-generated method stub
		System.out.println("In List Method");
		
	}
	
}



public class OverrideClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		List l = new ArrayList();
		LinkedList ll = new LinkedList();
		interImpl impl= new interImpl();
		
		impl.getList(al);
		impl.getList(l);
		impl.getList(ll);
		
		
		
		
	}

}
