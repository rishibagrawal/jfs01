class Asg_a0010{
public static int rev(int num)
{
if(num<999 && num>-999)
{
int x=num%10;
int x1=num/10;
int y=x1%10;
int y1=x1/10;
int z=y1%10;
int z1=y1/10;
int p=((x*100)+(y*10)+(z*1));
return(p);
}
else
{
return(0);
}
}
}
public class asg_a0010{
public static void main(String args[])
{
Asg_a0010 obj=new Asg_a0010();
System.out.println(obj.rev(124));
}
}

