package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiStar: ImageVector
    get() {
        if (_SiStar != null) {
            return _SiStar!!
        }
        _SiStar = ImageVector.Builder(
            name = "Regular.SiStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(12f, 2f)
                lineToRelative(2.4f, 7.619f)
                lineToRelative(7.6f, -0.005f)
                lineToRelative(-6.114f, 4.181f)
                lineToRelative(2.29f, 7.253f)
                lineTo(12f, 16.624f)
                lineToRelative(-6.181f, 4.424f)
                lineToRelative(2.29f, -7.253f)
                lineTo(2f, 9.615f)
                lineToRelative(7.595f, 0.004f)
                close()
            }
        }.build()

        return _SiStar!!
    }

@Suppress("ObjectPropertyName")
private var _SiStar: ImageVector? = null
