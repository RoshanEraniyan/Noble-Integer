import java.util.*;

class Solution
{
    public int calculate(Integer[] array)
    {
        Arrays.sort(array,Collections.reverseOrder());
        int solution=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==i)
            {
                solution= 1;
                break;
            }
            else
            {
                if(i==array.length-1)
                {
                    solution=-1;
                }
            }
        }
        return solution;
    }
}

class NobleInteger
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Integer[] array=new Integer[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution solution =new Solution();
        System.out.println(solution.calculate(array));
    }
}
