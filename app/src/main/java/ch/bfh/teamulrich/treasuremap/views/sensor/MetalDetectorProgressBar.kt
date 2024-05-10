package ch.bfh.teamulrich.treasuremap.views.sensor

import android.content.res.Configuration
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.bfh.teamulrich.treasuremap.ui.theme.TreasureMapTheme

@Composable
fun TreasureMapProgressBar(progress: Float, modifier: Modifier = Modifier) {
    val animatedProgress: Float by animateFloatAsState(targetValue = progress)
    LinearProgressIndicator(progress = animatedProgress, modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Preview(name = "Night Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun TreasureMapProgressBarPreview() {
    TreasureMapTheme {
        Column {
            TreasureMapProgressBar(progress = 0.5f)
            Spacer(modifier = Modifier.height(8.dp))
            TreasureMapProgressBar(progress = 0.25f)
        }
    }
}