public class pattrnZeroOne {
    public static void main(String[] args) {
        zeroone(5);
    }
    public static void zeroone(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
               // System.out.println();
            }
            System.out.println();

        }
    }
}
