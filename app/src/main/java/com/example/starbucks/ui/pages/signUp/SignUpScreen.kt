package com.example.starbucks.ui.pages.signUp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.StarbucksTheme
import com.example.starbucks.R

@Composable
fun SignUpScreen(
    onSignUpClick: () -> Unit,
    onSignInClick: () -> Unit,
) {
    val (email, setEmail) = rememberSaveable {
        mutableStateOf("")
    }

    val (password, setPassword) = rememberSaveable {
        mutableStateOf("")
    }

    val (name, setName) = rememberSaveable {
        mutableStateOf("")
    }

    val (address, setAddress) = rememberSaveable {
        mutableStateOf("")
    }

    val (mobileNumber, setMobileNumber) = rememberSaveable {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = 52.dp,
                vertical = 52.dp
            )
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.logo_starbock2),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(80.dp),
                )
            }
            Spacer(modifier = Modifier.size(20.dp))
            Column(
                modifier = Modifier.padding(start = 16.dp)
            ) {
                Text(
                    text = "Selamat Datang ",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "Starbucks",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF008883)
                )
            }
        }
        Spacer(modifier = Modifier.size(24.dp))
        Text(
            text = "Daftar",
            fontSize = 28.sp,
            fontWeight = FontWeight.W500
        )
        Text(
            modifier = Modifier.padding(vertical = 12.dp),
            text = "Nikmati coffemu bersama starbucks!",
            fontSize = 13.sp,
            textAlign = TextAlign.Justify
        )

        // Section Login Details
        SectionTitle(title = "Detail Masuk")
        OutlinedTextField(
            value = email,
            onValueChange = setEmail,
            label = { Text(text = "Email") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        OutlinedTextField(
            value = password,
            onValueChange = setPassword,
            label = { Text(text = "Kata Sandi") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.size(20.dp))

        // Section Personal Details
        SectionTitle(title = "Detail Pengguna")
        OutlinedTextField(
            value = name,
            onValueChange = setName,
            label = { Text(text = "Nama") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        OutlinedTextField(
            value = address,
            onValueChange = setAddress,
            label = { Text(text = "Alamat") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        OutlinedTextField(
            value = mobileNumber,
            onValueChange = setMobileNumber,
            label = { Text(text = "Nomor Telepon") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.size(20.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = onSignUpClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF006D69)
            )
        ) {
            Text(text = "Daftar")
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Sudah memiliki akun?",
                fontSize = 14.sp
            )
            TextButton(onClick = onSignInClick) {
                Text(
                    text = "Masuk",
                    fontSize = 14.sp,
                    color = Color(0xFF006D69)
                )
            }
        }
    }
}

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SignUpScreenPreview() {
    StarbucksTheme {
        SignUpScreen({}, {})
    }
}
