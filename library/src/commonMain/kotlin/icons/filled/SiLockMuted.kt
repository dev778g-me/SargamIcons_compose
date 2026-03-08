package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiLockMuted: ImageVector
    get() {
        if (_SiLockMuted != null) {
            return _SiLockMuted!!
        }
        _SiLockMuted = ImageVector.Builder(
            name = "Filled.SiLockMuted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(9.238f, 2f, 7f, 4.238f, 7f, 7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-0.88f, 0f, -1.6f, 0.72f, -1.6f, 1.6f)
                verticalLineToRelative(7f)
                curveTo(5f, 19.92f, 6.08f, 21f, 7.4f, 21f)
                horizontalLineToRelative(9.2f)
                curveToRelative(1.32f, 0f, 2.4f, -1.08f, 2.4f, -2.4f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                curveToRelative(0f, -2.762f, -2.238f, -5f, -5f, -5f)
                moveToRelative(3f, 8f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.658f, -1.342f, -3f, -3f, -3f)
                reflectiveCurveTo(9f, 5.342f, 9f, 7f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()

        return _SiLockMuted!!
    }

@Suppress("ObjectPropertyName")
private var _SiLockMuted: ImageVector? = null
