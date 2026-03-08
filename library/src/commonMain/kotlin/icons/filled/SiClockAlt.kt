package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiClockAlt: ImageVector
    get() {
        if (_SiClockAlt != null) {
            return _SiClockAlt!!
        }
        _SiClockAlt = ImageVector.Builder(
            name = "Filled.SiClockAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 12f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.523f, 2f, 12f)
                reflectiveCurveTo(6.477f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
                moveToRelative(-9f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(5.844f)
                curveToRelative(0f, 0.55f, 0.375f, 1.03f, 0.909f, 1.164f)
                lineToRelative(3.848f, 0.962f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.486f, -1.94f)
                lineTo(13f, 11.22f)
                close()
            }
        }.build()

        return _SiClockAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiClockAlt: ImageVector? = null
