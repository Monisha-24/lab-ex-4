/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
package Mypackage ;
public class Compare
{
    int num1,num2;
    compare(intn,intm)
    {
        num1=n;
        num2=m;
    }
    public void getmax()
    {
        if(num1>num2)
        {
            System .out.println ("Max of two number is"+num1);
        }
        else
        {
            System .out.println ("Max of two number is:"+num2);
        }
    }
	public static void main(String[] args) {
	    compare current[]=new Compare [3];
	    current[1]=new compare(5,10);
	    current[2]=new compare(123,120);
	    for(inti=1;i<3;i++)
	    {
		current [i].getmax();
	}
}
