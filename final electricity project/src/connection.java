import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public  class connection {

    ArrayList<user> allusers   ;
     static int num_of_user=1;

    public connection() throws FileNotFoundException {
        allusers = new ArrayList<>();

        read_from_file();

    }

//done
    public boolean add(String n,String mn ,String ln,long ph, String address) {
        if (true) {


            user U = new user(n,mn,ln,ph,address);
            allusers.add(U);
            num_of_user++;
            return true;
        } else
            return false;

    }
//done
    public ArrayList<user> display() {


        return allusers;


    }


    //this is working on
/*    public user search(int id){
        boolean sign=false;
        int i=0;

        user d=new user();


        while(!sign) {
           user s=allusers.get(i);
            if (s!=null) {

                if (s.getId() == id) {
                    sign = true;
                    d=allusers.get(i);
                }else
                {i++;}


            }
            else i++;

        }
        if(d!=null)
        {
            return d;}
        else{

            return d;
        }


    }*/
    public user search(int id){
        boolean sign=false;
        int i=0;
        user d=null;
        while(!sign&&i<allusers.size()) {

            if (allusers.get(i).getId()==id) {
                d=allusers.get(i);
                return d;

            }else i++;



    }
        return d;
    }

    public int delete(int id){

        user s=search(id);
      boolean sign=false;
      if(s.p.getDept()==0&&s!=null){
          allusers.remove(s);
          sign=true;
          return 1;
      }
      else if (s.p.getDept()>0&&s!=null)
      {sign=true;
          return 2;
      }
       else if(sign==false);
        {
            return 3;
        }


    }


   //function4
    public boolean editName(int id,String name){
       user s=search( id);
if (s!=null){s.setName(name);
return true;}
      else
          return false;
    }
    public boolean editMame(int id,String name){
        user s=search( id);
        if (s!=null){s.setMname(name);
            return true;}
        else
            return false;
    }

    public boolean editLame(int id,String name){
        user s=search( id);
        if (s!=null){s.setLname(name);
            return true;}
        else
            return false;
    }
    //function5
    public boolean editPhone(int id,long phone){
        user s=search(id);

        if (s!=null) {
            s.setPhone(phone);
            return true;
        }else
            return false;
    }
    //function6
    public boolean editAddress(int id,String address){
        user s=search( id);

        if (s!=null) {
            s.setAddress(address);
            return true;
        }else
            return false;

    }
    public boolean edit_month(int mon,int id){
        user s=search( id);

        if (s!=null) {
            s.set_month(mon);
            return true;
        }else
            return false;

    }


    public boolean setting_current_read(int current,int id,int mon){
      user u=search(id);
        int index=allusers.indexOf(u);
        if (mon>0&&mon<=12)
        {        allusers.get(index).set_month(mon);

            if(current>allusers.get(index).p.current_read) {
                allusers.get(index).p.setPrevious_read();
                allusers.get(index).set_current_read(current);
                allusers.get(index).set_dept();
                return true;
            }
            else
                return false;

        }
        else
            return false;




    }

public int pay(int id,double money){
    user u=search(id);
   // int index=allusers.indexOf(u);

        if(money==u.get_dep()){
            u.set_dept_to_Zero();
            return 1;
        }
        else if(money<u.get_dep())
        {
           // System.out.println("you will have dept");
            u.set_dept_if_money_less(money);
          //  System.out.println(u.get_dep());
            return 2;
        }
        else {
            System.out.println("sorry can't accept money more than the bill or your input is wrong ");

                return 3;}

}
public void Write_to_file() throws FileNotFoundException {

    PrintWriter wr=new PrintWriter("D:\\users\\usersfile.txt");
    for (int i=0;i< allusers.size();i++)
    {
        wr.write(allusers.get(i).getName()+" "+allusers.get(i).getMname()+" "
                +allusers.get(i).getLname()+" "
                +allusers.get(i).getPhone()+" "+allusers.get(i).getAddress()+" "
                +allusers.get(i).p.getMonth()+" "+allusers.get(i).p.getKilo_price()+
                " "+allusers.get(i).get_dep()+" "
                +allusers.get(i).p.getCurrent_read()+" "+allusers.get(i).p.getPrevious_read()+" "+allusers.get(i).p.previous_dept+" "
                +" "+allusers.get(i).p.number_of_kilos+"\n");

    }
    wr.close();
}

//read from files
    public void read_from_file() throws FileNotFoundException {

Scanner in=new Scanner(new File("D:\\users\\usersfile.txt"));
int i=0;
while(in.hasNext())
        {
            String fn=in.next();
           String mn=in.next();
            String ln=in.next();
            long ph=in.nextLong();
            String ad=in.next();
           add(fn,mn,ln,ph,ad);
           String month=in.next();
            double kilo_price=in.nextDouble();
            double debt=in.nextDouble();
            int current_read= in.nextInt();
            int previous_read=in.nextInt();
            double previous_dept=in.nextDouble();
            int number_of_kilos=in.nextInt();
            allusers.get(i).p.setMonth_file(month);
            allusers.get(i).p.kilo_price=kilo_price;
            allusers.get(i).p.dept=debt;
            allusers.get(i).p.current_read=current_read;
            allusers.get(i).p.previous_read=previous_read;
            allusers.get(i).p.previous_dept=previous_dept;
            allusers.get(i).p.number_of_kilos=number_of_kilos;
            i++;



        }
        in.close();





    }




}



   /* public boolean paying(int id,double money){

        if (allusers.get(id).payment(money))
        {
         return true;
        }
        else return false;





    }
    public boolean set_c_read(int d,int id){
        allusers.get(id).set_current_read(d);
        return true;
    }*/
/*
    public int search_for_index(int id){
        boolean sign=false;
        int i=0;

        user d=new user();

        while(!sign&&i<=allusers.size()) {
            if (allusers.get(i)!=null) {

                if (allusers.get(i).getId() == id) {
                    sign = true;

                }else
                    i++;


            }
            else i++;

        }
        if(sign)
        {
            return i;}
        else
            return -9;


    }*/