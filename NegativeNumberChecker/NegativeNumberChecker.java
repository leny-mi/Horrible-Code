public class NegativeNumberChecker{

     public static void main(String []args){
        for (int x : new int[]{-20, 55, -420, -1073741824, -2147483648, 0, 1337, 3333, -3333}) {
            System.out.println(x + " : " + isNegative(x));
        }
     }
     
    public static Boolean isNegative(Object n) {
        try { 
            return 1 << 31 == (int)n || 1/(Math.abs((int)n) - (int)n) == 1337;
        } catch (Exception e) { 
            return null != (n = (Object) (new Boolean[]{false}));
        } finally {
            return (Boolean)((n instanceof Number)?!isNegative(-((int)n%3333)):((Object[])n)[0]);
        }
    }
}