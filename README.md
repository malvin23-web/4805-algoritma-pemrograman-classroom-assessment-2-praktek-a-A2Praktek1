**Level Easy**

Buatlah Program untuk menampilkan Angka Ganjil dari 0 hingga bilangan n. N ini merupakan bilangan yang diinputkan oleh user. Gunakan modular programming dengan membuat sebuah prosedur yang menerima parameter berupa integer bilangan n.

**Level Medium**

Restoran McDongkol memiliki beberapa menu dengan harga terlampir sebagai berikut:


No Nama Menu Harga
1 Burger kezel 35.000
2 Steak bete 45.000
3 Spaghetti overthinking 20.000
4 French fries sambat 15.000


Dalam program java yang akan anda buat, buatlah array yang menampung harga dari menu yang di atas. Buatlah program java untuk menerima input user untuk memilih menu yang ditampilkan. Setelah menerima input user, masukan harga dari item yang dipilih ke dalam ArrayList keranjang belanja. Program java akan menghitung total belanja dan diskon pembelanjaan dengan ketentuan sebagai berikut:
Total belanja di bawah 50000 tidak mendapat diskon
Total belanja di harga 50000 sampai 100000 mendapat diskon 5%
Total belanja di atas harga 100000 mendapat diskon 10%
Program akan terus menerima input dari user sampai user mengisi karakter N pada input.
Taruh ArrayList keranjang belanja sebagai global variabel, terdapat 2 function untuk menghitung total belanja dan menghitung diskon. Function hitung total belanja tanpa parameter, sedangkan function untuk menghitung diskon menggunakan parameter berupa int total belanja. tersebut tidak menggunakan parameter. Output dari program adalah total jumlah item dipesan dan harga yang harus dibayar sesudah dipotong diskon.
Contoh output

Masukan nama menu [Burger/Steak/Spaghetti/Kentang]:Burger
Input lagi (Y/N)?: Y
Masukan nama menu [Burger/Steak/Spaghetti/Kentang]:Steak
Input lagi (Y/N)?: Y
Masukan nama menu [Burger/Steak/Spaghetti/Kentang]:Kentang
Input lagi (Y/N)?: N
Total item pesanan = 3
Total yang harus dibayar = 90250

