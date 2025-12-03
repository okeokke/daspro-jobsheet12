  # [Tugas](#tugas)  
  # [Daftar_Percobaan](#daftar_percobaan)  

# TUGAS
  
### TUGAS 1    
Soal :  
Buatlah  sebuah  class  KubusNoAbsen  yang  di dalamnya  terdapat  fungsi  untuk menghitung volume kubus dan luar permukaan kubus!  
[Kubus08.java](/Kubus08.java)  
Contoh output:  
![Tugas 1](T1Job12.png)  

---  

### TUGAS 2  
Soal :  
Di  suatu  kelas,  terdapat  N  mahasiswa  yang  mengikuti  satu  mata  kuliah.  Nilai  tiap 
mahasiswa untuk mata kuliah tersebut akan diinputkan oleh pengguna dan 
disimpan dalam sebuah array 1 dimensi berukuran N. Buatlah sebuah class 
NilaiMahasiswaNoAbsen yang di dalamnya terdapat beberapa fungsi berikut:  
1. Fungsi isianArray untuk:   
- Mengisi elemen-elemen array dengan nilai yang diinputkan oleh user 
(jumlah elemen = N, dibaca dari input)   
2. Fungsi tampilArray untuk:  
- Menerima parameter berupa array nilai mahasiswa 
- Menampilkan seluruh nilai yang telah diinputkan  
3. Fungsi hitTot untuk:  
- Menerima parameter berupa array nilai mahasiswa 
- Menghitung dan mengembalikan total nilai seluruh mahasiswa (return tipe int atau double)  
4. Fungsi main untuk:  
- Membaca nilai N (jumlah mahasiswa) dari input pengguna 
- Membuat array dengan ukuran N 
- Memanggil fungsi isianArray, tampilArray, dan hitTot 
- Menampilkan total nilai yang dikembalikan oleh fungsi hitTot

[NilaiMahasiswa08.java](/NilaiMahasiswa08.java)  

Contoh output:  
![Tugas 2](T2Job12.png)

### TUGAS 3  
Soal :  
Ibu  Mariana  mengelola  sebuah  kafe.  Berikut  adalah rekap  penjualan  5  menu  dari 
hari pertama hingga ketujuh: 
![Tabel untuk Soal 3](T3_Soal.png)
1. Buatlah sebuah class RekapPenjualanCafeNoAbsen yang digunakan untuk 
menyimpan dan mengolah data penjualan 5 menu kafe dari hari pertama hingga 
hari  ketujuh.  Di  dalam  class  tersebut,  buat  dan  gunakan  beberapa fungsi 
(method) berikut: 
- Fungsi  untuk  menginputkan  data  penjualan  setiap  menu  untuk  setiap  hari 
(petunjuk: menggunakan array 2 dimensi). 
- Fungsi untuk menampilkan seluruh data penjualan dari hari pertama hingga 
hari terakhir dalam bentuk tabel 
- Fungsi  untuk  menampilkan  menu  yang  memiliki  total  penjualan  tertinggi 
selama tujuh hari (tampilkan nama menu dan total penjualannya). 
- Fungsi  untuk  menampilkan  rata-rata  penjualan  untuk  setiap  menu  selama 
tujuh hari (tampilkan nama menu dan nilai rata-ratanya). 
Gunakan fungsi main untuk: 
- Memanggil fungsi input data penjualan, 
- Menampilkan seluruh data penjualan, 
- Menampilkan menu dengan penjualan tertinggi, dan 
- Menampilkan rata-rata penjualan untuk setiap menu. 
 
2. Modifikasi program pada 3 (a/1) sehingga jumlah hari penjualan dan jumlah menu 
dibaca dari input pengguna, lalu sesuaikan ukuran array dan proses perhitungan 
agar tetap berjalan dengan benar. 

[]()

Contoh output:
  
---  
  
---  

