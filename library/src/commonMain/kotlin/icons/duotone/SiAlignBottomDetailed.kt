package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiAlignBottomDetailed: ImageVector
    get() {
        if (_SiAlignBottomDetailed != null) {
            return _SiAlignBottomDetailed!!
        }
        _SiAlignBottomDetailed = ImageVector.Builder(
            name = "Duotone.SiAlignBottomDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(17.4f, 10f)
                horizontalLineToRelative(-1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 1.6f)
                verticalLineToRelative(4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, 1.6f)
                horizontalLineToRelative(1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -1.6f)
                verticalLineToRelative(-4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -1.6f)
                moveTo(8.4f, 2f)
                horizontalLineTo(6.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 3.6f)
                verticalLineToRelative(12.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.6f, 18f)
                horizontalLineToRelative(1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -1.6f)
                verticalLineTo(3.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 22f)
                horizontalLineToRelative(20f)
                moveToRelative(-6.4f, -12f)
                horizontalLineToRelative(1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, 1.6f)
                verticalLineToRelative(4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineToRelative(-1.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -1.6f)
                verticalLineToRelative(-4.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, -1.6f)
                moveToRelative(-9f, -8f)
                horizontalLineToRelative(1.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 3.6f)
                verticalLineToRelative(12.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 18f)
                horizontalLineTo(6.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16.4f)
                verticalLineTo(3.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.6f, 2f)
            }
        }.build()

        return _SiAlignBottomDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignBottomDetailed: ImageVector? = null
