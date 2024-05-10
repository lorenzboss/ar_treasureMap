package ch.bfh.teamulrich.treasuremap.views.sensor

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import ch.bfh.teamulrich.treasuremap.viewmodels.TreasureMapState
import ch.bfh.teamulrich.treasuremap.viewmodels.TreasureMapViewModel
import kotlin.math.min

val TreasureMapState.progress: Float
    get() = min((this.currentMagnitude / this.maxMagnitude).toFloat(), 1.0f)

@Composable
fun TreasureMapView(viewModel: TreasureMapViewModel = viewModel()) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TODO: display TreasureMapInfoView and TreasureMapProgressBar
    }
}