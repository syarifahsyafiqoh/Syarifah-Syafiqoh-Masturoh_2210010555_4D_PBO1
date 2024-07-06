# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Handphone`, `SpecsHandphone`, dan `HandphoneMain` adalah contoh dari class.

```bash
public class Handphone {
    ...
}

public class SpecsHandphone extends Handphone {
    ...
}

public class HandphoneMain {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Hp1[i] = new SpecsHandphone(merk, seri, harga);` adalah contoh pembuatan object.

```bash
Hp1[i] = new SpecsHandphone(merk, seri, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk`, `seri` dan `harga` adalah contoh atribut.

```bash
String merk;
String seri;
int harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Handphone` dan `SpecsHandphone`.

```bash
public Handphone(String merk, String seri, int harga) {
    this.merk = merk;
    this.seri = seri;
    this.harga = harga;
}

public SpecsHandphone(String merk, String seri, int harga) {
    super(merk, seri, harga);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk`, `setSeri` dan `setHarga` adalah contoh method mutator.

```bash
public void setMerk(String merk) {
    this.merk = merk;
}

public void setSeri(String seri) {
    this.seri = seri;
}

public void setHarga(int harga) {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getSeri`, `getHarga`, `getRam`, `getTipe`, dan `getTahunBuat` adalah contoh method accessor.

```bash
public String getMerk() {
    return merk;
}

public String getSeri() {
    return seri;
}

public int getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk`, `seri` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
protected String merk;
protected String seri;
protected int harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SpecsHandphone` mewarisi `Handphone` dengan sintaks `extends`.

```bash
public class SpecsHandphone extends Handphone {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampil(String)` di `Handphone` merupakan overloading method `tampil` dan `tampil` di `SpecsHandphone` merupakan override dari method `tampil` di `Handphone`.

```bash
public String tampil(String Perusahaan){
    return tampil() + "\nPerusahaan: "+Perusahaan;
}

@Override
public String tampil() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getTipe` dan seleksi `switch` dalam method `getRam`.

```bash
public String getTipe(){
    String tipe = getSeri().substring(2, 7);
    //seleksi if
    if(tipe.equals("S23FE")){
        return "Seri S";
    } else {
        return "Seri Lain";
    }
}

public String getRam(){
    String ram = getSeri().substring(0, 2);
    //seleksi switch
    switch(ram){
        case "A1":
            return "4 GB";
        case "B1":
            return "8 GB";
        case "C1":
            return "12 GB";
        default:
            return"Lainnya";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < Hp1.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Input Merk Handphone "+(i+1)+": ");
String merk = scanner.nextLine();
System.out.print("Masukkan seri Hp "+(i+1)+": ");
String seri = scanner.nextLine();
System.out.print("Input Harga "+(i+1)+": ");
int harga = scanner.nextInt();
scanner.nextLine();

System.out.println("Rincian Spesifikasi Handphone: ");
System.out.println(data.tampil());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `SpecsHandphone[] Hp1 = new SpecsHandphone[2];` adalah contoh penggunaan array.

```bash
SpecsHandphone[] Hp1 = new SpecsHandphone[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
} catch (NumberFormatException e){
    System.out.println("Kesalahan format nomor: "+e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan Umum: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Syarifah Syafiqoh Masturoh
NPM: 2210010555
