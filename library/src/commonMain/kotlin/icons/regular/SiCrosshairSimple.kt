package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiCrosshairSimple: ImageVector
    get() {
        if (_SiCrosshairSimple != null) {
            return _SiCrosshairSimple!!
        }
        _SiCrosshairSimple = ImageVector.Builder(
            name = "Regular.SiCrosshairSimple",
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
