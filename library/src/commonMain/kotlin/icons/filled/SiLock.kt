package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiLock: ImageVector
    get() {
        if (_SiLock != null) {
            return _SiLock!!
        }
        _SiLock = ImageVector.Builder(
            name = "Filled.SiLock",
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
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.4f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.32f, -1.08f, 2.4f, -2.4f, 2.4f)
                lineTo(7.4f, 21f)
                curveTo(6.08f, 21f, 5f, 19.92f, 5f, 18.6f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
                lineTo(7f, 10f)
                close()
                moveTo(15f, 7f)
                verticalLineToRelative(3f)
                lineTo(9f, 10f)
                lineTo(9f, 7f)
                curveToRelative(0f, -1.658f, 1.342f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.342f, 3f, 3f)
                moveToRelative(-3f, 5.25f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 3.332f)
                lineTo(11.25f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-2.418f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12.25f)
            }
        }.build()

        return _SiLock!!
    }

@Suppress("ObjectPropertyName")
private var _SiLock: ImageVector? = null
