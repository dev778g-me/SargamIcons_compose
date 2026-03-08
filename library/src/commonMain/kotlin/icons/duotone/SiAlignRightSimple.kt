package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiAlignRightSimple: ImageVector
    get() {
        if (_SiAlignRightSimple != null) {
            return _SiAlignRightSimple!!
        }
        _SiAlignRightSimple = ImageVector.Builder(
            name = "Duotone.SiAlignRightSimple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(2f, 10.6f)
                verticalLineToRelative(2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.6f, 15f)
                horizontalLineToRelative(12.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -1.6f)
                verticalLineToRelative(-2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.4f, 9f)
                horizontalLineTo(3.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 10.6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                verticalLineTo(2f)
                moveTo(2f, 13.4f)
                verticalLineToRelative(-2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.6f, 9f)
                horizontalLineToRelative(12.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, 1.6f)
                verticalLineToRelative(2.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineTo(3.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 13.4f)
            }
        }.build()

        return _SiAlignRightSimple!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignRightSimple: ImageVector? = null
