package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAlignHorizCenterDetailed: ImageVector
    get() {
        if (_SiAlignHorizCenterDetailed != null) {
            return _SiAlignHorizCenterDetailed!!
        }
        _SiAlignHorizCenterDetailed = ImageVector.Builder(
            name = "Regular.SiAlignHorizCenterDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineToRelative(3f)
                moveToRelative(0f, 5f)
                verticalLineToRelative(4f)
                moveToRelative(0f, 5f)
                verticalLineToRelative(3f)
                moveToRelative(4f, -6.4f)
                verticalLineToRelative(1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineTo(9.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17.4f)
                verticalLineToRelative(-1.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 14f)
                horizontalLineToRelative(4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, 1.6f)
                moveToRelative(4f, -9f)
                verticalLineToRelative(1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineTo(5.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 8.4f)
                verticalLineTo(6.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.6f, 5f)
                horizontalLineToRelative(12.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 6.6f)
            }
        }.build()

        return _SiAlignHorizCenterDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignHorizCenterDetailed: ImageVector? = null
