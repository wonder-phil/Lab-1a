import Middle.Bottom.BClass;
import Middle.AltBottom.*;
import Middle.MClass;

public class Top {

    public static void main(String[] args) {
        
        System.out.println("Top");
        
        MClass mclass = new MClass();
        mclass.printMe();

        BClass bclass = new BClass();
        bclass.printMe();

        Middle.AltBottom.BClass abclass = new Middle.AltBottom.BClass();
        abclass.printMe();

    }
}
