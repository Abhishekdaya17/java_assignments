class Base{
    static void info(){
        System.out.println("Name : Abhishek Daya");
        System.out.println("Enrolment Number : 0873CS231002 \n");
    }
}
public class Name extends Base{
    public static void main(String[] args){
        Base.info();
    }
    
}
