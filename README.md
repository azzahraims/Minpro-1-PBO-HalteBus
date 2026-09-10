# Sistem Manajemen Halte Bus ˚ ༘ 🚍⋆｡˚

## Deskripsi Singkat Program

Sistem Manajemen Halte Bus adalah program berbasis Java yang digunakan untuk mengelola data halte bus melalui console. Program menerapkan operasi CRUD (*Create, Read, Update, Delete*) sehingga pengguna dapat menambahkan, melihat, mengubah, dan menghapus data halte.

Data halte yang dikelola meliputi:
- ID Halte
- Nama Halte
- Lokasi Halte
- Kapasitas Halte
- Rute Bus

Data disimpan menggunakan `ArrayList` selama program dijalankan.

Program terdiri dari empat class:
- `Halte.java` sebagai class model data halte.
- `HalteCRUD.java` untuk mengelola proses CRUD.
- `InputValidator.java` untuk melakukan validasi input.
- `Main.java` sebagai entry point dan pengatur menu program.

### Tampilan Menu Utama

   <img width="203" height="131" alt="Screenshot 2026-09-10 013235" src="https://github.com/user-attachments/assets/ec5abcb0-a5a6-4d20-9817-13f8b51346e3" />


## Penjelasan Alur Program

Program dimulai dengan menampilkan lima pilihan menu:

1. **Tambah Halte (Create)**  
   Pengguna memasukkan ID halte, nama halte, lokasi, kapasitas, dan rute bus. Program akan memeriksa agar ID tidak sama dengan data yang sudah tersimpan, kemudian data ditambahkan ke dalam `ArrayList`.

   <img width="189" height="131" alt="Screenshot 2026-09-10 013613" src="https://github.com/user-attachments/assets/46e8db89-ccee-4eac-86b5-24d8ca891d56" />


2. **Lihat Data Halte (Read)**  
   Program menampilkan seluruh data halte yang tersimpan menggunakan perulangan. Jika belum ada data, program menampilkan pesan bahwa data halte masih kosong.

   <img width="188" height="128" alt="Screenshot 2026-09-10 013710" src="https://github.com/user-attachments/assets/de893d4c-59a4-4eb9-90aa-25121d5bd558" />

3. **Ubah Data Halte (Update)**  
   Pengguna memasukkan ID halte yang ingin diubah. Jika ID ditemukan, pengguna dapat memasukkan nama halte, lokasi, kapasitas, dan rute bus yang baru.

   <img width="258" height="216" alt="Screenshot 2026-09-10 013828" src="https://github.com/user-attachments/assets/1c3afa39-933c-4f1a-bd67-78b1a5ace338" />

4. **Hapus Halte (Delete)**  
   Pengguna memasukkan ID halte yang ingin dihapus. Jika data ditemukan, halte tersebut akan dihapus dari `ArrayList`.

   <img width="194" height="74" alt="Screenshot 2026-09-10 013910" src="https://github.com/user-attachments/assets/b2082c72-7b39-43f3-8e3f-f4b7f652ff58" />


5. **Keluar**  
   Program akan terus menampilkan menu menggunakan perulangan `do-while` sampai pengguna memilih menu Keluar.


## Penerapan Nilai Tambah

### 1. Access Modifier

Penerapan access modifier terdapat pada `Halte.java`. Seluruh atribut pada class `Halte` menggunakan access modifier `private` sehingga atribut tidak dapat diakses secara langsung dari luar class.

<img width="196" height="76" alt="Screenshot 2026-09-10 014311" src="https://github.com/user-attachments/assets/97a7c939-e637-4617-8320-8f50ee6d7817" />

### 2. Encapsulation

Penerapan encapsulation terdapat pada `Halte.java`. Atribut yang bersifat `private` diakses menggunakan method getter dan diubah menggunakan method setter.

Contoh getter dan setter:

<img width="293" height="92" alt="Screenshot 2026-09-10 015518" src="https://github.com/user-attachments/assets/f7c9d74d-024c-474d-bbf1-9f6662e13e1f" />

### 3. Validasi Input

Penerapan validasi input terdapat pada `InputValidator.java` dan `Main.java`.

#### a. Input Teks Tidak Boleh Kosong

**Letak:** `InputValidator.java`, pada method `inputTidakKosong()`.

<img width="335" height="55" alt="Screenshot 2026-09-10 020232" src="https://github.com/user-attachments/assets/9253e0fa-a54e-411c-8263-2a490b7788f3" />

Validasi ini digunakan pada input ID halte, nama halte, lokasi halte, dan rute bus.

#### b. Kapasitas Halte Harus Lebih dari 0

**Letak:** `InputValidator.java`, pada method `inputAngkaPositif()`.

<img width="323" height="47" alt="Screenshot 2026-09-10 015625" src="https://github.com/user-attachments/assets/c1a22d30-e04a-42cc-805c-59e6032b4eef" />

Jika pengguna memasukkan kapasitas `0` atau angka negatif, program akan meminta input kapasitas kembali.

#### c. Pilihan Menu Hanya 1–5

**Letak:** `InputValidator.java`, pada method `inputMenu()`.

<img width="398" height="50" alt="Screenshot 2026-09-10 020415" src="https://github.com/user-attachments/assets/5de315f3-f8a9-49e8-90d1-fa28ba488876" />

Jika pengguna memasukkan angka di luar menu `1–5`, program akan meminta pilihan menu kembali.

#### d. ID Halte Tidak Boleh Sama

**Letak:** `Main.java`, pada `case 1` atau menu Tambah Halte.

<img width="277" height="89" alt="Screenshot 2026-09-10 015855" src="https://github.com/user-attachments/assets/d888afb7-5159-4314-8b21-46ec05263b12" />

Validasi ini digunakan untuk mencegah dua data halte memiliki ID yang sama.
