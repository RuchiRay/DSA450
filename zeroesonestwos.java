class zeroesonestwos
{
    public static void sort012(int a[], int n)
    {
        int count = 0,count1=0,count2 = 0;
        for(int i = 0;i<n;i++)
        {
            if(a[i]==0)
            count++;
            else if(a[i]==1)
            count1++;
            else
            count2++;
        }
       int x = 0;
       for(int i=0;i<count;i++)
       {
          a[x] = 0;
          x++;
       }
       for(int i=0;i<count1;i++)
       {
          a[x] = 1;
          x++;
       }
       for(int i=0;i<count2;i++)
       {
          a[x] = 2;
          x++;
       }
    }
}