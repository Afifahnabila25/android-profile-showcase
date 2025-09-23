package com.example.profilapp_235150207111041afifahnabiladevi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profilapp_235150207111041afifahnabiladevi.ui.theme.ProfilApp_235150207111041AfifahNabilaDeviTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilApp_235150207111041AfifahNabilaDeviTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileScreen(
                        name = "Afifah Nabila Devi",
                        nim = "235150207111041",
                        description = "Mahasiswa Teknik Informatika"
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(name: String, nim: String, description: String) {
    // State tombol follow/unfollow
    var isFollowing by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEFEFEF)) // warna latarnya
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center // biar ke tengah layar
    ) {
        // Foto profil
        Image(
            painter = painterResource(id = R.drawable.profile_dummy), // profile_dummy itu nama gambar yang dimasukkan ke drawable
            contentDescription = "Foto profil",
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colorScheme.onSurface, CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        // Nama
        Text(
            text = name,
            style = MaterialTheme.typography.titleLarge,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(4.dp))

        // NIM
        Text(
            text = nim,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Magenta
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Deskripsi
        Text(
            text = description,
            style = MaterialTheme.typography.bodySmall,
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Tombol Follow / Unfollow
        Button(onClick = { isFollowing = !isFollowing }) {
            Text(text = if (isFollowing) "Unfollow" else "Follow")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewProfile() {
    ProfilApp_235150207111041AfifahNabilaDeviTheme {
        ProfileScreen(
            name = "Afifah Nabila Devi",
            nim = "235150207111041",
            description = "Mahasiswa Teknik Informatika"
        )
    }
}