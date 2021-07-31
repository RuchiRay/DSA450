import java.util.*;
class intersection{
    //Function to return the count of the number of elements in
    //the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[],int b[],int n,int m)
    {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
       for(int i = 0;i<n;i++)
       {
           set.add(a[i]);
       }
       for(int i = 0;i<m;i++)
       {
           if(set.contains(b[i]))
           intersect.add(b[i]);
       }
       return intersect.size();
    }
};