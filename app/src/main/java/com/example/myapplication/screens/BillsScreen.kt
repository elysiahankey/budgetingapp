package com.example.myapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.navigation.BottomNavBar

@Composable
fun BillsScreen(
    navController: NavHostController
) {
    Scaffold(
        bottomBar = {
            BottomNavBar(navController)
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = "Bills",
                style = MaterialTheme.typography.displayMedium
            )

            // TODO: List of bills
            // TODO: List of subscriptions
            // TODO: Car expenses - MOT (£54.85 max cost, £29.65 for bikes), tax (monthly, biannually, annually), insurance, service
            // TODO: Other insurance - building, contents, renters - have general insurance category and let user enter type and frequency
        }

    }
}