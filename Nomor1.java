public class Nomor1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double tunjanganSisa = 50000;
        double anggota, hasil; 
        double tunjangan1 = 100000;

        System.out.println("Masukkan jumlah Keluarga : ");
        anggota = sc.nextInt();

        if(anggota <= 3){
            hasil = tunjangan1 * anggota;
            System.out.println("Besar tunjangan kesehatan : " + hasil);
        } else if(anggota > 3){
            anggota -= 3;
            hasil = (tunjanganSisa * anggota) + 300000;
            System.out.println("Jumlah anggota keluraga : " + anggota);
            System.out.println("Besar tunjangan kesehatan : " + hasil);
        }
    }
}
