public class Minuman
{
    private int harga;
    private String nama;
    private String[] ingredients;
    
    public Minuman(String nama_minuman, int harga_minuman, String[] ingredients_minuman)
    {
        harga = harga_minuman;
        nama = nama_minuman;
        ingredients = ingredients_minuman;
    }

    public int getHarga()
    {
        return harga;
    }

    public String getNama()
    {
        return nama;
    }

    public String[] getIngredients()
    {
        return ingredients;
    }
}