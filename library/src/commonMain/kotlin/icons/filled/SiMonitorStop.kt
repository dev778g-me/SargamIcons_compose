package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMonitorStop: ImageVector
    get() {
        if (_SiMonitorStop != null) {
            return _SiMonitorStop!!
        }
        _SiMonitorStop = ImageVector.Builder(
            name = "Filled.SiMonitorStop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(13.5f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.775f, 3.005f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 6.4f)
                verticalLineToRelative(8.2f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.4f, 3.4f)
                horizontalLineTo(4.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 14.6f)
                verticalLineTo(6.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.4f, 3f)
                horizontalLineToRelative(15.2f)
                close()
                moveTo(10.3f, 7f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.8f, 1.8f)
                verticalLineToRelative(3.4f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.8f, 1.8f)
                horizontalLineToRelative(3.4f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.8f, -1.8f)
                verticalLineTo(8.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.7f, 7f)
                close()
            }
        }.build()

        return _SiMonitorStop!!
    }

@Suppress("ObjectPropertyName")
private var _SiMonitorStop: ImageVector? = null
