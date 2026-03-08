package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiHelp: ImageVector
    get() {
        if (_SiHelp != null) {
            return _SiHelp!!
        }
        _SiHelp = ImageVector.Builder(
            name = "Regular.SiHelp",
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
                moveTo(11.83f, 14f)
                verticalLineToRelative(-0.621f)
                arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.164f, -2.02f)
                curveToRelative(1.126f, -0.66f, 1.514f, -2.057f, 0.854f, -3.183f)
                reflectiveCurveToRelative(-2.057f, -1.514f, -3.183f, -0.854f)
                curveTo(9.965f, 7.75f, 9.5f, 8.487f, 9.5f, 9.341f)
                moveTo(12f, 17f)
                horizontalLineToRelative(-0.008f)
                moveTo(22f, 12f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            }
        }.build()

        return _SiHelp!!
    }

@Suppress("ObjectPropertyName")
private var _SiHelp: ImageVector? = null
