package com.example.myapplication.navigation

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

val topLevelRoutes = listOf(Home, Budget, Bills, Finances, Settings)

interface Destination {
    val name: String
    val route: String
    val icon: @Composable () -> Unit
}

object Home: Destination {
    override val name = "Home"
    override val route = "home"
    override val icon = @Composable {
        Icon(
            painterResource(
                id = TODO()
            ),
            contentDescription = null
        )
    }
}

object Budget: Destination {
    override val name = "Budget"
    override val route = "budget"
    override val icon = @Composable {
        Icon(
            painterResource(
                id = TODO()
            ),
            contentDescription = null
        )
    }
}

object Finances: Destination {
    override val name = "Finances"
    override val route = "finances"
    override val icon = @Composable {
        Icon(
            painterResource(
                id = TODO()
            ),
            contentDescription = null
        )
    }
}

object Settings: Destination {
    override val name = "Settings"
    override val route = "settings"
    override val icon = @Composable {
        Icon(
            painterResource(
                id = TODO()
            ),
            contentDescription = null
        )
    }
}

object Bills: Destination {
    override val name = "Bills"
    override val route = "bills"
    override val icon = @Composable {
        Icon(
            painterResource(
                id = TODO()
            ),
            contentDescription = null
        )
    }
}

object AddBill: Destination {
    override val name = "Add Bill"
    override val route = "addbill"
    override val icon = @Composable {
        Icon(
            painterResource(
                id = TODO()
            ),
            contentDescription = null
        )
    }
}