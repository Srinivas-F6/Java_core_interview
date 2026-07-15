

public class EhDemo1 {

    static int sums() throws Exception{
       int res = 10/0;
       return res;
    }

    public static void main(String[] args) throws Exception{
        try {
            int ans = sums();
            System.out.println(ans);
        }
        catch(Exception e){
            System.out.println("ffjieje");
        }
        finally{
            System.out.println("Implemented");
        }
        int z = 10*20;
        System.out.println(z);
    }
}
