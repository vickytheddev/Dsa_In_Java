class studentclass{
    String name;
    private int rollno;
    double percentage;
    public int getrollno(){  //getter
        return rollno;
    }
    public void setrollno(int roll){  //setter
        this.rollno = roll;
    }
}
class gettersetter {
    public static void main(String[] args) {
        studentclass obj = new studentclass();
        obj.name="vicky";
        obj.percentage=77.6;
        System.out.println("name =" + obj.name);
        System.out.println("percentage =" + obj.percentage);
        System.out.println(obj.getrollno()); //getter
        obj.setrollno(19);  //setter
        System.out.println(obj.getrollno());
    }
}



