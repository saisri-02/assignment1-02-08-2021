import java.util.*;
public class Main
{
static int n;
static int a[]=new int[n];
static int prefix[]=new int[n];
public static int sumrange(int l,int r)
{
prefix[0]=a[0];
for(int i=1;i<n;i++)
{
prefix[i]=prefix[i-1]+a[i];
}
if(l==0)
{
return prefix[r];
}
else
{
return prefix[r]-prefix[l-1];
}
}
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
n=sc.nextInt();
while(t>0)
{
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int l,r;
l=sc.nextInt();
r=sc.nextInt();
sumrange(l,r);
}
t--;
}
}

output:

3
6
-2 0 3 -5 2 -1
0 2
1
2 5
-1
0 5
-3