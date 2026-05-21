class exceptin {
    public static void main(String [] args){
        try{
            int number[]={1,2,3};
            System.out.println(number[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of boundry");
        }

        try{
            int a=10,b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("not vailed dividend");
        }
        
        try {
            String d= null;
            System.out.println(d.length());
        }
        catch (NullPointerException e) {
            System.out.println("null pointer error");
        }
        try {
            
        }
        catch (e){
        }
        finally{
            System.out.println("i will be always run");
        }
    }
}