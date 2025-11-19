import java.util.*;

class Digit
{
    public int SumDigit(int iNo)
    {
        int iDigit = 0;

        while(iNo !=0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
    }

}

class program91
{
    public static void main(String A[]) 
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();


        Digit dobj = new Digit();
        dobj.SumDigit(iValue);

        System.out.println("Addition is : ");
        // Important
        
        sobj = null;
        dobj = null;

        System.gc();
    }
}

// 2432902008176640000