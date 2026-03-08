package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMonitorDown: ImageVector
    get() {
        if (_SiMonitorDown != null) {
            return _SiMonitorDown!!
        }
        _SiMonitorDown = ImageVector.Builder(
            name = "Filled.SiMonitorDown",
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
                moveTo(12f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2.586f)
                lineToRelative(-0.293f, -0.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.414f, 1.414f)
                lineToRelative(2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, 0f)
                lineToRelative(2f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.414f, -1.414f)
                lineToRelative(-0.293f, 0.293f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
            }
        }.build()

        return _SiMonitorDown!!
    }

@Suppress("ObjectPropertyName")
private var _SiMonitorDown: ImageVector? = null