# Daftar_Percobaan
1. [Percobaan 1](#percobaan-1)
- [Pertanyaan](#pertanyaan)
    * [Jawaban](#jawaban)
2. [Percobaan 2](#percobaan-2)
- [Pertanyaan](#pertanyaan-1)
    * [Jawaban](#jawaban-1)
3. [Percobaan 3](#percobaan-3)
- [Pertanyaan](#pertanyaan-2)
    * [Jawaban](#jawaban-2)
4. [Percobaan 4](#percobaan-4)
- [Pertanyaan](#pertanyaan-3)
    * [Jawaban](#jawaban-3)
5. [Percobaan 5](#percobaan-5)
- [Pertanyaan](#pertanyaan-4)
    * [Jawaban](#jawaban-4)

---

## Percobaan 1
[Kondisi awal Kafe08.java (Commit 713c7e8)](https://github.com/okeokke/daspro-jobsheet12/commit/713c7e8e85099268dc0c7f8f820146abe8a655f5)  
Screenshot Inisial :  
![<daspro-jobsheet12/P1N0.png>](P1N0.png)  
  
  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Pertanyaan
1. Apakah fungsi tanpa parameter selalu harus bertipe void? 
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()?  Modifikasi  kode  program  tersebut  untuk  dapat  menampilkan  daftar  menu tanpa menggunakan fungsi! 
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main. 
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).  
  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Jawaban
1. Tidak, bisa bertipe data lain, void berarti fungsi dijalankan tetapi tidak ada nilai yang dikembalikan setelah di-call, sedangkan jika ada yang perlu di-return, maka harus dalam sebuah tipe data dan variabel dengan sintaks return di dalam kode fungsi.
2. [Kafe08.java (Commit 371e599)](https://github.com/okeokke/daspro-jobsheet12/commit/371e59938e8e26a411a88493ceed5e155a853a07)  
![Percobaan1Nomor2](P1N2.png)
3. Ibarat mengelompokkan sebagian kode tertentu menjadi sebuah modul bongkar-pasang/lego yang bisa digunakan atau tidak kapan saja tergantung kebutuhan (bersifat lebih modular), membuat kode utama bisa lebih rapih dan lebih mudah dibaca.
4. Program mulai dari fungsi main -> main menjalankan call ke fungsi menu -> program menjalankan isi kode fungsi menu dan mengeluarkan output berdasarkan isi kode fungsi sampai selesai (return void) -> setelah selesai menjalankan fungsi, program kembali ke fungsi main -> program berlanjut sampai selesai.
  

  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

---

## Percobaan 2
[Kafe08.java (Commit e22fb71)](https://github.com/okeokke/daspro-jobsheet12/commit/e22fb7146a8225b1d5eda3d3f66fd40550da761a)  
Screenshot Inisial:  
![Percobaan2 Initial](P2N0.png)  
  
  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Pertanyaan
1. Apakah kegunaan parameter di dalam fungsi?  
2. Jelaskan mengapa pada percobaan ini fungsi **`Menu()`** menggunakan parameter `namaPelanggan` dan `isMember`? 
3. Apakah parameter sama dengan variabel? Jelaskan. 
4. Jelaskan bagaimana cara kerja parameter `isMember` pada fungsi **`Menu()`**. Apa 
perbedaan output ketika isMember bernilai true dan ketika false? 
5. Apa  yang  akan  terjadi  jika  memanggil  fungsi  Menu()  tanpa  menyertakan  parameter `namaPelanggan` dan `isMember`? 
6. Modifikasi kode di atas dengan menambahkan parameter baru **kodePromo (String)**. Jika kodePromo adalah "DISKON50",  tampilkan berikan diskon 50%. Jika kodePromo adalah  "DISKON30",  tampilkan  berikan  diskon  30%.  Jika tidak  ada  kode  promo  yang berlaku, tampilkan kode invalid. 
7. Berdasarkan  fungsi  Menu()  di  atas,  jika  nama  pelanggan  adalah  "Budi",  pelanggan tersebut  member,  dan  menggunakan  kode  promo  "DISKON30",  tuliskan  satu  baris perintah pemanggilan fungsi menu yang benar. 
8. Menurut  Anda, apakah penggunaan parameter `namaPelanggan` dan `isMember` pada fungsi Menu() membuat  program lebih mudah  dibaca  dan  dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda. 
  
  
  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Jawaban
1. Untuk memberi nilai pada variabel yang dibutuhkan dalam suatu fungsi.
2. Karena isi kode pada fungsi membutuhkan/menggunakan 2 variabel tersebut (terletak pada bagian `System.out.println("Selamat datang, "+ namaPelanggan + "!")` dan `if (isMember) {...}`), yang juga bisa membuat kode fungsi lebih fleksibel karena value tidak diatur dalam kode fungsi, tetapi diluarnya, yang lalu 'diumpan' ke dalam eksekusi fungsi tersebut
3. Hampir sama, parameter kurang lebih berfungsi sebagai penampung nilai sebuah variabel yang digunakan di dalam fungsi tersebut. 
4. `isMember` ber-tipe data boolean, nilainya bisa `true` atau `false`, jika `true` outputnya `Anda adalah member ...`, jika `false` bagian itu dilewati (tidak ada kode lain yang dieksekusi jika false, jadi melanjutkan sisa kodenya.)
5. Program tidak bisa dicompile/dijalankan, karena secara efektif seperti menggunakan variabel, tanpa melakukan deklarasi dan inisisasi, programnya bingung disuruh menggunakan variabel yang nggak ada nilainya dan 'nggak pernah diadakan.'
6. [Kafe08.java (Commit 2e999a6)](https://github.com/okeokke/daspro-jobsheet12/commit/2e999a62e4e0dc1fd77261617a4ae2a9b58ffb3f)
7.
 ```java
...
Menu("Budi", true, "DISKON30");
...
```
![P2N7.png](P2N7.png)
  
8. Ya, kalau pake fungsi, bagian yang menghitung (fungsi) dipisahkan dari nilai/data yang dipakai di algoritma fungsi, kalau dua hal itu jadi satu, algoritma jadinya kaku dan jaddi lebih susah jika ingin digunakan lagi di keadaan lain. lalu kalau ingin ada fitur tambahan, tidak banyak dari algoritma yang di dalam fungsi yang perlu dimodifikasi, dan hanya tinggal menambah parameter juga.
  
  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

---

## Percobaan 3  
[Kafe08.java (Commit b7388f2)](https://github.com/okeokke/daspro-jobsheet12/commit/b7388f21e4c7478f209eb09a5ffd7c45a7ac2f2d)  
Screenshot Inisial :  
  ![Percobaan3 Initial](P3N0.png)
  
  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Pertanyaan
1. Jelaskan  secara  singkat  kapan  suatu  fungsi  membutuhkan  nilai  kembalian  (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus. 
2. Fungsi  hitungTotalHargaNoAbsen  saat  ini  mengembalikan  total  harga  berdasarkan pilihanMenu  dan  jumlahPesanan.  Sebutkan  tipe  data  nilai  kembalian  dan  dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe. 
3. Modifikasi  kode  di  atas sehingga  fungsi  hitungTotalHargaNoAbsen  dapat  menerima kodePromo.  Jika  kodePromo  adalah  "DISKON50",  maka  mendapat  diskon  50%  dari totalHarga  dan  tampilkan  diskon.  Jika  kodePromo  adalah  "DISKON30",  maka mendapat  diskon  30%  dari  totalHarga  dan  tampilkan  diskon.  Jika  tidak  ada  kode promo  yang  berlaku,  tampilkan  kode  invalid  dan  tidak  ada  pengurangan  total  harga totalHarga. 
4. Modifikasi  kode  di  atas  sehingga  bisa  memilih  beberapa  jenis  menu  berbeda  serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna  dapat:  memesan  lebih  dari  satu  jenis  menu  (misalnya  menu  1  dan  3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?
  

  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Jawaban
1. Fungsi perlu return value kalau ada hasil yang dikeluarkan yang akan digunakan di luar fungsi. Fungsi tidak perlu return kalau cuma menampilkan/mengeksekusi sesuatu (void).
2. Tipe return: int. Parameter: int pilihanMenu, int banyakItem.  
Artinya :  
pilihanMenu = variabel yang menerima nilai nomor menu yang dipilih user, digunakan sebagai indeks harga.  
banyakItem = variabel yang menerima nilai jumlah porsi yang dipesan user, langsung mempengaruhi perhitungan harga.
3. [Kafe08.java (Commit 44db6bd)](https://github.com/okeokke/daspro-jobsheet12/commit/44db6bd423db5b0a2ec9a105cc2193b247881550)  
![No3](P3N3.png)
4. [Kafe08.java](/Kafe08.java)  
![No4](P3N4.png)

  
  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

---

## Percobaan 4
[PengunjungCafe08.java (Commit 74bc676)](https://github.com/okeokke/daspro-jobsheet12/commit/74bc67684434e9ec21efc00d7ea0ad8c456d7ac7)  
Screenshot:  
![Percobaan4](P4N0.png)
  
  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Pertanyaan
1. Jelaskan  mengapa  penulisan  parameter  di  praktikum  4  ditulis  dengan  String... namaPengunjung! 
2. Modifikasi method daftarPengunjung menggunakan for-each loop. 
3. Bisakah  menggunakan  dua  tipe  data  varaargs  dalam  satu  fungsi?  Jelaskan  jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya! 
4. Jelaskan  apa  yang  terjadi  jika  fungsi  daftarPengunjung  dipanggil  tanpa  argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan? 
  

  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Jawaban
1. di Percobaan 4 menggunakan varargs yang di lihat dari kata-nya dari bahasa inggris itu kurang lebih 'variable arguments' jadi untuk satu pasang tipedata-variabel yang digunakan untuk parameter, bisa memuat lebih dari satu nilai yang dijadikan/diibaratkan menjadi array di dalam fungsi. berguna untuk satu tipedata/variabel yang perlu/bisa memuat beberapa butir nilai.  
Contoh yang sama jika tidak pakai varargs akan lebih rumit menjadi seperti ini  
```java
daftarPengunjung(String a);
daftarPengunjung(String a, String b);
daftarPengunjung(String a, String b, String c);
``` 
2. [PengunjungCafe08.java](/PengunjungCafe08.java)
3. tidak bisa ada dua varargs dalam satu fungsi, dan varargs tidak boleh berada di tengah parameter, harus di bagian paling akhir.
```java
static void fungsi(int a, int b, int... c)
```
selain contoh ini, seperti menempatkan varargs di bagian awal kurung tidak valid (error) dan tidak akan bisa dicompile/dijalankan  
4. Program masih bisa jalan, Karena namaPengunjung.length == 0, Outputnya :  
```
Daftar nama pengunjung: 
```
loop tidak masuk/tereksekusi dan hanya perintah output yang berhasil tampil.
  
  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

---

## Percobaan 5  
(Sebelum Menggunakan Fungsi)
[HitungBalok08.java (Commit 385724a)](https://github.com/okeokke/daspro-jobsheet12/commit/385724ac24140c2be9dff9c349d167718b652868)  
Screenshot:  
![Percobaan5_1](P5N0_1.png)  

(Setelah Menggunakan Fungsi)
[HitungBalok08.java](/HitungBalok08.java)  
Screenshot:  
![Percobaan5_2](P5N0_2.png)  

  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Pertanyaan
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok! 
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan  panjang  =  4,  lebar  =  3,  dan  tinggi  =  5.  Jelaskan  secara  singkat  alur jalannya program sampai output tersebut muncul. 
3. Apakah  output  dari  program  di  bawah  ini  kemudian jelaskan  alur  jalannya  program tersebut!
```java
public class programku {
  public static void TampilHinggaKei(int i) {
    for (int j = 1; j <= i; j++) {
      System.out.print(j);
    }
  }
  public static int Jumlah (int bil1, int bil2) {
    return (bil1 + bil2);
  }
  public static void TampilJumlah (int bil1, int bil2) {
    TampilHinggaKei (Jumlah (bil1, bil2));
  }
  public static void main (String[] args) {
    int temp = Jumlah (1, 1);
    TampilJumlah (temp, 5);
  }
}
```
4. Pada  saat  apakah  fungsi  yang  kita  buat  harus  menggunakan  parameter  atau  tidak? Pada  saat  apakah  fungsi  yang  kita  buat  harus  memiliki  nilai  kembalian  atau  tidak? Jelaskan! 
5. Jelaskan  kapan  sebuah  fungsi  sebaiknya  menggunakan  parameter  dan  kapan  fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5. 
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.
  

  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Jawaban
1. 
- Program start → main() dieksekusi.
- Program meminta minta input panjang, lebar, dan tinggi. input user lalu disimpan/diassign nilainya ke variabel p, l, dan t.  
- Program memanggil hitungLuas(p,l), menaruh nilai dari p, dan l ke parameter variabel yang diperlukan fungsi hitungLuas, lalu return hasilnya `p*l`, dimana hasilnya masuk ke variabel L. lalu mencetak `Luas persegi panjang adalah L(hasil return fungsi hitungLuase)`.  
- Program memanggil hitungVolume(t,p,l), di dalamnya memanggil lagi fungsi hitungLuas(a,b) yang mereturn Luas yang lalu dikalikan dengan `tinggi` dan diassign ke variabel lokal volume sebelum direturn oleh fungsi. lalu mencetak `Volume balok adalah vol(hasil return fungsi hitungVolume)`.  
- Program selesai.  
2.   
![No.2](P5N2.png)  
- User menginput/assign value 4, 3, 5 pada var p, l, t.  
- fungsi `hitungLuas(p, l)` dipanggil, nilai variabel `p, l` di-umpan ke dalam fungsi sebagai `pjg, lb`
- fungsi melakukan operasi perkalian pada kedua var tersebut untuk diassign nilainya pada var.lokal `Luas` dan me-return nilai var.lokal `Luas` yang lalu di-assign pada var 'L'(main) lalu dicetak.  
- fungsi `hitungVolume(t, p, l)` dipanggil, nilai var `t, p, l` di-umpan ke dalam fungsi sebagai `tinggi, a, b`
- fungsi hitungVolume memanggil fungsi hitungLuas dan mengumpan value var.lokal `a, b` ke fungsi hitungLuas, dan hasil return-nya dilakukan operasi kali dengan var.lokal `tinggi`, nilainya lalu di-assign ke var.lokal `volume` yang lalu di-return hasilnya ke fungsi main yang diassign pada var `vol` yang lalu dicetak.  
3.   
- Program mulai dari fungsi main
- fungsi `Jumlah` dipanggil dengan memberi value `(1, 1)` pada parameternya yang diumpan ke dalam fungsi dalam bentuk variabel `bil1, bil2`
- fungsi `Jumlah` melakukan return dari hasil operasi `bil1+bil2`
- hasil return fungsi `Jumlah` diassign pada var.lok `temp`(main)
- fungsi `TampilJumlah(temp,5)` dipanggil. Di dalamnya, program hitung `Jumlah(temp,5)` -> `Jumlah(2,5)` -> hasil 7.
- setelah dapat angka 7, program memanggil `TampilHinggaKei(7)`.
Fungsi melakukan loop dari 1 sampai 7 dan mencetak setiap angkanya tanpa spasi.  
Alurnya kurang lebih : hitung 1+1 -> hitung 2+5 -> print angka 1-7.
```output
1234567
```  
4. Parameter dipakai ketika fungsi butuh data dari luar fungsi, bukan data yang ada di dalamnya.
Parameter tidak perlu digunakan jika fungsi bisa bekerja tanpa butuh input luar.
Return digunakan saat fungsi harus mengembalikan hasil yang akan dipakai lagi.
Return tidak perlu digunakan jika kegunaan fungsi hanya menjalankan aksi (misal print saja, atau menggunakan var.global).  
5. `hitungLuas` dan `hitungVolume` pakai parameter karena nilai panjang/lebar/tinggi tidak diketahui di dalam fungsi, memerlukan nilai yang di-input di luar fungsi. jika semua data sudah memiliki value di dalam fungsi (atau misal fungsi hanya cetak pesan tetap), parameter tidak diperlukan.
6. `hitungLuas` dan `hitungVolume` punya return karena hasilnya masih dipakai (ditampung ke variabel, dicetak). `main` tidak perlu return karena `main` hanya mengatur alur program, bukan menghitung nilai untuk dipakai lagi. Kalau fungsi hanya menjalankan instruksi tanpa perlu mengembalikan sesuatu (misal hanya print), maka tidak butuh return.
  
  
  [Kembali ke #Daftar_Percobaan](#daftar_percobaan)