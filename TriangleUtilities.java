 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder row = new StringBuilder();
        for (int i =0; i < numberOfStars; i++)
        {
        row.append("*");
        
    }
    return row + "";
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder row = new StringBuilder();
        for (int i =0; i < numberOfRows; i++)
        {
        
        row.append("*\n");
        System.out.println(row);
    }
    return row +"";
    }


    public static String getSmallTriangle() {
         
         String row ="";
         String star="*";
        for (int i =0; i <=3; i++)
        {
        
        row+=star;
        row+="\n"; 
        star+="*";
        System.out.println(row);
        
   
    }
    
       return row +"";
    

}

    public static String getLargeTriangle() {
         String row ="";
         String star="*";
        for (int i =1; i <=9; i++)
        {
        
        row+=star;
        row+="\n"; 
        star+="*";
       
        System.out.println(row);
        
   
    }
    
       return row +"";
    
    }
}
