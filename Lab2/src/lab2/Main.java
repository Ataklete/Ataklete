package lab2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 2, -5, -21, 3, 8, 18, 45, 0, 12, 18, 6, 3, 1, 0, -22 };
        int[][] res = chop(a);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }

    }

    static int[][] chop(int[] arrayOfInts) {
//        int[][] res = new int[arrayOfInts.length][arrayOfInts.length];
        int[][] res;
//        int j = 0, k = 0;
        List<Integer> rowList= new ArrayList<>();// to hold the accending or decending lists horizontal
        List<List<Integer>> columnList = new ArrayList<>();//to hold list of lists. vertically
//        res[j][k] = arrayOfInts[0];
        rowList.add(arrayOfInts[0]);
        boolean dec=true;
        if (arrayOfInts[0] < arrayOfInts[1])
            dec = false;
        for (int i = 1; i < arrayOfInts.length; i++) {
            // res[j][k]=arrayOfInts[i-1];
            if (dec == true) {
                if (arrayOfInts[i] < arrayOfInts[i - 1]) {
//					k++;
//					res[j][k] = arrayOfInts[i];
                    rowList.add(arrayOfInts[i]);
                } else {
                    dec = false;
                    columnList.add(rowList);
//					// res[j][k]=arrayOfInts[i-1];
//					j++;
//					k = 0;
//					res[j][k] = arrayOfInts[i - 1];
//					k++;
//					res[j][k] = arrayOfInts[i];
                    rowList=new ArrayList<>();
                    rowList.add(arrayOfInts[i-1]);
                    rowList.add(arrayOfInts[i]);

                }

            } else {
                if (arrayOfInts[i] > arrayOfInts[i - 1]) {
//					k++;
//					res[j][k] = arrayOfInts[i];
                    rowList.add(arrayOfInts[i]);
                } else {
                    dec = true;
                    columnList.add(rowList);
                    // res[j][k]=arrayOfInts[i-1];
//					j++;
//					k = 0;
//					res[j][k] = arrayOfInts[i - 1];
//					k++;
//					res[j][k] = arrayOfInts[i];
                    rowList=new ArrayList<>();
                    rowList.add(arrayOfInts[i-1]);
                    rowList.add(arrayOfInts[i]);
                }
            }

        }
        res=new int[columnList.size()][];
        for(int j=0;j<columnList.size();j++){
            res[j]=new int[columnList.get(j).size()];
            for(int k=0;k<columnList.get(j).size();k++){
                res[j][k]=columnList.get(j).get(k);
            }
        }
        return res;
    }

}
