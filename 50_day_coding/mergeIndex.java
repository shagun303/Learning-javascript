import java.util.Scanner;
public class mergeIndex {
    
        public static void merge(int[][] arr){
        int start = arr[0][0];
        int end = arr[0][1];
          System.out.print("[");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
              System.out.print("[" + start + ", " + end + "]"+" , ");
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        System.out.print("[" + start + ", " + end + "]");
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr =  new int [row][col];

        for(int i = 0;i < row; i++){
            for(int j = 0;j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Step 1: Sort by starting index using basic swapping
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][0] > arr[j][0]) {
                    int tempStart = arr[i][0];
                    int tempEnd = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = tempStart;
                    arr[j][1] = tempEnd;
                }
            }
        }
     merge(arr);
       
    }



}
