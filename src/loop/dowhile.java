package loop;

public class dowhile {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas Sekaarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas ketika penuh : " + penuh+ "ml");

        do{
            isiGelas++;
            System.out.println("Sedang Mengisi gelas..");
            System.out.println("Isi Gelas Sekaarang : " + isiGelas + "ml");
        }while (isiGelas != penuh);

        System.out.println("Finale :Isi Gelas Sekaarang : " + isiGelas + "ml");
    }
}
