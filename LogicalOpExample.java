class LogicalOpExample
{
public static void main(String[] lop)
{

System.out.println(true && true || true && true || true && false);

System.out.println(false && false || true && true || false && false);

System.out.println(true && false || true && false || true && true);

System.out.println(false && false || false && false || true && false);





boolean a=true,b=true,c=true,e=true,f=true,g=true;

System.out.println(a && b|| c && e || f && g);
}
}