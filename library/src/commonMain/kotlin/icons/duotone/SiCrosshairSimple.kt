package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiCrosshairSimple: ImageVector
    get() {
        if (_SiCrosshairSimple != null) {
            return _SiCrosshairSimple!!
        }
        _SiCrosshairSimple = ImageVector.Builder(
            name = "Duotone.SiCrosshairSimple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(12f, 22f)
                curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
                reflectiveCurveTo(17.523f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                moveToRelative(10f, -10f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                moveToRelative(10f, 10f)
                horizontalLineToRelative(-4f)
                moveToRelative(-6f, 10f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                moveToRelative(10f, 10f)
                verticalLineToRelative(-4f)
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                moveTo(2f, 12f)
                horizontalLineToRelative(4f)
                moveToRelative(6f, -10f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _SiCrosshairSimple!!
    }

@Suppress("ObjectPropertyName")
private var _SiCrosshairSimple: ImageVector? = null
