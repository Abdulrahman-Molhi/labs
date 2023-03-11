import java.util.Scanner;

public class ROUND_ROBIN_SCHEDU {
    SinglyLinkedList<Integer> burst_time,bt,wai;
    int temp=0;
    Scanner sc=new Scanner(System.in);
    int ta;
    int t=0;
    int flag=0;
    int total_size,q;
    int b=0;
   public ROUND_ROBIN_SCHEDU(int total_size)
    {
        this.total_size=total_size;
        burst_time=new SinglyLinkedList<Integer>();
        bt=new SinglyLinkedList<Integer>();
        wai=new SinglyLinkedList<Integer>();
        /*ta=new int[total_size];
        extra_variable=new int[total_size];
        bur=new int[total_size];
        wai=new int[total_size];
*/
    }
    void get()
    {

        System.out.print("Enter quantum time:");
        q=sc.nextInt();
        for(int i=0;i<total_size;i++)
        {
            System.out.print("Enter burst time of P"+(i+1)+":");
            int s=sc.nextInt();
            burst_time.addlast(s);
            bt.addlast(s);

        }

    }
    void round()
    {
        do{

            /*for(int i=0;i<total_size;i++)*/

                if(burst_time.first()>=q) {
                    for (int j = 0; j < burst_time.numofelements; j++) {
                        if (j == 0) {
                            wai.addlast(wai.removefirst()+0);
                            burst_time.addlast(burst_time.removefirst() - q);
                        }
                        else
                        wai.addlast(wai.removefirst()+q);
                    }
                }/*
                        }
                        else if (t==true && burst_time.first()==0) {
                            wai.addlast(wai.removefirst());
                            t=false;
                            burst_time.addlast(burst_time.removefirst());
                        }else if (t==true && burst_time.first()>0) {
                            wai.addlast(wai.removefirst()+q);
                            t=false;
                            burst_time.addlast(burst_time.removefirst());
                        } else if(burst_time.GetAfterhead()==0 && t==false)
                        {
                            wai.addlast(wai.removefirst());
                            burst_time.addlast(burst_time.removefirst());
                        }
                        else if(burst_time.GetAfterhead()>0 && t==false)
                        {
                            wai.addlast(wai.removefirst()+q);
                            burst_time.addlast(burst_time.removefirst());
                        }

                    }

                }*/

                else if(burst_time.first()>0)
                /*System.out.print("P"+(i+1)+"\t");*/
                   {
                   int temp=burst_time.removefirst();
                   int i=0;
                    while(i<total_size) {
                        if (  burst_time.first() == 0 && burst_time.first()!=null &&i==0)
                        {   wai.addlast(wai.removefirst());
                        /*burst_time.addlast(burst_time.removefirst());*/
                    i++;
                        }
                        else
                            if(wai.first()!=null)
                            { wai.addlast(wai.removefirst()+temp);
                            i++;}

                    }}

        }while(!burst_time.isempty());


    }

    void display()
    {
        System.out.println("\nProcess\tBurst\tWaiting\tTurnaround");
        while(!bt.isempty())
        {int i=0;

            System.out.println("P"+(i+1)+"\t"+ bt.removefirst()+"\t"+wai.removefirst()+"\t");
            i++;
        }
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Please Enter the total no of process:");
        int n=s.nextInt();
        ROUND_ROBIN_SCHEDU obj = new ROUND_ROBIN_SCHEDU(n);
        obj.get();
        obj.round();
        obj.display();


    }
}
