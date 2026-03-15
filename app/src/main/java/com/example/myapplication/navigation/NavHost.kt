package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.screens.AddBillScreen
import com.example.myapplication.screens.BillsScreen
import com.example.myapplication.screens.BudgetScreen
import com.example.myapplication.screens.FinancesScreen
import com.example.myapplication.screens.HomeScreen
import com.example.myapplication.screens.SettingsScreen

fun NavHostController.navigateTo(route: String) =
    this.navigate(route) {
        popUpTo(
            this@navigateTo.graph.findStartDestination().id
        ) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }

@Composable
fun NavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Home.route,
    ) {
        composable(route = Home.route) {
            HomeScreen(
                navController = navController,
                onAddBillClick = { navController.navigateTo(AddBill.route) }
            )
        }
        composable(route = Bills.route) {
            BillsScreen(
                navController = navController,
            )
        }
        composable(route = Settings.route) {
            SettingsScreen(
                navController = navController,
            )
        }
        composable(route = Budget.route) {
            BudgetScreen(
                navController = navController
            )
        }
        composable(route = Finances.route) {
            FinancesScreen(
                navController = navController
            )
        }
        composable(route = AddBill.route) {
            AddBillScreen(
                navController = navController
            )
        }
    }
}