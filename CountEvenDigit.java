public class CountEvenDigit{
    public static CountEvenDigit(int n){
        int count=0;
        while(n>0){
            int last =n%10;
            if(last%==0) count++;
            n=n10;
        }
        return count;
    }
}  
