public class KucingAdapter implements Kucing{
    Bebek bebek;

    public KucingAdapter(Bebek bebek)
    {
        this.bebek = bebek;
    }

    public void meow()
    {
        bebek.kwek();
    }
}
