class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        char ch[] = str.toCharArray();
        // Reverse the string str
        int i=0,j=str.length()-1;
        char temp=' ';
        while(i<=j)
        {
                temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
        }
        return String.valueOf(ch);
    }
}