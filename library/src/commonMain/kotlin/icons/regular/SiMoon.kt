package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMoon: ImageVector
    get() {
        if (_SiMoon != null) {
            return _SiMoon!!
        }
        _SiMoon = ImageVector.Builder(
            name = "Regular.SiMoon",
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
                moveTo(10.41f, 13.28f)
                curveTo(7.332f, 10.205f, 6.716f, 5.693f, 8.357f, 2f)
                curveToRelative(-1.23f, 0.41f, -2.256f, 1.23f, -3.281f, 2.256f)
                arcToRelative(10.4f, 10.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.768f)
                curveToRelative(4.102f, 4.102f, 10.46f, 3.897f, 14.562f, -0.205f)
                curveToRelative(1.026f, -1.026f, 1.846f, -2.051f, 2.256f, -3.282f)
                curveToRelative(-3.896f, 1.436f, -8.409f, 0.82f, -11.486f, -2.256f)
            }
        }.build()

        return _SiMoon!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoon: ImageVector? = null
