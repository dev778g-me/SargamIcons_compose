package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiZoomOut: ImageVector
    get() {
        if (_SiZoomOut != null) {
            return _SiZoomOut!!
        }
        _SiZoomOut = ImageVector.Builder(
            name = "Filled.SiZoomOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 19f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.906f, -1.68f)
                lineToRelative(4.387f, 4.387f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, -1.414f)
                lineToRelative(-4.387f, -4.387f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11f, 19f)
                moveToRelative(-3f, -9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.build()

        return _SiZoomOut!!
    }

@Suppress("ObjectPropertyName")
private var _SiZoomOut: ImageVector? = null
