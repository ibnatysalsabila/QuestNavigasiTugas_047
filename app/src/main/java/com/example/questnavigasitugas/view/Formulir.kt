package com.example.questnavigasitugas.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Formulir(
    OnSubmitBtnClick: () -> Unit,
    OnBackBtnClick: () -> Unit = {}
) {
    var namaLengkap by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var programStudi by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    val jenisKelaminList = listOf("Laki-laki", "Perempuan")
    val prodiList = listOf("Informatika", "Sistem Informasi", "Teknik Komputer", "Manajemen", "Akuntansi")

    var expanded by remember { mutableStateOf(false) }
    var showDialog by remember { mutableStateOf(false) }
    var showWarning by remember { mutableStateOf(false) }

