import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Scanner;

    public class main {
        public static void main(String [] args) {
            LinkedList<lagu> Lagu = new LinkedList<lagu>();
            Scanner input = new Scanner(System.in);
            boolean kondisi = true;

            while (kondisi) {
                menu();
                switch (input.nextInt()) {
                    case 1:
                        System.out.println("Masukkan Judul Lagu: ");
                        String judulLagu = input.next();
                        System.out.println("Masukkan Nama Penyanyi: ");
                        String namaPenyanyi = input.next();
                        Lagu.addLast(new lagu(judulLagu, namaPenyanyi));
                        break;

                    case 2:
                        System.out.println("1. Hapus Berdasarkan Judul");
                        System.out.println("2. Hapus Lagu Terakhir");
                        if (input.nextInt() == 1) {
                            removeWithJudul(Lagu, input.next());
                        }

                        else {
                            Lagu.removeLast();
                        }

                        break;

                    case 3:
                        print(Lagu);
                        break;

                    default:
                        kondisi = false;
                        break;
                }
            }
        }

        public static void print(LinkedList Lagu) {
            ListIterator<lagu> iterator = Lagu.listIterator();

            while (iterator.hasNext()) {
                System.out.print(iterator.next());

                if (iterator.hasNext()) {
                    System.out.print(" - ");
                }
            }

            System.out.println();

            while (iterator.hasPrevious()) {
                System.out.print(iterator.previous());

                if (iterator.hasPrevious()) {
                    System.out.print(" - ");
                }
            }

            System.out.println("\n --- habis ---");
        }

        public static void removeWithJudul(LinkedList Lagu, String judul) {
            ListIterator<lagu> iterator = Lagu.listIterator();
             while (iterator.hasNext()) {
                 lagu laguu = iterator.next();

                 if(laguu.getJudulLagu(). equals(judul)) {
                     iterator.remove();
                     System.out.println(" -- Berhasil Hapus -- ");
                 }
             }
        }

        public static void menu() {
            System.out.println("Pilih Menu");
            System.out.println("1. Input Lagu");
            System.out.println("2. Hapus Lagu");
            System.out.println("3. Mainkan Lagu");
            System.out.println("4. Keluar");
        }
    }
