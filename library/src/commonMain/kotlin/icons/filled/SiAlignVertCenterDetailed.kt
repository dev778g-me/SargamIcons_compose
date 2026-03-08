package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAlignVertCenterDetailed: ImageVector
    get() {
        if (_SiAlignVertCenterDetailed != null) {
            return _SiAlignVertCenterDetailed!!
        }
        _SiAlignVertCenterDetailed = ImageVector.Builder(
            name = "Filled.SiAlignVertCenterDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineTo(4.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.6f, 3f)
                horizontalLineToRelative(1.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4.6f)
                verticalLineTo(11f)
                horizontalLineToRelative(4f)
                verticalLineTo(8.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.6f, 7f)
                horizontalLineToRelative(1.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 8.6f)
                verticalLineTo(11f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.4f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineToRelative(-1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -1.6f)
                verticalLineTo(13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(6.4f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 21f)
                horizontalLineTo(6.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19.4f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            }
        }.build()

        return _SiAlignVertCenterDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignVertCenterDetailed: ImageVector? = null
