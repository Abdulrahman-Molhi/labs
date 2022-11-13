public class payment {
   String month="unselected";
     int current_read;
   int previous_read;
    double kilo_price=300;
    double dept;

    double previous_dept=0;
    int number_of_kilos;

    public void setMonth_file(String month) {
        this.month = month;
    }

    public payment(){
        this.current_read=0;
        previous_read=0;
        kilo_price=300;



    }
    public int kilos(){
       number_of_kilos=current_read-previous_read;
    return number_of_kilos;
    }
//dept1
    public void setDept(int current_r) {
        if(current_r>previous_read)
        {
            setPrevious_dept();
            this.dept =kilos()*kilo_price+previous_dept;
        }
        else
            System.out.println("try again");


    }
    public void setPrevious_dept(){
        if(dept!=0)
            previous_dept=dept;
        else previous_dept=0;
    }
    //dept2
    public void setDept_to_zero() {
        this.dept = 0;
    }
  //dept3
  public void setDept_money_is_less(double money) {
      previous_dept =dept-money;

  }


    public double getDept() {
        return dept;
    }

    public int getCurrent_read() {
        return current_read;
    }

    public void setCurrent_read(int current_read) {
        this.current_read = current_read;
    }


    public int getPrevious_read() {
        return previous_read;
    }

    public  void setPrevious_read() {
      previous_read=current_read;
    }

    public double getKilo_price() {
        return kilo_price;
    }

    public void setKilo_price(double kilo_price) {
        this.kilo_price = kilo_price;
    }

    public String set_month(int i){
        switch (i) {
            case 1:
                month="jan";
                break;
            case 2:
                month="feb";
                break;
            case 3:
                month="mar";
                break;
            case 4:
                month="apr";
                break;
            case 5:
                month="may";
                break;
            case 6:
                month="june";
                break;
            case 7:
                month="july";
                break;
            case 8:
                month="Aug";
                break;
            case 9:
                month="Sep";
                break;
            case 10:
                month="Oct";
                break;
            case 11:
                month="Nov";
                break;
            case 12:
                month="Dec";
                break;
             default:
                 System.out.println("mnot acceptable month");


        }
        return month;

}

    public String getMonth() {
        return month;
    }





    public String display() {
        return "payment{" +
                "month='" + month + '\'' +
                ", kilo_price=" + kilo_price +
                ", dept=" + dept +
                 previous_dept +", Current read="+current_read+", previous read="+previous_read+"number of kilos="+number_of_kilos
              + "previous debt"+previous_dept+'}';
    }
}



/*
    double dept;
 private int current_read=0;
  static double kilo_price=300;
  static   int  previous_read=0;
  int number_of_kilos_for_this_month=0;

    public payment() {


    }
     //function1
    public void setKilo_price(double kilo_price) {
        this.kilo_price = kilo_price;
    }
    //function2
    public double getKilo_price() {
        return kilo_price;
    }
    //function3
    public int getcurrent_read() {
        return current_read;
    }

    public int getNumber_of_kilos_for_this_month(){
        number_of_kilos_for_this_month=current_read-previous_read;
        return number_of_kilos_for_this_month;
    }

    //function4
    public boolean set_current_read(int d){
        if(d>0&&d>previous_read)
        {
            current_read=d;
            return true;
        }
        else

            return false;

    }
    //after reading
    public double set_dept(){
        dept=number_of_kilos_for_this_month*kilo_price;
   return dept;
    }
    public void set_dept_to_zero()
    {dept=0;}



    //after payment1
    public void afterpaymeny(){
        previous_read=current_read;

    }
*/