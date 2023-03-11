import java.util.Scanner;
/*
public class ROUND_ROBIN_SCHEDUL {
  SinglyLinkedList<Integer> burst_time,bt,wai;
    int temp=0;
    Scanner sc=new Scanner(System.in);
    int ta;
    int t=0;
    int flag=0;
    int total_size,q;
    int b=0;
    ROUND_ROBIN_SCHEDUL(int total_size)
    {
        this.total_size=total_size;
        burst_time=new SinglyLinkedList<Integer>();
        bt=new SinglyLinkedList<Integer>();
        wai=new SinglyLinkedList<Integer>();
        /*ta=new int[total_size];
        extra_variable=new int[total_size];
        bur=new int[total_size];
        wai=new int[total_size];

    }
    void get()
    {

        System.out.print("Enter quantum time:");
        q=sc.nextInt();
        for(int i=0;i<total_size;i++)
        {
            System.out.print("Enter burst time of P"+(i+1)+":");
            int ss=sc.nextInt();
            burst_time.addlast(ss);
            bt.addlast(ss);
            wai.addlast(q);
        }
        wai.addFirst(wai.removefirst()-q);
    }
    void round()
    {
        do{

            /*for(int i=0;i<total_size;i++)*/
/*
                if(burst_time.first()>=q){
                    boolean t=false;
                    for (int j = 0; j < burst_time.numofelements; j++) {
                        if (j==0 && t==false)
                        {
                            wai.addlast(wai.removefirst());
                            burst_time.addFirst(burst_time.removefirst()-q);
                            if (burst_time.first()==0)
                            {burst_time.removefirst();
                                t=true;
                                burst_time.addlast(burst_time.removefirst());
                            }



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

                }

                else if(burst_time.first()>0)
                /*System.out.print("P"+(i+1)+"\t");*/
  /*                  {
                   int temp=burst_time.removefirst();
                    wai.addlast(wai.removefirst());
                    for (int j = 0; j < burst_time.getNumofelements(); j++) {
                        if (  burst_time.first() > 0 && burst_time.first()!=null)
                            wai.addlast(wai.removefirst()+temp);
                        burst_time.addlast(burst_time.removefirst());
                    }

                         if(burst_time.first()!=null)
                         { burst_time.addlast(burst_time.removefirst());
                        wai.addlast(wai.removefirst());}
                    }

        }while(!burst_time.isempty());


    }

    void display()
    {
        System.out.println("\nProcess\tBurst\tWaiting\tTurnaround");
        for(int i=0;i<total_size;i++)
        {
            System.out.println("P"+(i+1)+"\t"+ bt.removefirst()+"\t"+wai.removefirst()+"\t");
        }
    }

    public static void main(String[] args) {

        Scanner ss=new Scanner(System.in);
        System.out.print("Please Enter the total no of process:");
        int n=ss.nextInt();
        ROUND_ROBIN_SCHEDUL obj = new ROUND_ROBIN_SCHEDUL(n);
        obj.get();
        obj.round();
        obj.display();


    }





}
  /*
            b+=wai[i];
            t+=ta[i];

        System.out.println("Average waiting time is?"+(b/total_size));
        System.out.println("Average Turnaround time is?"+(t/total_size));
    */