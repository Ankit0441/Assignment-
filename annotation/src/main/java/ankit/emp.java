package ankit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class emp {
String name;
String des;

//@Autowired
//@Qualifier("d")
department dept;
//@Autowired
//@Qualifier("d1")
department dept1;

public emp(String name, String des, @Autowired @Qualifier("d") department dept, @Autowired
		@Qualifier("d1") department dept1) {
	super();
	this.name = name;
	this.des = des;
	this.dept = dept;
	this.dept1 = dept1;
	
}




public emp() {
	super();
}




void m()
{
	System.out.println(name+" a "+des+" working in "+dept.dname+" department at "+" city");
}
void m1()
{
	System.out.println(name+" a "+des+" working in "+dept.dname+" department at "+" city");
}
}
