package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiAlignRightDetailed: ImageVector
    get() {
        if (_SiAlignRightDetailed != null) {
            return _SiAlignRightDetailed!!
        }
        _SiAlignRightDetailed = ImageVector.Builder(
            name = "Duotone.SiAlignRightDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(18f, 17.4f)
                verticalLineToRelative(-1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -1.6f)
                horizontalLineToRelative(-4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 1.6f)
                verticalLineToRelative(1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, 1.6f)
                horizontalLineToRelative(4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -1.6f)
                moveTo(18f, 8.4f)
                verticalLineTo(6.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.4f, 5f)
                horizontalLineTo(3.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6.6f)
                verticalLineToRelative(1.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.6f, 10f)
                horizontalLineToRelative(12.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8.4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                verticalLineToRelative(20f)
                moveToRelative(-4f, -6.4f)
                verticalLineToRelative(1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineToRelative(-4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -1.6f)
                verticalLineToRelative(-1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, -1.6f)
                horizontalLineToRelative(4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, 1.6f)
                moveToRelative(0f, -9f)
                verticalLineToRelative(1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineTo(3.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 8.4f)
                verticalLineTo(6.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.6f, 5f)
                horizontalLineToRelative(12.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 6.6f)
            }
        }.build()

        return _SiAlignRightDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignRightDetailed: ImageVector? = null
