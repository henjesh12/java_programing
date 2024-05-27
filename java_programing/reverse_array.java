public class reverse_array {

    public static void array(int a[]){
        int i=0,j=a.length-1  ,temp=0;
        while(i<j){
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
         i++;
         j--;

        }

        for(int k=0;k<a.length;k++){
               System.out.println(a[k]);
        }
        
    }
    
}
