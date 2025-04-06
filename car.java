class car_info{
    int id;
    String color;
    String company_name;    
}
class car{
    public static void main(String[] args){
        
        car_info c1=new car_info();
        car_info c2=new car_info();

        c1.id=1;
        c1.color="Blue";
        c1.company_name="Tata";
        System.out.println(c1.id+" "+c1.color+" "+c1.company_name);
    }
}