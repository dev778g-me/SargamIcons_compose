package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiArrowUpwardCircle: ImageVector
    get() {
        if (_SiArrowUpwardCircle != null) {
            return _SiArrowUpwardCircle!!
        }
        _SiArrowUpwardCircle = ImageVector.Builder(
            name = "Regular.SiArrowUpwardCircle",
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
                moveToRelative(8f, 12f)
                lineToRelative(4f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, 4f)
                moveToRelative(-4f, -4f)
                verticalLineToRelative(8f)
                moveToRelative(10f, -4f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.523f, 2f, 12f)
                reflectiveCurveTo(6.477f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            }
        }.build()

        return _SiArrowUpwardCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SiArrowUpwardCircle: ImageVector? = null
