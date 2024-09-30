package javaProgramsPractice;

public class ArraysNumberSearch {

	public static void main(String [] args)
    {  
    
    int [] number={1,2,3,6,4,5};
    boolean isExist = false;
    int searchNumber=5;
int pos=0;
		   
		   
    for(int i=0; i < number.length ; i++){
        
        if (number[i]==searchNumber){
            isExist=true;
            pos=i;
            break;
        }
    }
        if(isExist)
            System.out.println("number " +searchNumber+" exists at the pos "+pos);
        
        else
            System.out.println("number "+searchNumber+" does not exist inside the array");
            
        
    }
}  



