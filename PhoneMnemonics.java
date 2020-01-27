public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        Createcombo("","23");
     }
     /*
     Dado un numero debe devolver todos los set posibles con los numeros de ese set
     */
     
     /*public static Set<String> GetSets(String inputnumber){
        
         
     }*/
     
     public static String Createcombo(String InitialString, String inputnum){
         //get curretn string and get letters for first number
         String[] letters = getLettersxNumber(inputnum.charAt(0));
         //add each letter to initial string
         for (String letter : letters) 
        { 
            letter = InitialString.concat(letter);
             System.out.println(letter);
        }
         if(inputnum.length() >  1){
             for (String letter : letters) 
            { 
                Createcombo(letter,inputnum.substring(1));
            }
         }
         //if there is only one number left send the set as it is
         return "";
     }
     public static String[] getLettersxNumber(char number){
         switch(number){
              case '2':
                return new String[] {"A", "B", "C"};

                case '3':
                return new String[] {"D", "E", "F"};
              
                case '4':
               return new String[] {"G", "H", "I"};
               
                case '5':
                return new String[] {"J", "K", "L"};
               
                case '6':
                return new String[] {"M", "N", "O"};
             
                case '7':
                return new String[] {"P", "Q", "R", "S"};
             
                 case '8':
                return new String[] {"T", "U", "V"};
               
                 case '9':
                return new String[] {"W", "X", "Y", "Z"};
            
            default:
                return new String[] {""};
             
         }
     }
}
