class Ternary_Four_Operands {
    public static void main(String[] args) {
        
        int a = 10, b = 20 ,c = 30 , d= 40;
        String e = 
            (a > b) ? // If a is greater than b
                ((a > c) ? // If a is also greater than c 
                    ((a > d) ? ("A is greater") : ("D is greater")) // If a is greater than d, then A is greater; otherwise, D is greater
                    : ((c > d) ? ("C is greater") : ("D is greater"))) // If a is not greater than d, then if c is greater than d, then C is greater; otherwise, D is greater
                : ((b > c) ? // If a is not greater than b
                    ((b > d) ? ("B is greatest") : ("D is greatest")) // If b is also greater than d, then B is greatest; otherwise, D is greatest
                    : ((c > d) ? ("C is greatest") : ("D is greatest"))); // If b is not greater than d, then if c is greater than d, then C is greatest; otherwise, D is greatest
        
        System.out.println(e);
    }
}
