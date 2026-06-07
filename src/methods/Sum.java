package methods;

public class Sum {
    public static void main(String[] args) {
        Sum obj=new Sum();
        int[] arr={10,20};
        System.out.println(obj.findsum(arr));

    }
    int findsum(int[] arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+ arr[i];
        }
        return sum;

    }
}
