class Produk(var nama: String, var harga: Double, var stok: Int) {

    // Fungsi untuk menampilkan informasi detail produk
    fun tampilkanDetailProduk() {
        println("Nama Produk: $nama")
        println("Harga: Rp$harga")
        println("Stok: $stok")
    }

    // Fungsi untuk membeli produk dan mengurangi stok
    fun beliProduk(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            println("$jumlah $nama berhasil dibeli!")
        } else {
            println("Stok $nama tidak mencukupi. Stok tersedia hanya $stok.")
        }
    }
}

fun main() {
    // Membuat objek produk
    val produk = Produk("Kopi", 25000.0, 10)

    // Menampilkan informasi produk
    produk.tampilkanDetailProduk()

    // Melakukan pembelian
    produk.beliProduk(3)
    
    // Menampilkan informasi produk setelah pembelian
    println("\nSetelah pembelian:")
    produk.tampilkanDetailProduk()
}
