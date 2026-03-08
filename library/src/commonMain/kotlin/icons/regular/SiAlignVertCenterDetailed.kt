package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAlignVertCenterDetailed: ImageVector
    get() {
        if (_SiAlignVertCenterDetailed != null) {
            return _SiAlignVertCenterDetailed!!
        }
        _SiAlignVertCenterDetailed = ImageVector.Builder(
            name = "Regular.SiAlignVertCenterDetailed",
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
                moveTo(2f, 12f)
                horizontalLineToRelative(3f)
                moveToRelative(14f, 0f)
                horizontalLineToRelative(3f)
                moveToRelative(-12f, 0f)
                horizontalLineToRelative(4f)
                moveToRelative(1.6f, -4f)
                horizontalLineToRelative(1.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9.6f)
                verticalLineToRelative(4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineToRelative(-1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -1.6f)
                verticalLineTo(9.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.6f, 8f)
                moveToRelative(-9f, -4f)
                horizontalLineToRelative(1.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 5.6f)
                verticalLineToRelative(12.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 20f)
                horizontalLineTo(6.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 18.4f)
                verticalLineTo(5.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.6f, 4f)
            }
        }.build()

        return _SiAlignVertCenterDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignVertCenterDetailed: ImageVector? = null
