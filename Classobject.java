class Student{
    int id;
    String name;
}
public class Classobject {
    public static void main(String[] args) {
        
      Student S1= new Student();  
      Student S2= new Student(); 
      S1.id = 111;
      S1.name="Abhijit Dutta";
      System.out.println(S1.id+" "+S1.name); 
      System.out.println(S2.id+" "+S2.name); 
    }
}
