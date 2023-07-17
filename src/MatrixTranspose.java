import java.util.Scanner;

public class MatrixTranspose {
    static void Transpose(int arr[][],int rows,int cols)
    {
        int result[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++){
                result[i][j]=arr[j][i];
            }
            System.out.println();
        }
        for(int i=0;i<result.length;i++)
        {
            for (int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols =scanner.nextInt();
        int array[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        Transpose(array,rows,cols);
    }
}
