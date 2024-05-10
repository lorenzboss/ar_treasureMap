package ch.bfh.teamulrich.treasuremap.views.sensor

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import ch.bfh.teamulrich.treasuremap.ui.theme.TreasureMapTheme
import ch.bfh.teamulrich.treasuremap.viewmodels.TreasureMapState
import kotlin.math.roundToInt

@Composable
fun TreasureMapInfoView(state: TreasureMapState, modifier: Modifier = Modifier) {
    Column {
        Row {
            // TODO: display current magnetic reading
        }
        Row {
            // TODO: display maximum magnetic reading
        }
    }
}

@Preview
@Composable
fun TreasureMapInfoViewPreview() {
    TreasureMapTheme {
        TreasureMapInfoView(state = TreasureMapState(), modifier = Modifier.fillMaxWidth())
    }
}