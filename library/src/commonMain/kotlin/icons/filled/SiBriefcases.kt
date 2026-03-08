package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiBriefcases: ImageVector
    get() {
        if (_SiBriefcases != null) {
            return _SiBriefcases!!
        }
        _SiBriefcases = ImageVector.Builder(
            name = "Filled.SiBriefcases",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 6f)
                lineTo(10f, 3.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.8f, 2f)
                horizontalLineToRelative(4.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 3.8f)
                lineTo(18f, 6f)
                horizontalLineToRelative(2.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 8.4f)
                verticalLineToRelative(8.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                lineTo(7.4f, 19f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16.6f)
                lineTo(5f, 8.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.4f, 6f)
                close()
                moveTo(12f, 6f)
                lineTo(12f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(12f, 7f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                lineTo(10f, 7f)
                close()
                moveTo(18f, 7f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(5.6f)
                curveTo(1f, 20.132f, 3.868f, 23f, 7.4f, 23f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(7.4f)
                arcTo(4.403f, 4.403f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.6f)
                close()
            }
        }.build()

        return _SiBriefcases!!
    }

@Suppress("ObjectPropertyName")
private var _SiBriefcases: ImageVector? = null
