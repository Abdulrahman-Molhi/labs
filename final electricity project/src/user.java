import java.util.Objects;

public class user extends person {
     private int id=0;
     payment p;

/*just to try
* */
    public user() {
        id=0;
        p=new payment();
    }

    public user(String fname, String mname,String lname,long phone, String address) {
        super(fname, mname, lname,phone, address);
        setId();
        p=new payment();
    }
    public String display_forgrapgic(){
     return getName()+"\t"+getMname()+"\t"+getLname()+"\t"+getPhone()+"\t"+getAddress()+"\t"+getId()+"\t"+p.getMonth()+"\t"+p.getKilo_price()+"\t"+p.getCurrent_read()+"\t"+p.getPrevious_read()+"\t"+p.getDept()+" \n";
    }


 private   void setId() {
     this.id = connection.num_of_user;
   }

    public int getId() {
        return id;
    }
//    @Override


    // set current read
    public double set_current_read(int current){
        p.setPrevious_read();
        p.setCurrent_read(current);
        return p.getDept();

    }

    public int get_current_read(){
    return p.current_read;
    //return  p.getCurrent_read();
    }

    public void set_dept(){

       p.setDept(get_current_read());

    }
    public void set_dept_to_Zero(){

        p.setDept_to_zero();
    }
    public void set_dept_if_money_less(double money){

        p.setDept_money_is_less(money);
        p.dept=p.previous_dept;
    }
    public double get_dep(){
        return p.dept;
    }
    public void set_month(int mon){
        p.set_month(mon);

    }
    public String get_month(){
        return p.getMonth();
    }






    @Override
    public String Display() {

        return super.Display()+"ID:"+getId()+'\''+p.display();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return id == user.id;
    }






    }

    /*public void set_current_read(int d){
        p.set_current_read(d);
        p.getNumber_of_kilos_for_this_month();
        p.set_dept();
    }*/


    /*public boolean payment(double money){
        if(money==p.set_dept())
        {
            p.afterpaymeny();
            p.set_dept_to_zero();
            return true;
        }
       /* else if (money>p.getNumber_of_kilos_for_this_month()*p.getKilo_price())
        {

        }*/
//  else{return false;}

