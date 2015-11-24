/**
 * Created by Administrator on 2015/11/20.
 */
public class ValidNumber {
    public boolean isNumber(String s) {
        System.out.println("start:"+s);
        try{
            Double.valueOf(s);

        }catch (NumberFormatException e){
            System.out.println("false");
            return false;
        }
        System.out.println("true");
        return true;
    }
}
