class Base{
    static void info(){
        System.out.println("Name : Anil Yadav");
        System.out.println("Enrolment Number : 0873CS231014 \n");
    }
}
public class Name extends Base{
    public static void main(String[] args){
        Base.info();
    }
    
}
