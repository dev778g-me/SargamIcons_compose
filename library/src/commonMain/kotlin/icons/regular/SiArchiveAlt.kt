package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiArchiveAlt: ImageVector
    get() {
        if (_SiArchiveAlt != null) {
            return _SiArchiveAlt!!
        }
        _SiArchiveAlt = ImageVector.Builder(
            name = "Regular.SiArchiveAlt",
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
                moveToRelative(21f, 7f)
                lineToRelative(-1f, 11.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(6.4f)
                curveTo(5.07f, 21f, 4f, 19.93f, 4f, 18.6f)
                lineTo(3f, 7f)
                moveToRelative(12f, 10f)
                lineToRelative(-6f, -6f)
                moveToRelative(6f, 0f)
                lineToRelative(-6f, 6f)
                moveTo(2.6f, 3f)
                horizontalLineToRelative(18.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4.6f)
                verticalLineToRelative(0.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.4f, 7f)
                horizontalLineTo(2.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 5.4f)
                verticalLineToRelative(-0.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 3f)
            }
        }.build()

        return _SiArchiveAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiArchiveAlt: ImageVector? = null
