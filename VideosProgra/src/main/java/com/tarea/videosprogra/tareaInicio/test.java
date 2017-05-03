package tareaInicio;
public class test{
    public static void main(String... args){
        System.out.print("hola ");
        for(int i=0; i< args[0].length();i++){        
            System.out.print(args[0].charAt(i));  
            if(i < args[0].length()-1)
                System.out.print("-"); 
        }
        System.out.println();    
        //System.out.println("hola" + args[args.length-1]);
       // for( String param: args)
       //     System.out.print("hola "+);
    }    

}
