package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiCopyAlt: ImageVector
    get() {
        if (_SiCopyAlt != null) {
            return _SiCopyAlt!!
        }
        _SiCopyAlt = ImageVector.Builder(
            name = "Duotone.SiCopyAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(12.6f, 3f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.4f)
                verticalLineToRelative(7.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.4f, 15f)
                horizontalLineToRelative(7.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.6f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9f)
                horizontalLineToRelative(0.6f)
                curveToRelative(1.33f, 0f, 2.4f, 1.07f, 2.4f, 2.4f)
                verticalLineToRelative(7.2f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineToRelative(-7.2f)
                curveTo(10.07f, 21f, 9f, 19.93f, 9f, 18.6f)
                verticalLineTo(18f)
                moveTo(5.4f, 3f)
                horizontalLineToRelative(7.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5.4f)
                verticalLineToRelative(7.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12.6f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
            }
        }.build()

        return _SiCopyAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiCopyAlt: ImageVector? = null
