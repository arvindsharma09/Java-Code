package JavaTraining;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[] = new int[4];
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;
		
		System.out.println(i[2]);
        System.out.println(i.length);
        
        // how to fetch values from array :- for Loop
        
        for(int k=0; k<i.length; k++) {
        	System.out.println(i[k]);
        }
        
        System.out.println(".............");
        
        // for each loop
        
        for(int e: i) {
        	 System.out.println(e);
        }
       
        
        
        System.out.println(".............");
        
        //System.out.println(i[4]);
        
        char c[] = new char[3];
        c[0] = 'a';
        c[1]= '1';
        c[2]= '$';
        
        System.out.println(c[0]+ c[1] + c[2]);
        
        String s[] = new String [3];
        s[0] = "Java";
        s[1] = "Python";
        s[2] = "Java Script";
        
        System.out.println(s[0]);
        
        for (String n : s) {
        	System.out.println(n);
        }
        
        System.out.println("*************");
        
        for(int t=0; t<s.length; t++) {
        	System.out.println(s[t]);
        }
        
        System.out.println("*************");
        
        for(char b='A';b<='Z'; b++) {
        	System.out.println(b);
        }
        
       // Object Array :- Object Array is a class available in Java
        
        Object emp[] = new Object[5];
        
        emp[0]= "Arvind";
        emp[1]= 'M';
        emp[2]= 25;
        emp[3]= 23.55;
        emp[4]= true;
        
       for(Object e : emp) {
    	   System.out.println(e);
       }
     
       System.out.println("*************");
       
       for(int z = 0;z<emp.length; z++) {
    	   System.out.println(emp[z]);
       }
       
       
	}

}
