public class TallyCounter2 {
    private int num;
    private int udo;
    private int limit;
    public TallyCounter2(){num=0;}

    public void click(){
        if(num<=(limit-1))
        {
            num++;
         udo=num;
        }
        else
            System.out.println("sorry you reached your limitation");

     }

    public int getClick(){return num;}

    public void reset(){num=0;}
    public void undo(){
        if(num==udo)
        {num=num-1;

        }
        else
            System.out.println("sorry you reached your limitation ");

    }
    public void setLimit(int l)
    {    if(l>0)
        limit=l;
    else
        System.out.println("you entered invalid number");
    }

}
