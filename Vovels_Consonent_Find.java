//WAP program to find vovels and consosnents and store them in Seperate String.
// Count of Vovels: 2
// Count of Consonents: 3
// Vovels: eo
// Consonents: H l l 

class Vovels_Consonent_Find {
    public static void main(String[] args) {
       String str="Hello";  // String to fetch Vovels and Consonents
       int vovels=0,consonent=0;    //variable to find count
       String vov="";   //variable to store vovels
       String con="";   //var to to store consonents
      
         for(int i=0; i<str.length(); i++)
           {
               char ch= str.charAt(i);
               if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='E' || ch=='I' ||ch=='O' ||ch=='U' )
               {
                   vovels++;
                   vov=vov+ch;
               }
               else
               {
                   consonent++;
                   con=con+ch+" ";
               }
           }

       System.out.println("Count of Vovels: "+ vovels);
       System.out.println("Count of Consonents: "+ consonent);
       System.out.println("Vovels: "+ vov);
       System.out.println("Consonents: "+ con);
    }
}
