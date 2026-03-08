package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUnlockAlt: ImageVector
    get() {
        if (_SiUnlockAlt != null) {
            return _SiUnlockAlt!!
        }
        _SiUnlockAlt = ImageVector.Builder(
            name = "Filled.SiUnlockAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 7f)
                curveToRelative(0f, -2.762f, 2.238f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.238f, 5f, 5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.4f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.32f, -1.08f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.08f, 21f, 3f, 19.92f, 3f, 18.6f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.658f, -1.342f, -3f, -3f, -3f)
                reflectiveCurveTo(9f, 5.342f, 9f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                moveToRelative(3f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
            }
        }.build()

        return _SiUnlockAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiUnlockAlt: ImageVector? = null
