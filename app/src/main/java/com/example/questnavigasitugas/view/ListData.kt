package com.example.questnavigasitugas.view


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListData(
    OnBerandaClick: () -> Unit,
    OnFormulirClick: () -> Unit
) {
    val dataList = listOf(
        listOf(
            "Universitas Gadjah Mada",
            "Unggul",
            "Teknik",
            "Informatika"),
        listOf(
            "Universitas Indonesia",
            "Unggul",
            "Ilmu Komputer",
            "Sistem Informasi"),
        listOf(
            "Universitas Brawijaya",
            "A",
            "Teknik",
            "Teknik Komputer"),
        listOf(
            "Universitas Diponegoro",
            "A",
            "Ekonomi dan Bisnis",
            "Manajemen"),
        listOf(
            "Universitas Airlangga",
            "Unggul",
            "Ekonomi dan Bisnis",
            "Akuntansi"),
    )

    