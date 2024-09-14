package f;
class U{
    public static void main(String[]a){
        String[]n={"grim","carlos","pedro"};
        System.out.println("Nomes:");
        for(byte i=0;i<n.length;i++){
            n[i]=n[i].substring(0,1).toUpperCase()+n[i].substring(1);
            System.out.println("\t"+(i+1)+"ºNome:"+n[i]);
        }
    }
}