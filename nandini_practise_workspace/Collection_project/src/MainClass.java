import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
public static void main(String[] args) 
{
	List<Info> list = new ArrayList<Info>();
	
	Info info = new Info();
	info.setName("Gjfhf");
	list.add(info);
	
	 info = new Info();
	info.setName("Djfhf");
	list.add(info);
	
	 info = new Info();
	 info.setId(3);
	info.setName("Cjfhf");
	list.add(info);
	
	 info = new Info();
	 info.setId(6);
	info.setName("JBjfhf");
	list.add(info);
	
	 info = new Info();
	 info.setId(2);
	info.setName("Bjfhf");
	list.add(info);
	
	 info = new Info();
	 info.setId(1);
	info.setName("Djfhf");
	list.add(info);
	
	 info = new Info();
	 info.setId(3);
	info.setName("Ujfhf");
	list.add(info);
	
	 info = new Info();
	 info.setId(1);
	info.setName("ABjfhf");
	list.add(info);
	
	
	NameSort nameSort = new NameSort();
	Collections.sort(list, nameSort);
	System.out.println(list);
}


/*class NameSort implements Comparator<Info>

{

	@Override
	public int compare(Info o1, Info o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}*/
}
