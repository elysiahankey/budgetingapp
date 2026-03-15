package com.example.myapplication.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.myapplication.navigation.BottomNavBar

@Composable
fun AccountsScreen(
    navController: NavHostController
) {
    Scaffold(
        bottomBar = {
            BottomNavBar(navController)
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Text(
                text = "Bills"
            )

            // TODO: List of accounts
            // TODO: Floating action button to add new account
            // Account types: cash, current account, investments, credit card, savings accounts, loans, insurance, others
            // Credit card fields: provider, credit limit, interest free period, minimum payment amount and date
            // Savings account fields: provider, interest rate, minimum balance

        }
    }
}