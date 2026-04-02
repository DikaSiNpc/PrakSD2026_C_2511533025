package TugasPekan1_2511533025;

class Mobil_2511533025 {
	private String nama;
    private int tahun;
    private int cc;
    private long harga;
    private String merk;

    // Konstruktor
    public Mobil_2511533025(String nama, int tahun, int cc, long harga, String merk) {
    	this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }
    // Setter (Mutator)
    public void setNama(String nama) { this.nama = nama; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setCc(int cc) { this.cc = cc; }
    public void setHarga(long harga) { this.harga = harga; }
    public void setMerk(String merk) { this.merk = merk; }

    // Getter (Selector)
    public String getNama() { return nama; }
    public int getTahun() { return tahun; }
    public int getCc() { return cc; }
    public long getHarga() { return harga; }
    public String getMerk() { return merk; }

    // Method tambah mobil
    public void tambahMobil() {
    	System.out.println("Mobil berhasil ditambahkan");
    }

    // Method hapus mobil
    public void hapusMobil() {
    	System.out.println("Mobil berhasil dihapus");
    }

    // Tampilkan data
    public void tampil() {
    	System.out.println("Nama  : " + nama);
        System.out.println("Tahun : " + tahun);
        System.out.println("CC    : " + cc);
        System.out.println("Harga : " + harga);
        System.out.println("Merk  : " + merk);
    }
}