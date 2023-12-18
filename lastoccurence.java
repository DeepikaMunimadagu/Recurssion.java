class HelloWorld {
    public static int last(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = last(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,1};
        System.out.println(last(arr,1,0));
    }
}
