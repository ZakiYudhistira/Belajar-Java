public class Barista {
    public static void main(String[] args)
    {
        String[] Bahan_Kopi = {"Bubuk kopi", "Gula", "Susu"};
        Minuman kopi = new Minuman("Kopi", 5000, Bahan_Kopi);
        System.out.println(kopi.getNama());
    }
}
