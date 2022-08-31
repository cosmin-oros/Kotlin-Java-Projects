package Problems.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrixSol {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> output = new ArrayList<>();

        int count=0;
        int dir=0,i=0,j=0;
        int r=matrix.length;
        int c=matrix[0].length;
        int total=r*c-1;

        int[][] seen=new int[r][c];
        while(count <= total)
        {
            output.add(matrix[i][j]);
            seen[i][j]=1;

            /*Traverse in Right Dir and increment column No */
            if(dir==0)
            {
                j++;
            }
            /*Traverse in Bottom Dir and increment row No */
            else if(dir==1)
            {
                i++;
            }
            /*Traverse in left Dir and decrement column No */
            else if(dir==2)
            {
                j--;
            }
            /*Traverse in top Dir and decrement row No */
            else if(dir==3)
            {
                i--;
            }

            /*Change the Direction to bottom If reached column upper bound (j==c) or next element is already visited */
            if(dir==0 && (j==c || seen[i][j]==1))
            {
                dir=1;
                i++;
                j=j-1;
            }
            /*Change the Direction to Bottom If reached row upper bound (i==r) or next element is already visited */
            else if(dir==1 && (i==r || seen[i][j]==1))
            {
                dir=2;
                j--;
                i=i-1;
            }
            /*Change the Direction to Left If reached column lower bound (j==-1) or next element is already visited */
            else if(dir==2 && (j==-1 || seen[i][j]==1))
            {
                dir=3;
                i--;
                j=j+1;
            }
            /*Change the Direction to Top If reached row lower bound (i==-1) or next element is already visited */
            else if(dir==3 && (i==-1 || seen[i][j]==1))
            {
                dir=0;
                i=i+1;
                j++;
            }

            count++;
        }

        return output;

    }
}
