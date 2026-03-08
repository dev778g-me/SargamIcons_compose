package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiBluetooth: ImageVector
    get() {
        if (_SiBluetooth != null) {
            return _SiBluetooth!!
        }
        _SiBluetooth = ImageVector.Builder(
            name = "Duotone.SiBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveToRelative(12f, 12f)
                lineToRelative(6f, 5f)
                lineToRelative(-6f, 5f)
                verticalLineTo(2f)
                lineToRelative(6f, 5f)
                close()
            }
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
