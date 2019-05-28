class BubbleSort
{
public static void main(String args[])
{
int nums[]={10,25,5,9,31,40,14,8,52,1};
int i,j,temp=0;
int size=10;
System.out.print("original array is:");
for(int a=0; a<size; a++)
System.out.print(" "+nums[a]);
System.out.println();
for(i=1; i<size;i++)
for(j=size-1;j>=i;j--)
{
if(nums[j-1]>nums[j])
{
temp=nums[j-1];
nums[j-1]=nums[j];
nums[j]=temp;
}
}
System.out.print("sorted array is:");
for(int a=0;a<size;a++)
System.out.print("  "+nums [a]);
System.out.println();
}
}
