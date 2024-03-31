Program ini merupakan implementasi sederhana dari dua kelas, yaitu Student dan Teacher, yang mewakili siswa dan guru dalam sebuah sekolah. Setiap kelas memiliki beberapa atribut dan method yang digunakan untuk mengelola informasi tentang siswa dan guru, seperti nama, alamat, mata kuliah, dan nilai.

Kelas Person: Kelas induk yang memiliki atribut name dan address, serta method untuk mendapatkan nama dan alamat, serta mengatur alamat.

Kelas Student: Kelas turunan dari Person yang menambahkan fitur untuk menyimpan informasi tentang mata kuliah dan nilai siswa.

Atribut courses digunakan untuk menyimpan daftar mata kuliah yang diambil oleh siswa.
Atribut grades digunakan untuk menyimpan nilai yang diperoleh siswa pada setiap mata kuliah.
Method addCourseGrade digunakan untuk menambahkan mata kuliah dan nilai ke dalam daftar.
Method printGrade digunakan untuk mencetak semua mata kuliah dan nilai yang dimiliki siswa.
Method getAverageGrade digunakan untuk menghitung rata-rata nilai siswa.
Kelas Teacher: Kelas turunan dari Person yang menambahkan fitur untuk menyimpan informasi tentang mata kuliah yang diajarkan oleh guru.

Atribut courses digunakan untuk menyimpan daftar mata kuliah yang diajarkan oleh guru.
Method addCourse digunakan untuk menambahkan mata kuliah yang diajarkan oleh guru.
Method removeCourse digunakan untuk menghapus mata kuliah yang diajarkan oleh guru.
Program ini juga dilengkapi dengan Main class yang digunakan untuk menguji kelas-kelas yang telah dibuat. Di dalam Main class, pengguna diminta untuk memasukkan informasi siswa dan guru melalui Scanner, kemudian informasi tersebut digunakan untuk membuat objek siswa dan guru. Objek-objek tersebut kemudian digunakan untuk menguji berbagai fitur yang telah diimplementasikan dalam kelas-kelas Student dan Teacher.

Pada gambar runnung.png dapat dilihat hasil running dari program tersebut
