package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIUnlock: ImageVector
    get() {
        if (_SiAIUnlock != null) {
            return _SiAIUnlock!!
        }
        _SiAIUnlock = ImageVector.Builder(
            name = "Filled.SiAIUnlock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 15.297f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.203f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.203f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.203f, -0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.203f, -0.203f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 2f)
                curveToRelative(2.762f, 0f, 5f, 2.238f, 5f, 5f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.658f, -1.342f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.342f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.4f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.32f, -1.08f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.08f, 21f, 3f, 19.92f, 3f, 18.6f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                curveToRelative(0f, -2.762f, 2.238f, -5f, 5f, -5f)
                moveToRelative(-7.078f, 11.095f)
                curveToRelative(-0.232f, -0.93f, -1.52f, -0.959f, -1.818f, -0.087f)
                lineToRelative(-0.025f, 0.087f)
                lineToRelative(-0.297f, 1.187f)
                lineToRelative(-1.187f, 0.297f)
                curveToRelative(-0.96f, 0.24f, -0.96f, 1.603f, 0f, 1.843f)
                lineToRelative(1.187f, 0.297f)
                lineToRelative(0.297f, 1.187f)
                curveToRelative(0.24f, 0.959f, 1.603f, 0.96f, 1.843f, 0f)
                lineToRelative(0.297f, -1.187f)
                lineToRelative(1.187f, -0.297f)
                curveToRelative(0.96f, -0.24f, 0.959f, -1.603f, 0f, -1.843f)
                lineToRelative(-1.187f, -0.297f)
                close()
            }
        }.build()

        return _SiAIUnlock!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIUnlock: ImageVector? = null
