public class jagged_array 
{
    public static void main(String args[])
    {
        int jarr[][]=new int[2][];  //to store two 1-D array
        
        jarr[0]=new int[3];     //1st 1-D array
        jarr[1]=new int[3];     //2nd 1-D array
        
        //store elements in 1st array:
        jarr[0][0]=45;
        jarr[0][1]=20;
        jarr[0][2]=86;
        
        //store elements in 2nd array:
        jarr[1][0]=98;
        jarr[1][1]=76;
        jarr[1][2]=23;
        
        //displaying elements of 1st array:
        for(int i=0;i<3;i++)
            System.out.print(jarr[0][i]+" ");
        System.out.println();
        for(int i=0;i<3;i++)
            System.out.print(jarr[1][i]+" ");
    }
}
