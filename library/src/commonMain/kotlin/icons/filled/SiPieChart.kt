package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiPieChart: ImageVector
    get() {
        if (_SiPieChart != null) {
            return _SiPieChart!!
        }
        _SiPieChart = ImageVector.Builder(
            name = "Filled.SiPieChart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1f)
                curveToRelative(6.075f, 0f, 11f, 4.925f, 11f, 11f)
                reflectiveCurveToRelative(-4.925f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 18.075f, 1f, 12f)
                reflectiveCurveTo(5.925f, 1f, 12f, 1f)
                moveToRelative(-0.75f, 1f)
                verticalLineToRelative(9.689f)
                lineTo(4.398f, 18.54f)
                lineToRelative(1.061f, 1.06f)
                lineToRelative(6.852f, -6.851f)
                horizontalLineTo(22f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.537f)
                lineToRelative(3.072f, -3.073f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(-4.133f, 4.133f)
                horizontalLineTo(13.81f)
                lineToRelative(5.79f, -5.791f)
                lineToRelative(-1.061f, -1.06f)
                lineToRelative(-5.79f, 5.79f)
                verticalLineToRelative(-2.4f)
                lineToRelative(4.22f, -4.22f)
                lineToRelative(-1.06f, -1.062f)
                lineToRelative(-3.16f, 3.16f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _SiPieChart!!
    }

@Suppress("ObjectPropertyName")
private var _SiPieChart: ImageVector? = null
