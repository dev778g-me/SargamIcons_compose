package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiClose: ImageVector
    get() {
        if (_SiClose != null) {
            return _SiClose!!
        }
        _SiClose = ImageVector.Builder(
            name = "Duotone.SiClose",
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
                moveToRelative(7.757f, 16.243f)
                lineToRelative(8.486f, -8.486f)
                moveToRelative(0f, 8.486f)
                lineTo(7.757f, 7.757f)
            }
        }.build()

        return _SiClose!!
    }

@Suppress("ObjectPropertyName")
private var _SiClose: ImageVector? = null
