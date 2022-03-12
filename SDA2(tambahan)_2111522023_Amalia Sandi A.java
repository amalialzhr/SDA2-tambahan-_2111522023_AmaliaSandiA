import java.util.LinkedList;

public class jawaban {
    public static void main(String[] args) {

        //create linkedlist 
        LinkedList <String> nama = new LinkedList<>();
        LinkedList <String> nim = new LinkedList<>();
        LinkedList <String> alamat = new LinkedList<>();

        nama.add("amalia");
        nama.add("bayu");
        nama.add("david");

        nim.add("211151");
        nim.add("211152");
        nim.add("211153");

        alamat.add("afghanistan");
        alamat.add("indonesia");
        alamat.add("china");
        
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("BERIKUT ADALAH DATA MAHASISWA SEMENTARA (VERSI1)");
        System.out.println("************************************************");
        System.out.println("nama   : " + nama);
        System.out.println("nim    : " + nim);
        System.out.println("alamat : " + alamat);
        System.out.println(" ");

        //fungsi add 
        nama.addFirst("ahmad");
        nim.addFirst("211150");
        alamat.addFirst("austria");

        nama.addLast("samudra");
        nim.addLast("211154");
        alamat.addLast("indonesia");

        System.out.println("**********************************");
        System.out.println("DATA MAHASISWA SETELAH UPDATE 1");
        System.out.println("**********************************");
        System.out.println("nama   : " + nama);
        System.out.println("nim    : " + nim);
        System.out.println("alamat : " + alamat);
        System.out.println(" ");

        //fungsi set 
        nama.set(2, "farras");
        nim.set(2, "211155");
        alamat.set(2, "thailand");

        System.out.println("**********************************");
        System.out.println("DATA MAHASISWA  SETELAH UPDATE 2");
        System.out.println("**********************************");
        System.out.println("nama   : " + nama);
        System.out.println("nim    : " + nim);
        System.out.println("alamat : " + alamat);
        System.out.println(" ");
 
        //fungsi remove 
        nama.removeLast();
        nama.remove(1);
        
        nim.removeLast();
        nim.remove(1);

        alamat.removeLast();
        alamat.remove(1);

        System.out.println("**********************************");
        System.out.println("DATA MAHASISWA  SETELAH UPDATE 3");
        System.out.println("**********************************");
        System.out.println("nama   : " + nama);
        System.out.println("nim    : " + nim);
        System.out.println("alamat : " + alamat);
        System.out.println(" ");
        
        //push
        nama.push("rossalin");
        nim.push("211156");
        alamat.push("belgia");

        nama.push("angel");
        nim.push("211157");
        alamat.push("indonesia");

        System.out.println("**********************************");
        System.out.println("DATA MAHASISWA  SETELAH UPDATE 4");
        System.out.println("**********************************");
        System.out.println("nama   : " + nama);
        System.out.println("nim    : " + nim);
        System.out.println("alamat : " + alamat);
        System.out.println(" ");

        //pop
        nama.pop();
        nim.pop();
        alamat.pop();

        System.out.println("**********************************");
        System.out.println("DATA MAHASISWA TER-UPDATE");
        System.out.println("**********************************");
        System.out.println("nama   : " + nama);
        System.out.println("nim    : " + nim);
        System.out.println("alamat : " + alamat);
        System.out.println(" ");

        //get 
        System.out.println("Mahasiswa yang terdapat pada data terawal, adalah:  ");
        System.out.println(nama.getFirst());
        System.out.println(nim.getFirst());
        System.out.println(alamat.getFirst());

        //size
        System.out.println(" ");
        System.out.println("Jumlah mahasiswa yang ada pada data: " + nama.size());
    }
}

