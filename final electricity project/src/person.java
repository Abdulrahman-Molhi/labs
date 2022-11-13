public class person {
    private String name;

    private String mname;

    private String lname;
    private long phone;
    private String address;



    public person(String name, String mname, String lname, long phone, String address) {
        this.name = name;
        this.mname = mname;
        this.lname = lname;
        this.phone = phone;
        this.address = address;
    }

    public person() {
        this.name = null;
        this.address = null;
        this.phone = 0;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMname() {
        return mname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


    public String getLname() {
        return lname;
    }


    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String Display() {
        return "person{" + name +" "
                 + mname +
                " "+ lname +
                ", phone=" + phone +
                ", address='" + address + '\''
                ;
    }
}





