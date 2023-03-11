import java.util.Scanner;
import java.util.*;
public class round_robin_last
{
    SinglyLinkedList <Integer> burst_time ,waiting_time,bt,extra_waiting_time;
        int temp=0;
        int counter=-1;
        Scanner sc=new Scanner(System.in);
        int[] bur, wai;
        int t=0;
        int flag=0;
        int total_size,q;
        int size=0;
        int b=0;
      public  round_robin_last(int total_size)
        {
            this.total_size=total_size;
            size=total_size;
            size=total_size;
            wai=new int[total_size];
            burst_time=new SinglyLinkedList<Integer>();
            bt=new SinglyLinkedList<Integer>();
            waiting_time=new SinglyLinkedList<Integer>();
            extra_waiting_time=new SinglyLinkedList<Integer>();
        }
        void get()
        {
            for(int i=0;i<size;i++)
            {
                System.out.print("Enter burst time of P"+(i+1)+":");
                int x/*bur[i]=extra_variable[i]*/=sc.nextInt();
                burst_time.addlast(x);
                bt.addlast(x);
                waiting_time.addlast(0);
            }
            System.out.print("Enter quantum time:");
            q=sc.nextInt();
        }
        void round()
        {
            do{

               /* for(int i=0;i<total_size;i++)*/

                    if(burst_time.first()>=q && !burst_time.isempty())
                    {
                        counter++;
                        if(counter==total_size)
                        {    counter=0;
                        for (int i = 0; i <total_size ; i++) {
                            if(wai[i]!=0 )
                                counter++;
                            else break;
                        }}
                        if(burst_time.first()==q) {

                            burst_time.removefirst();
                            //extra_waiting_time.addlast(waiting_time.removefirst());
                            wai[counter]=waiting_time.removefirst();
                            size--;


                            for (int i = 0; i < size; i++) {
                                if (burst_time.first()>0)
                                    waiting_time.addlast(waiting_time.removefirst()+q);
                                    burst_time.addlast(burst_time.removefirst());
                            }

                        }else if(burst_time.first()>q)
                        {

                            burst_time.addlast(burst_time.removefirst()-q);
                            for (int i = 0; i < size ; i++) {
                                if(i==0)
                                    waiting_time.addlast(waiting_time.removefirst());
                                else
                                {
                                    waiting_time.addlast(waiting_time.removefirst()+q);
                                    burst_time.addlast(burst_time.removefirst());
                                }
                            }

                            burst_time.addlast(burst_time.removefirst());
                            waiting_time.addlast(waiting_time.removefirst());


                        }





                    }

                   else  if(burst_time.first()<q && !burst_time.isempty())
                    {
                        counter++;
                        if(counter>=total_size)
                        {  counter=0;
                        for (int i = 0; i <total_size ; i++) {
                            if(wai[i]!=0)
                                counter++;
                            else break;
                        }}

                        int temp=burst_time.removefirst();
                          //extra_waiting_time.addlast(waiting_time.removefirst());
                        wai[counter]=waiting_time.removefirst();
                        size--;
                         if(size!=0)
                        for (int j = 0; j <size; j++) {

                                waiting_time.addlast(waiting_time.removefirst()+temp);
                                burst_time.addlast(burst_time.removefirst());

                        }


                    }


                       /*   {temp=extra_variable[i];
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

                    }*/



            }while(!burst_time.isempty());
        //    for(int i=0;i<total_size;i++)
             //   ta[i]=wai[i]+bur[i];
        }
        void display()
        {
            System.out.println("\nProcess\tBurst\tWaiting\tTurnaround");
            for(int i=0;i<total_size;i++)
            {
                System.out.println("P"+(i+1)+"\t"+bt.removefirst()+"\t"+wai[i]+"\t");
                /*b+=wai[i];
                t+=ta[i];*/
                /*ta[i]*/
            }
            System.out.println("Average waiting time is?"+(b/total_size));
            System.out.println("Average Turnaround time is?"+(t/total_size));
        }
    }
    class s
    {
        public static void main(String arg[])
        {
            Scanner s=new Scanner(System.in);
            System.out.print("Please Enter the total no of process:");
            int n=s.nextInt();
            round_robin_last obj = new round_robin_last(n);
            obj.get();
            obj.round();
            obj.display();
        }
    }




  /*

               if(burst_time.first()>q && !burst_time.isempty())
                       {
                       burst_time.addlast(burst_time.removefirst()-q);
                       for(int j=0;j<burst_time.numofelements;j++)
        {
        if (j==0)
        waiting_time.addlast(waiting_time.removefirst());
        else if(burst_time.first()>0)
        {waiting_time.addlast(waiting_time.removefirst()+q);
        burst_time.addlast(burst_time.removefirst());}
        }
        burst_time.addlast(burst_time.removefirst());
        waiting_time.addlast(waiting_time.removefirst());
        if (burst_time.first()<=0) {
        burst_time.removefirst();
        extra_waiting_time.addlast(waiting_time.removefirst());
        }
        }
*/



