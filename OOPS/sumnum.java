class sum{
    public int add(int num1,int num2){
        return num1+num2;
    }
}
class sumnum{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        sum obj = new sum();
        int ans=obj.add(a,b);
        System.out.println(ans);
    }
}