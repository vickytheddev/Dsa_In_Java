class numden{
        int num;
        int den;
        numden(int num,int den){   //constructor
            this.num=num;
            this.den=den;
            simplify();
        }
        public void simplify(){    //method
            int HCF = gcd(num,den);
            num=num/HCF;
            den=den/HCF;        
        }
        public static int gcd(int num,int den){   //method
            int min =Math.min(num,den);
            for(int i=min ; i>=1 ; i--){
                if(num%i==0 && den%i==0){
                    return  i;
                }
            }
            return min;
        }
        public static numden add(numden F1,numden F2) {
            int numerator =(F1.num*F2.den) + (F1.den*F2.num);
            int denomerator =F1.den*F2.den;
            numden F3 = new numden(numerator,denomerator);
            return  F3;
        }   
    }
class fraction{
    public static void main(String [] args){
        numden F1 =new numden(35,21);
        System.out.println(F1.num+"/"+F1.den);

        numden F2 =new numden(7,4);
        System.out.println(F2.num+"/"+F2.den);

        numden F3 = numden.add(F1,F2);
        System.out.println("Addition of two fraction is: "+F3.num+"/"+F3.den);
    }
}