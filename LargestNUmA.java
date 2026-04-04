public class LargestNUmA {
    public static void main(String[] args) {

        int [] a={3,8,12,7,8};
        int largest=a[0];
        for(int i=1;i<a.length;i++){
           if(a[i]>largest){
            int temp=a[i];
            a[i]=largest;
            largest=temp;
            
          }
         
        }
        System.out.println(largest);
        
    }
}
