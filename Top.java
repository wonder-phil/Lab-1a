import Middle.Bottom.BClass;
import Middle.MClass;

public class Top {

    public static void main(String[] args) {
        System.out.println("Top ");
        
        MClass mclass = new MClass();
        mclass.printMe();

        BClass bclass = new BClass();
        bclass.printMe();


    }
}