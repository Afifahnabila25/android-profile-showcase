# Profil App - Afifah Nabila Devi

Aplikasi Android sederhana yang menampilkan profil pengguna menggunakan Jetpack Compose.

## Penjelasan Kode

### MainActivity.kt
Aplikasi ini terdiri dari satu activity utama yang menggunakan Jetpack Compose untuk membangun UI. Komponen utama aplikasi meliputi:

**ProfileScreen Composable:**
- Menampilkan foto profil dalam bentuk lingkaran dengan border
- Menampilkan informasi nama, NIM, dan deskripsi mahasiswa
- Dilengkapi dengan tombol Follow/Unfollow yang interaktif
- Menggunakan state management dengan `remember` dan `mutableStateOf`

**Layout dan Styling:**
- Menggunakan `Column` dengan `Alignment.CenterHorizontally` untuk menempatkan semua elemen di tengah layar
- Menerapkan `Spacer` untuk memberikan jarak yang konsisten antar komponen
- Background abu muda (Color(0xFFEFEFEF)) dengan padding 24dp
- Foto profil berukuran 140dp dengan `CircleShape` dan border 2dp

**State Management:**
- Menggunakan `var isFollowing by remember { mutableStateOf(false) }` untuk mengatur status tombol follow
- Tombol secara dinamis mengubah teks antara "Follow" dan "Unfollow"

## Analisis Keuntungan Compose vs XML Layout

### Keuntungan Jetpack Compose:

1. **Declarative UI**
   - Kode lebih mudah dibaca dan dipahami
   - UI dideskripsikan sebagai fungsi dari state
   - Tidak perlu manipulasi view secara manual

2. **Less Boilerplate Code**
   - Tidak perlu `findViewById()` atau ViewBinding
   - Satu file untuk logic dan UI
   - Mengurangi jumlah file yang harus dikelola

3. **Better State Management**
   - State otomatis ter-recompose saat berubah
   - Menggunakan `remember` dan `mutableStateOf` yang lebih intuitif
   - Tidak perlu manual update UI saat data berubah

4. **Type Safety**
   - Compile-time checking untuk properties dan parameters
   - Mengurangi runtime crashes karena error dapat dideteksi lebih awal

5. **Reusable Components**
   - Composable functions dapat digunakan kembali dengan mudah
   - Parameter dapat dikustomisasi untuk berbagai use case
   - Modular dan testable

6. **Modern Development Experience**
   - Live preview langsung di IDE
   - Hot reload untuk development yang lebih cepat
   - Integrasi yang baik dengan Kotlin

Perbandingan dengan XML Layout:
XML Layout:

Membutuhkan dua file terpisah (activity_main.xml + MainActivity.kt)
Update state secara manual menggunakan findViewById dan setText
Preview hanya bisa dilihat dengan menjalankan aplikasi
Error baru ketahuan saat runtime
Code reuse dengan include layout atau custom view yang kompleks
Lebih familiar untuk developer Android lama

Jetpack Compose:

Cukup satu file MainActivity.kt untuk logic dan UI
State otomatis ter-recompose tanpa manipulasi manual
Live preview langsung tersedia di Android Studio
Error terdeteksi saat compile-time
Mudah membuat reusable components dengan Composable functions
Paradigma baru yang butuh adaptasi tapi lebih powerful

### Kesimpulan:
Jetpack Compose memberikan pengalaman development yang lebih modern dan efisien, terutama untuk aplikasi baru. Meskipun memiliki learning curve, benefits jangka panjangnya lebih besar dalam hal maintainability, performance, dan developer experience.
