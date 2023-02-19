import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class mark {
    public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("enter the marks of 10 student");
        for(int i=0;i<10;i++)
        {
            System.out.println("marks of student"+(i+1));
            a[i]=s.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(a[i]<a[j])
                {
                    int num;
                    num=a[i];
                    a[i]=a[j];
                    a[j]=num;

                }
            }
        }
        for(int i=0;i<10;i++)
        {
            if(a[i]>=40 && a[i]<=50)
            {
            System.out.println("PASS\t"+a[i]);
            }
            else if(a[i]>=51 && a[i]<=75)
            {
            System.out.println("MERIT\t"+a[i]);
            }
            else if(a[i]>=76 && a[i]<=100)
            {
            System.out.println("DISTINCTION\t"+a[i]);
            }
            else
            {
                System.out.println("FAIL\t"+a[i]);
            }
        }
        
    }
    
}
