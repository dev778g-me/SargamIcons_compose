package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCrosshairDetailed: ImageVector
    get() {
        if (_SiCrosshairDetailed != null) {
            return _SiCrosshairDetailed!!
        }
        _SiCrosshairDetailed = ImageVector.Builder(
            name = "Filled.SiCrosshairDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(10f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 3.055f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineTo(3.055f)
                arcTo(9.004f, 9.004f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.055f, 11f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(3.055f)
                arcTo(9.004f, 9.004f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 20.945f)
                verticalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(1.945f)
                arcTo(9.004f, 9.004f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.945f, 13f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1.945f)
                arcTo(9.004f, 9.004f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 3.055f)
                moveTo(12f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(13f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(3f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                close()
            }
        }.build()

        return _SiCrosshairDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiCrosshairDetailed: ImageVector? = null
