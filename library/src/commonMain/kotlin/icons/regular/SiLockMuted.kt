package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiLockMuted: ImageVector
    get() {
        if (_SiLockMuted != null) {
            return _SiLockMuted!!
        }
        _SiLockMuted = ImageVector.Builder(
            name = "Regular.SiLockMuted",
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
                moveTo(8f, 10f)
                verticalLineTo(7f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                moveToRelative(-9.4f, 0f)
                horizontalLineToRelative(10.8f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.32f, -1.08f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(7.4f)
                curveTo(6.08f, 21f, 5f, 19.92f, 5f, 18.6f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
            }
        }.build()

        return _SiLockMuted!!
    }

@Suppress("ObjectPropertyName")
private var _SiLockMuted: ImageVector? = null
