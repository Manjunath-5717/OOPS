public class Finalauto {
    public static boolean auto(int num){
        int squ=num*num;
        int count=0;
        int temp=num;
        while(num!=0){
            count++;
            num=num/10;
        }
        int div=1;
        for(int i=1;i<=count;i++){
        div=div*10;
        }
        return temp==(squ%div);
    }
    public static void main(String[] args) {
     if(auto(25)){
        System.out.println("Automorphic");
     }else{
        System.out.println("Not Automorphic");
     } 
    }
}
