public class Step1_4_ReverseNumber {

    private static int useString(int v){
        Boolean neg = false;
        if(v<0){
            neg = true;
        }
        v=Math.abs(v);
        StringBuilder str = new StringBuilder(Integer.toString(v));
        str.reverse();
        if(neg){
            str.insert(0,"-");
        }
        try{
            Integer.parseInt(str.toString());
        }catch(Exception e){
            return 0;
        }
        int ans = Integer.parseInt(str.toString());
        return ans;
    }


    private static int better(int x){
        boolean negsign = false;
        if(x<0){
            negsign=true;
            x=Math.abs(x);
        }
        int ans=0;
        while(x > 0){
            int digit = x%10;
            if(ans > (Integer.MAX_VALUE-digit)/10 ){
                return 0;
            }
            ans = ans * 10 + digit;
            x=x/10;
        }
        return negsign ? -ans : ans;
    }

    public static void main(String[] args) {
        int x= 123;

        System.out.println(useString(1534236469));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(better(-2147483412));
    }
}
