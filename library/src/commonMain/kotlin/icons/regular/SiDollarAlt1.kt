package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiDollarAlt1: ImageVector
    get() {
        if (_SiDollarAlt1 != null) {
            return _SiDollarAlt1!!
        }
        _SiDollarAlt1 = ImageVector.Builder(
            name = "Regular.SiDollarAlt1",
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
                moveTo(9.14f, 16.962f)
                arcToRelative(4.92f, 4.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.812f, 0.655f)
                curveToRelative(1.483f, -0.104f, 3.116f, -1.112f, 2.997f, -2.807f)
                curveToRelative(-0.092f, -1.313f, -0.815f, -2.066f, -2.953f, -2.81f)
                reflectiveCurveToRelative(-2.857f, -1.497f, -2.95f, -2.81f)
                curveToRelative(-0.118f, -1.695f, 1.515f, -2.703f, 2.998f, -2.807f)
                curveToRelative(0.974f, -0.068f, 1.97f, 0.16f, 2.813f, 0.655f)
                moveTo(12f, 5f)
                verticalLineToRelative(14f)
                moveToRelative(10f, -7f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            }
        }.build()

        return _SiDollarAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiDollarAlt1: ImageVector? = null
