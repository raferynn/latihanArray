package arrayMultiDimensi;

public class LatihanArrayMultiDimensi2 {

        int nis[][] = {{210651},{210652},{210653}};
        String nama[][] = {{"Ade"},{"Galih"},{"Baihaqi"}};

        public void tampil() {
            System.out.println("Identitas Siswa");
        }

        public void namanis (){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(nama[i][j] +":"+nis[i][j]);
                }
            }
        }

    public static void main(String[] args) {
        LatihanArrayMultiDimensi2 siswa = new LatihanArrayMultiDimensi2();
        siswa.tampil();
        siswa.namanis();
    }
}
