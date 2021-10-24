 
    import java.util.*; 
    
   public class quicksorting{
        
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of test cases: ");
        int t= sc.nextInt();
        while(t>0){
            System.out.println("Enter no. of array element: ");
        int n= sc.nextInt();
        
        int arr[]= new int[n];
        System.out.println("Enter array elements: ");

        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        } 
    
        int l = arr.length;
         quickSort( arr, 0, l-1 );
    
        for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
        
             }
             System.out.print('\n');
             t--;
        }
    }
    public static int[] quickSort(int[] arr, int left, int right){
                int pi = partition(arr,left,right);
                if(left<pi-1){
                    quickSort(arr,left,pi-1);
                }
                if(pi<right){
                    quickSort(arr,pi,right);
                }
                return arr;
        }
    public static int partition(int[] arr, int left, int right){
            int pivote=arr[(left+right)/2];
            while(left<=right){
                while(arr[left]<pivote){
                    left++;
                }
                while(arr[right]>pivote){
                    right--;
                }
                if(left<=right){
                    int temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
            }
            return left;
        }
    }
    

