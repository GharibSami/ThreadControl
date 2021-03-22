public class SequntialSum {
   static long result = 0 ;
    public static long sum(){
        for (int i = 0 ; i <= 100000000 ; i ++){
            result+=i;
        }
        return result;
    }
}
