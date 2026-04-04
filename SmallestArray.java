public class SmallestArray {
    
    public static void main(String[] args) {
        int[] a={12,3,5,8,10,12};
        int smallest=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<smallest){
             int temp=a[i];
             a[i]=smallest;
             smallest=temp;
            }
        }
        System.out.println(smallest);
    }
}
