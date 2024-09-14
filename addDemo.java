import java.lang.*;
class add{
    void display(int a,int b){
        int c=a+b;
        System.out.println("The sum of"+a+"&"+b+"is:"+c);
    }
    void display(double a,double b){
        double c=a+b;
        System.out.println("The sum of"+a+"&"+b+"is:"+c);
    }
}
class addDemo{
    public static void main(String args[]){
        add ob=new add();
        ob.display(10,20);
        ob.display(10.1,20.2);
    }
}