
public class linearsearch {
    public static int search (int [] number,int key) {
        for (int i = 0; i < number.length; i++) {
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] number = {10,30,60,40,90};
        int key = 40;
        int index = search(number,key);
        if(index==-1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("At index " + index);
        }
    }
}
//