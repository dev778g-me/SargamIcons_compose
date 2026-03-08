package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiGlobeDetailed: ImageVector
    get() {
        if (_SiGlobeDetailed != null) {
            return _SiGlobeDetailed!!
        }
        _SiGlobeDetailed = ImageVector.Builder(
            name = "Regular.SiGlobeDetailed",
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
                moveTo(22f, 12f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                moveToRelative(10f, -10f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                moveToRelative(10f, 10f)
                horizontalLineTo(2f)
                moveToRelative(10f, 10f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                moveToRelative(10f, 10f)
                lineToRelative(0.66f, -0.31f)
                curveToRelative(2.1f, -2.71f, 3.34f, -6.14f, 3.34f, -9.78f)
                reflectiveCurveToRelative(-1.22f, -7f, -3.27f, -9.69f)
                lineTo(12f, 2f)
                moveToRelative(0f, 20f)
                lineToRelative(-0.73f, -0.31f)
                arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                curveToRelative(0f, -3.64f, 1.24f, -7.07f, 3.34f, -9.78f)
                lineTo(12f, 2f)
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                moveToRelative(7.14f, 17f)
                curveToRelative(-1.82f, -1.85f, -4.34f, -3f, -7.14f, -3f)
                reflectiveCurveToRelative(-5.33f, 1.15f, -7.14f, 3f)
                moveTo(19.14f, 5f)
                curveTo(17.33f, 6.85f, 14.8f, 8f, 12f, 8f)
                reflectiveCurveTo(6.68f, 6.85f, 4.86f, 5f)
            }
        }.build()

        return _SiGlobeDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiGlobeDetailed: ImageVector? = null
