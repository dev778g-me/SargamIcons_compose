package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiBold: ImageVector
    get() {
        if (_SiBold != null) {
            return _SiBold!!
        }
        _SiBold = ImageVector.Builder(
            name = "Regular.SiBold",
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
                moveTo(7f, 3f)
                horizontalLineToRelative(4.75f)
                curveTo(14.1f, 3f, 16f, 4.788f, 16f, 7f)
                reflectiveCurveToRelative(-1.9f, 4f, -4.25f, 4f)
                horizontalLineTo(7f)
                horizontalLineToRelative(6.818f)
                curveTo(16.654f, 11f, 19f, 13.263f, 19f, 16f)
                reflectiveCurveToRelative(-2.346f, 5f, -5.182f, 5f)
                horizontalLineTo(7f)
                moveTo(7f, 3f)
                horizontalLineTo(5f)
                moveToRelative(2f, 0f)
                verticalLineToRelative(18f)
                moveToRelative(0f, 0f)
                horizontalLineTo(5f)
            }
        }.build()

        return _SiBold!!
    }

@Suppress("ObjectPropertyName")
private var _SiBold: ImageVector? = null
