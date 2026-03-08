package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUnlockMuted: ImageVector
    get() {
        if (_SiUnlockMuted != null) {
            return _SiUnlockMuted!!
        }
        _SiUnlockMuted = ImageVector.Builder(
            name = "Filled.SiUnlockMuted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                curveToRelative(-2.762f, 0f, -5f, 2.238f, -5f, 5f)
                verticalLineToRelative(3f)
                horizontalLineTo(4.6f)
                curveToRelative(-0.88f, 0f, -1.6f, 0.72f, -1.6f, 1.6f)
                verticalLineToRelative(7f)
                curveTo(3f, 19.92f, 4.08f, 21f, 5.4f, 21f)
                horizontalLineToRelative(9.2f)
                curveToRelative(1.32f, 0f, 2.4f, -1.08f, 2.4f, -2.4f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.658f, 1.342f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.342f, 3f, 3f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineTo(7f)
                curveToRelative(0f, -2.762f, -2.238f, -5f, -5f, -5f)
            }
        }.build()

        return _SiUnlockMuted!!
    }

@Suppress("ObjectPropertyName")
private var _SiUnlockMuted: ImageVector? = null
