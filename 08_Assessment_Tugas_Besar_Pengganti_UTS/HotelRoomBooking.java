import java.util.Date;

public class HotelRoomBooking {

    private String namaPemesan;
    private String nomorKTP;
    private String nomorTelepon;
    private String email;
    private String jenisKelamin;
    private String jenisKamar;
    private int jumlahTamu;
    private int jumlahMalam;
    private double hargaPerMalam;
    private String kodeVoucher;
    private boolean sudahDibayar;
    private Date tanggalCheckin;
    private Date tanggalCheckout;
    private boolean statusAktif;

    private HotelRoomBooking(Builder builder) {
        this.namaPemesan = builder.namaPemesan;
        this.nomorKTP = builder.nomorKTP;
        this.nomorTelepon = builder.nomorTelepon;
        this.email = builder.email;
        this.jenisKelamin = builder.jenisKelamin;
        this.jenisKamar = builder.jenisKamar;
        this.jumlahTamu = builder.jumlahTamu;
        this.jumlahMalam = builder.jumlahMalam;
        this.hargaPerMalam = builder.hargaPerMalam;
        this.kodeVoucher = builder.kodeVoucher;
        this.sudahDibayar = builder.sudahDibayar;
        this.tanggalCheckin = builder.tanggalCheckin;
        this.tanggalCheckout = builder.tanggalCheckout;
        this.statusAktif = builder.statusAktif;
    }

    public static class Builder {
        private String namaPemesan;
        private String nomorKTP;
        private String nomorTelepon;
        private String email;
        private String jenisKelamin;
        private String jenisKamar;
        private int jumlahTamu;
        private int jumlahMalam;
        private double hargaPerMalam;
        private String kodeVoucher;
        private boolean sudahDibayar;
        private Date tanggalCheckin;
        private Date tanggalCheckout;
        private boolean statusAktif;

        public Builder setNamaPemesan(String namaPemesan) {
            this.namaPemesan = namaPemesan;
            return this;
        }

        public Builder setNomorKTP(String nomorKTP) {
            this.nomorKTP = nomorKTP;
            return this;
        }

        public Builder setNomorTelepon(String nomorTelepon) {
            this.nomorTelepon = nomorTelepon;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setJenisKelamin(String jenisKelamin) {
            this.jenisKelamin = jenisKelamin;
            return this;
        }

        public Builder setJenisKamar(String jenisKamar) {
            this.jenisKamar = jenisKamar;
            return this;
        }

        public Builder setJumlahTamu(int jumlahTamu) {
            this.jumlahTamu = jumlahTamu;
            return this;
        }

        public Builder setJumlahMalam(int jumlahMalam) {
            this.jumlahMalam = jumlahMalam;
            return this;
        }

        public Builder setHargaPerMalam(double hargaPerMalam) {
            this.hargaPerMalam = hargaPerMalam;
            return this;
        }

        public Builder setKodeVoucher(String kodeVoucher) {
            this.kodeVoucher = kodeVoucher;
            return this;
        }

        public Builder setSudahDibayar(boolean sudahDibayar) {
            this.sudahDibayar = sudahDibayar;
            return this;
        }

        public Builder setTanggalCheckin(Date tanggalCheckin) {
            this.tanggalCheckin = tanggalCheckin;
            return this;
        }

        public Builder setTanggalCheckout(Date tanggalCheckout) {
            this.tanggalCheckout = tanggalCheckout;
            return this;
        }

        public Builder setStatusAktif(boolean statusAktif) {
            this.statusAktif = statusAktif;
            return this;
        }

        public HotelRoomBooking build() {
            return new HotelRoomBooking(this);
        }
    }

    public void cetakDetailPemesanan() {
        System.out.println("===== DETAIL PEMESANAN KAMAR =====");
        System.out.println("Nama Pemesan : " + namaPemesan);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No. KTP      : " + nomorKTP);
        System.out.println("Telepon      : " + nomorTelepon);
        System.out.println("Email        : " + email);
        System.out.println("Jenis Kamar  : " + jenisKamar);
        System.out.println("Jumlah Tamu  : " + jumlahTamu);
        System.out.println("Jumlah Malam : " + jumlahMalam);
        System.out.println("Harga/Malam  : " + hargaPerMalam);
        System.out.println("Check-in     : " + tanggalCheckin);
        System.out.println("Check-out    : " + tanggalCheckout);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Voucher      : " + kodeVoucher);
        System.out.println("Sudah Dibayar: " + sudahDibayar);
        System.out.println("Total Biaya  : Rp " + hitungTotalBiaya());
        System.out.println("Tipe Tamu    : " + klasifikasiTamu());
        System.out.println("===================================");
    }

    public void redeemVoucher(String kode) {
    }

    public double hitungTotalBiaya() {
        double total = hargaPerMalam * jumlahMalam;
        if (jumlahTamu > 2) {
            total += (jumlahTamu - 2) * 100000;
        }
        if (kodeVoucher != null && kodeVoucher.length() > 3) {
            total -= 50000;
        }
        if (!statusAktif) {
            total = 0;
        }
        return total;
    }

    public String klasifikasiTamu() {
        if (jumlahTamu == 1)
            return "Individu";
        else if (jumlahTamu == 2)
            return "Pasangan";
        else
            return "Keluarga";
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public void setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public int getJumlahMalam() {
        return jumlahMalam;
    }

    public void setJumlahMalam(int jumlahMalam) {
        this.jumlahMalam = jumlahMalam;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        this.hargaPerMalam = hargaPerMalam;
    }

    public boolean isSudahDibayar() {
        return sudahDibayar;
    }

    public void setSudahDibayar(boolean sudahDibayar) {
        this.sudahDibayar = sudahDibayar;
    }
}
