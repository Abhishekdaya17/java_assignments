class Base{
    static void info(){
        System.out.println("Name : Avinash Verma");
        System.out.println("Enrolment Number : 0873CS231022 \n");
    }
}
public class Name extends Base{
    public static void main(String[] args){
        Base.info();
    }
    
}
