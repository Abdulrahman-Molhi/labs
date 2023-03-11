import java.util.*;
class ROUND_ROBIN_SCHEDULING
{
    int temp=0;
    Scanner sc=new Scanner(System.in);
    int[] bur, wai,ta, extra_variable;
    int t=0;
    int flag=0;
    int total_size,q;
    int b=0;
    ROUND_ROBIN_SCHEDULING(int total_size)
    {
        this.total_size=total_size;
        ta=new int[total_size];
        extra_variable=new int[total_size];
        bur=new int[total_size];
        wai=new int[total_size];

    }
    void get()
    {
        for(int i=0;i<total_size;i++)
        {
            System.out.print("Enter burst time of P"+(i+1)+":");
            bur[i]=extra_variable[i]=sc.nextInt();
        }
        System.out.print("Enter quantum time:");
        q=sc.nextInt();
    }
    void round()
    {
        do{
            flag=0;
            for(int i=0;i<total_size;i++)
            {
                if(extra_variable[i]>=q)
                {
                    System.out.print("P"+(i+1)+"\t");
                    for(int j=0;j<total_size;j++)
                    {
                        if(j==i)
                            extra_variable[i]=extra_variable[i]-q;
                        else if(extra_variable[j]>0)
                            wai[j]+=q;
                    }
                }
                else if(extra_variable[i]>0)
                {temp=extra_variable[i];
                    System.out.print("P"+(i+1)+"\t");
                    for(int j=0;j<total_size;j++)
                    {if(j==i)
                        extra_variable[i]=0;

                    }

                        for(int j=0;j<total_size;j++)
                        {
                            if(i!=j &&extra_variable[j]>0 )
                            wai[j]+=temp;
                        }

                }
            }
            for(int i=0;i<total_size;i++)
                if(extra_variable[i]>0)
                    flag=1;
        }while(flag==1);
        for(int i=0;i<total_size;i++)
            ta[i]=wai[i]+bur[i];
    }
    void display()
    {
        System.out.println("\nProcess\tBurst\tWaiting\tTurnaround");
        for(int i=0;i<total_size;i++)
        {
            System.out.println("P"+(i+1)+"\t"+bur[i]+"\t"+wai[i]+"\t"+ta[i]);
            b+=wai[i];
            t+=ta[i];
        }
        System.out.println("Average waiting time is?"+(b/total_size));
        System.out.println("Average Turnaround time is?"+(t/total_size));
    }
}
class KROUND_ROBIN_SCHEDULIN
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Please Enter the total no of process:");
        int n=s.nextInt();
        ROUND_ROBIN_SCHEDULING obj = new ROUND_ROBIN_SCHEDULING(n);
        obj.get();
        obj.round();
        obj.display();
    }
}