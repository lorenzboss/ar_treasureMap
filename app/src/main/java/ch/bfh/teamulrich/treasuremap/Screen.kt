package ch.bfh.teamulrich.treasuremap

import androidx.annotation.DrawableRes

sealed class Screen(val route: String, @DrawableRes val icon: Int) {
    object Sensor : Screen("Sensor", R.drawable.ic_sensor)
    object Reader : Screen("Reader", R.drawable.ic_reader)
}