public class Main {
    public static void main(String args[])
    {
        Kwek kwek= new Kwek();
        Kucing kucing = new Meow();
  
        Kucing kucingAdapter = new KucingAdapter(kwek);
  
        System.out.println("Bebek");
        kwek.kwek();
  
        System.out.println("Kucing");
        kucing.meow();
   
        System.out.println("KucingAdapter...");
        kucingAdapter.meow();
    }
}
