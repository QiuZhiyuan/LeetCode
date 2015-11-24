/**
 * 判断一个字符串是否可以转化成数字
 * 如：
 * 123.2 true
 * 2e10 true
 * 0x545 false
 * 1 a false
 * 929323.32f true 正确答案是false这里不明白
 * abc false
 * -1. true
 * 不过类似435.4f这样的单精度数不符合要求
 *
 * 这个题还没做完
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
