public class Step1_4_GCD {

    public static int calcGCD(int n, int m){
        // Write your code here.
        int ans=1,i=1;
        while(i<=n && i<=m){
            if(n%i==0 && m%i==0){
                ans=i;
            }
            i++;
        }
        return ans;
    }

    private static int better(int n, int m){
        int gcd=Math.min(n,m);
        for(; gcd>0; gcd--){
            if(n%gcd==0 && m%gcd==0){
                break;
            }
        }
        return gcd;
    }

    private  static int supreme(int n, int m){
        while(n>0 && m>0){
            if(n>m){
                n=n%m;
            }else{
                m=m%n;
            }
        }
        return Math.max(n,m);
    }

    public static void main(String[] args) {
        System.out.println(calcGCD(4,8));
        System.out.println(better(20,40));
        System.out.println(supreme(52,10));
    }
}
