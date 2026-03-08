package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiLamp: ImageVector
    get() {
        if (_SiLamp != null) {
            return _SiLamp!!
        }
        _SiLamp = ImageVector.Builder(
            name = "Duotone.SiLamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                verticalLineToRelative(1f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                verticalLineToRelative(6f)
                moveToRelative(10f, -7f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(20f)
                close()
                moveTo(8.818f, 19f)
                horizontalLineToRelative(6.364f)
                curveToRelative(1f, 0f, 1.818f, 0.9f, 1.818f, 2f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.818f, -2f, 1.818f, -2f)
            }
        }.build()

        return _SiLamp!!
    }

@Suppress("ObjectPropertyName")
private var _SiLamp: ImageVector? = null
