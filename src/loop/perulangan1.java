package loop;

public class perulangan1 {
    public static void main(String[] args) {
        int umur = 10;
        double gravitasi = 9.8;
        String nama = "Peter Parker";
        Boolean bukan_dosen = false;
        String[] superhero = new String[]{"Ant Man", "Captain America", "Spiderman", "Hulk", "Thor", "Iron Man"};

        System.out.println("umur: " + umur);

        System.out.println("gravitasi: " + gravitasi);

        System.out.println(nama instanceof String);
        System.out.println("nama: " + nama);

        System.out.println(superhero instanceof String[]);
        System.out.println("superhero 1: " + superhero[0]);
        System.out.println("superhero 2: " + superhero[1]);
        System.out.println("superhero 3: " + superhero[2]);
        System.out.println("superhero 4: " + superhero[3]);
        System.out.println("superhero 5: " + superhero[4]);
        System.out.println("superhero 6: " + superhero[5]);
    }

}
