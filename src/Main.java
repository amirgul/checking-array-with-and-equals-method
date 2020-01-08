public class Main
{

    public static void main(String[] args)
    {
        int[] a = new int[3];
        int[] b = new int[3];
        setArray(a);
        setArray(b);
        if(a == b)
            System.out.println("They are equal by == ");
        else
            System.out.println("They are not equal by ==");
        if(equals(a,b))
            System.out.println("They are equal by equal method");
        else
            System.out.println("Are not equal by equal method");

    }
    public static void setArray(int[] array)
    {
        for(int i = 0; i<array.length; i++)
            array[i] = i;
    }


    public static boolean equals(int[] a, int[]b)
    {
        boolean elementMatch = true;
        if(a.length != b.length)
            elementMatch= false;
        else
        {
            int i = 0;
            while (elementMatch && i<a.length )
            {
                if(a[i] != b[i])
                    elementMatch = false;
                else
                    i++;
            }

        }
        return  elementMatch;
    }
}
