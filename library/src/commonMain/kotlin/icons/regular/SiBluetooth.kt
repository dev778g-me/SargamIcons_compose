package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiBluetooth: ImageVector
    get() {
        if (_SiBluetooth != null) {
            return _SiBluetooth!!
        }
        _SiBluetooth = ImageVector.Builder(
            name = "Regular.SiBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(5f, 6f)
                lineToRelative(13f, 11f)
                lineToRelative(-6f, 5f)
                verticalLineTo(2f)
                lineToRelative(6f, 5f)
                lineTo(5f, 18f)
            }
        }.build()

        return _SiBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _SiBluetooth: ImageVector? = null
