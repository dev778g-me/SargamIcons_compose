package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiLink: ImageVector
    get() {
        if (_SiLink != null) {
            return _SiLink!!
        }
        _SiLink = ImageVector.Builder(
            name = "Duotone.SiLink",
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
                moveTo(10.372f, 13.127f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.317f, -4.91f)
                lineToRelative(4.05f, -4.124f)
                arcToRelative(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.187f, 0f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.278f)
                lineToRelative(-2.709f, 2.93f)
                moveToRelative(-4.043f, -1.65f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.261f)
                lineTo(9.26f, 19.907f)
                arcToRelative(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.186f, 0f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.278f)
                lineToRelative(2.607f, -2.739f)
            }
        }.build()

        return _SiLink!!
    }

@Suppress("ObjectPropertyName")
private var _SiLink: ImageVector? = null
