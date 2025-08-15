// import java.util.Scanner;
// public class BeautifulMatrix {
//     public static void main(String[] args) {
//         int[][]matrix=new int[5][5];
//         int start=-1,end=-1;
//         Scanner sc= new Scanner(System.in);
//         for(int i=0;i<5;i++){
//             for(int j=0;j<5;j++){
//                 matrix[i][j]=Integer.parseInt(sc.nextLine());
//                 if(matrix[i][j]==1)
//                     {
//                         start=i+1;end=j+1;
//                     }
//             }
//         }
//         int move=0;
//        /* while(start!=3 || end!=3){
//             if(start>3){
//                 start--;
//                 move++;
//             }
//             else if(start<3){
//                 start++;
//                 move++;
//             }
//              if(end>3){
//                 end--;
//                 move++;
//             }
//             else if(end<3){
//                 end++;
//                 move++;
//             }
//         }
//         System.out.println(move);*/
//         System.out.println(Math.abs(start - 3) + Math.abs(end - 3));

//     }
// }

import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String[] args) {
        int start = -1, end = -1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int val = sc.nextInt(); // FIX: Read integers directly
                if (val == 1) {
                    start = i + 1; 
                    end = j + 1;
                }
            }
        }

        // Manhattan distance from (start, end) to center (3,3)
        System.out.println(Math.abs(start - 3) + Math.abs(end - 3));
    }
}

