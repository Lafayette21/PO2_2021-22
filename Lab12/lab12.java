public class lab12{
    public static void main(String[] args) {
        var Slow=new Slownik();

        String action=args[0];
        String word1=null;
        String word2=null;
        try{
            if(args[1]!=null){
                word1=args[1];
            }
            if(args[2]!=null){
                word2=args[2];
            }
        }
        catch(ArrayIndexOutOfBoundsException e){}
        

        if(action.equals("add") && word1!=null && word2!=null){
            var help=new Haslo(word1,word2);
            if(Slow.exists(help)){
                System.out.println("Haslo juz jest w slowniku");
            }
            else{
                Slow.addWords(help);
            }
            
        }
        else if(action.equals("del")){
            if(word1==null && word2!=null){
                Slow.delWords(word2);
            }
            else if(word1!=null && word2==null){
                Slow.delWords(word1);
            }
            else{
                Slow.delWords(word1);
            }
        }
        else{
           Slow.wypiszElement("pies"); 
        }
        System.out.println("\n\n"+Slow);

    }
}