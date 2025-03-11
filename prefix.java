class prefix {
    public static void main(String[] args) {
        int[] arr = {5, 9, -1, 2, -3, 6};
        int l = 2, r = 4; 
        display(arr, l, r); 
    }

    static void display(int[] a1, int l, int r) {
        int sum = a1[l];  
        System.out.println(sum);
        
        for (int i = l + 1; i <= r; i++) { 
            sum += a1[i];
            System.out.println(sum);
        }
    }
}
