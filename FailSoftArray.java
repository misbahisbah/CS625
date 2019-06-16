class FailSoftArray
{
private int a[];
private int errval;
public int length;
public FailSoftArray(int size, int errv)
{
a=new int [size];
errval=errv;
length=size;
}
public int get (int index)
{
if (indexok(index)) return a [index];
return errval;
}
public boolean put (int index ,int val)
{
if(indexok(index))
{
a[index]=val;
return true;
}
return false;
}
private boolean indexok(int index)
{
if(index>=0 & index <length) return true;
return false;
}
}
class FsDemo
{
public static void main (String args[])
{
FailSoftArray fs =new FailSoftArray(5,-1);
int x;
System.out.println("fail quietly.");
for(int i=0; i<(fs.length*2);i++)
fs.put(i,i*10);
for(int i=0; i<(fs.length*2); i++)
{
x=fs.get(i);
if(x!=-1)
System.out.print(x+ " ");
}
System.out.println(" ");
System.out.println("\n Fail with error reports.");
for(int i=0; i<(fs.length *2); i++)
if(!fs.put (i,i*10))
System.out.println("index" + i + "out-of-bounds");
for (int i=0; i<(fs.length * 2); i++)
{
x=fs.get(i);
if(x!=-1) System.out.print(x + " " );
else
System.out.println("index" + i +"out-of-bounds");
}
}
}
