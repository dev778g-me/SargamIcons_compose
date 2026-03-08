package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAlignHorizCenterDetailed: ImageVector
    get() {
        if (_SiAlignHorizCenterDetailed != null) {
            return _SiAlignHorizCenterDetailed!!
        }
        _SiAlignHorizCenterDetailed = ImageVector.Builder(
            name = "Filled.SiAlignHorizCenterDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.4f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6.6f)
                verticalLineToRelative(1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineTo(13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.4f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, 1.6f)
                verticalLineToRelative(1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineTo(13f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(8.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17.4f)
                verticalLineToRelative(-1.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.6f, 14f)
                horizontalLineTo(11f)
                verticalLineToRelative(-4f)
                horizontalLineTo(4.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 8.4f)
                verticalLineTo(6.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.6f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
            }
        }.build()

        return _SiAlignHorizCenterDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignHorizCenterDetailed: ImageVector? = null
