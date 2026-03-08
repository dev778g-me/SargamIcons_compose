package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiCopy: ImageVector
    get() {
        if (_SiCopy != null) {
            return _SiCopy!!
        }
        _SiCopy = ImageVector.Builder(
            name = "Duotone.SiCopy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(18.6f, 9f)
                horizontalLineToRelative(-7.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11.4f)
                verticalLineToRelative(7.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, 2.4f)
                horizontalLineToRelative(7.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineToRelative(-7.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.6f, 9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 15f)
                horizontalLineToRelative(-0.6f)
                curveTo(4.07f, 15f, 3f, 13.93f, 3f, 12.6f)
                verticalLineTo(5.4f)
                curveTo(3f, 4.07f, 4.07f, 3f, 5.4f, 3f)
                horizontalLineToRelative(7.2f)
                curveTo(13.93f, 3f, 15f, 4.07f, 15f, 5.4f)
                verticalLineTo(6f)
                moveToRelative(-3.6f, 3f)
                horizontalLineToRelative(7.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.4f, 2.4f)
                verticalLineToRelative(7.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineToRelative(-7.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 18.6f)
                verticalLineToRelative(-7.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.4f, 9f)
            }
        }.build()

        return _SiCopy!!
    }

@Suppress("ObjectPropertyName")
private var _SiCopy: ImageVector? = null
