public class NameMain{
    public static void main(String[] args) {
        Name n = new Name("    sEan       "," MicHael "," MoRrIs ");
        System.out.println(n.lastFirst());
        System.out.println(n.fullName());   
        System.out.print(n.nickName());
    } 
}