package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiUmbrella: ImageVector
    get() {
        if (_SiUmbrella != null) {
            return _SiUmbrella!!
        }
        _SiUmbrella = ImageVector.Builder(
            name = "Regular.SiUmbrella",
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
                moveTo(17.217f, 19.39f)
                curveToRelative(0.044f, 1.391f, -1.087f, 2.565f, -2.521f, 2.609f)
                horizontalLineToRelative(-0.088f)
                curveToRelative(-1.39f, 0.043f, -2.565f, -1.087f, -2.608f, -2.522f)
                verticalLineTo(12f)
                moveToRelative(10f, 0f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                close()
            }
        }.build()

        return _SiUmbrella!!
    }

@Suppress("ObjectPropertyName")
private var _SiUmbrella: ImageVector? = null
