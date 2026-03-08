package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSunnySnowing: ImageVector
    get() {
        if (_SiSunnySnowing != null) {
            return _SiSunnySnowing!!
        }
        _SiSunnySnowing = ImageVector.Builder(
            name = "Regular.SiSunnySnowing",
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
                moveTo(5f, 13f)
                horizontalLineTo(1f)
                moveToRelative(22f, 0f)
                horizontalLineToRelative(-4f)
                moveTo(12f, 2f)
                verticalLineToRelative(4f)
                moveTo(7.05f, 8.05f)
                lineTo(4.222f, 5.222f)
                moveToRelative(15.556f, 0f)
                lineTo(16.95f, 8.05f)
                moveTo(8f, 13f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                moveToRelative(-4f, 3f)
                horizontalLineToRelative(0.1f)
                moveToRelative(3.9f, 0f)
                horizontalLineToRelative(0.1f)
                moveToRelative(3.9f, 0f)
                horizontalLineToRelative(0.1f)
                moveTo(8f, 16f)
                horizontalLineToRelative(0.1f)
                moveToRelative(3.9f, 3f)
                horizontalLineToRelative(0.1f)
                moveToRelative(-0.1f, 3f)
                horizontalLineToRelative(0.1f)
                moveToRelative(3.9f, -3f)
                horizontalLineToRelative(0.1f)
                moveTo(8f, 19f)
                horizontalLineToRelative(0.1f)
                moveTo(4f, 16f)
                horizontalLineToRelative(0.1f)
            }
        }.build()

        return _SiSunnySnowing!!
    }

@Suppress("ObjectPropertyName")
private var _SiSunnySnowing: ImageVector? = null
