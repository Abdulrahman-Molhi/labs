import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    connection c;
    Scanner in=new Scanner(System.in);
int choose;
    public menu() throws FileNotFoundException {
        c=new connection();
    }

    public void show_menu() throws FileNotFoundException {
        header();
        System.out.println("choose one of the following please to perform a task");
        System.out.println("1-adding a new user ");
        System.out.println("2-display users");
        System.out.println("3-search for user by id");
        System.out.println("4-look for student");
        System.out.println("5-setting user current read");
        System.out.println("6-deleting user");
        System.out.println("7-payment");
        header();



for (;;) {
    choose=in.nextInt();
    switch (choose) {
        case 1:
            add();
            break;
        case 2:
            display();
            break;
        case 3:
            lookFor();break;
        case 4:
        editing();break;
        case 5:seting_user_counter_read();break;
        case 6:deleting();break;
        case 7:payment();break;
        case 0:{c.Write_to_file();
            System.exit(0);
        }
    }
}






       /* else if(choose==2)
        display();
*/




    }
private void header(){
    System.out.println("___________________________________________________________________________");


}


public void add() throws FileNotFoundException {

       String name,mname,lname;
       long phone;
       String address;
    System.out.println("first name:");
       name=in.next();
    System.out.println("middle name:");
       mname=in.next();
    System.out.println("last name:");
       lname=in.next();
    System.out.println("phone number:");
       phone=in.nextLong();
    System.out.println("address:");
       address=in.next();

       if(c.add(name,mname,lname,phone,address))
    {

         System.out.println("added successfully !");

    }
    else
    System.out.println("some thing is wrong please try again  later");



}
public void display()
 {

     ArrayList<user>displayAll=c.display();
     for (int i = 0; i < displayAll.size(); i++) {
        System.out.println(displayAll.get(i).Display());

    }

 }

 public void lookFor(){
     System.out.println("enter the number of your Kilo counter:");
    int k;
    k= in.nextInt();
    user s;
   s=c.search(k);
     if(c.search(k)==null)
     {
         System.out.println("sorry but there is no user with this id");
     }

     else
     {

         System.out.println("we found the user");
         System.out.println(s.Display());

     }


 }

public void editing(){
    System.out.println("enter the id for the user u want to edit");
    int d= in.nextInt();
        if (c.search(d)!=null) {
            System.out.println("what do you want to  edit?");
            System.out.println("1-name\n2-phone\n3-address\n4-edit month");
            int s;
            s = in.nextInt();
            switch (s) {
                case 1:{
                    System.out.println("enter tha name please");
                    String n=in.next();
                    if (c.editName(d,n))
                        System.out.println("change successfully! ");
                    else
                        System.out.println("sorry user doesn't exist");
                } break;
                case 2:{
                    System.out.println("enter tha phone number");
                    long p=in.nextLong();
                    if (c.editPhone(d,p))
                        System.out.println("change successfully! ");
                    else
                        System.out.println("sorry user doesn't exist");
                } break;
                case 3:{
                    System.out.println("enter tha address");
                    String a=in.next();
                    if (c.editAddress(d,a))
                        System.out.println("change successfully! ");
                    else
                        System.out.println("sorry user doesn't exist");
                }
                case 4:{
                    System.out.println("enter the number of the month");
                    int mon= in.nextInt();

                    if(c.edit_month(d,mon))
                        System.out.println("change successfully! ");
                    else
                        System.out.println("sorry user doesn't exist");

                }
            }
        }


}
    public void seting_user_counter_read(){
        System.out.print("enter the user id:");
        int id=in.nextInt();
        user d=c.search(id);
        if (d!=null){
            System.out.println("please enter the current read ");
            int current=in.nextInt();
            System.out.println("please enter the current month ");
            int mon=in.nextInt();

            if (c.setting_current_read(current,id,mon))
            {   System.out.println("done successfully");
            }
            else
                System.out.println("sorry something wrong");


        }
        else System.out.println("sorry something wrong");


    }
    public void deleting(){
        System.out.println("enter the id of the user you want to delete");
        int id=in.nextInt();
        if(id>0){

            if(c.delete(id)==1)
                System.out.println("deleted successfully");
            else if(c.delete(id)==2)
                System.out.println("you still have to pay your dept:"+c.search(id).p.dept);
            else if (c.delete(id)==3) {
                System.out.println("input wrong ");
            }

        }

    }
    public void payment() {
        System.out.println("enter the user id:");
        int id = in.nextInt();
        user u=c.search(id);

        if (u!= null)
        {
            System.out.println("your bill is"+u.p.getDept());
            System.out.println("please enter the payment for your pull");
            double money=in.nextDouble();
            if (money>0)
            {int n=c.pay(id,money);
                if(n==1)
                {
                    System.out.println("you fully paid your bill");
                }
                else if (n==2) {

                    System.out.println("you didn't fully paid your bill please pay it soon or our service will be cut");
                }
                else System.out.println("we can't accept more than you have to pay");

            }
            else System.out.println("the money input is wrong");
        }








    }







}
















/*
public void seting_user_conter_read(){
    System.out.print("enter the user id:");
    int id=in.nextInt();
    user d=c.search(id);


        if(d!=null){
            System.out.println("enter the last read you take");
            int k=in.nextInt();
            d.set_current_read(k);

        }
        else
            System.out.println("user not found");

*//*
public void payment(){
    System.out.println("enter the id for the user please:");
    int id=in.nextInt();
    user u=c.search(id);
    if(c.search(id)!=null)
    {
        System.out.println("enter the amount of money please:");
        double money= in.nextDouble();

        if(c.paying(id,money))
        {
            System.out.println(u.Display());
            System.out.println("\nhas paid his pill");
        }

        else
            System.out.println("doesn't pay");


    }
    else System.out.println("sorry something went wrong payment menu");




}*/
