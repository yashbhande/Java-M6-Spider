class Reverse_Array_String
{
    public static void main(String[] args)
    {
        String names[]={"Yash","OK","Test","Comma"};
        
        for(int i=names.length-1; i>=0; i--)
        {
            System.out.print(names[i] +" ,");
        }
    }
}

//Comma ,Test ,OK ,Yash ,
