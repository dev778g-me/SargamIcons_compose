package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSearchAlt: ImageVector
    get() {
        if (_SiSearchAlt != null) {
            return _SiSearchAlt!!
        }
        _SiSearchAlt = ImageVector.Builder(
            name = "Regular.SiSearchAlt",
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
                moveToRelative(21f, 21f)
                lineToRelative(-7.5f, -7.5f)
                moveTo(15f, 9f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 9f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
            }
        }.build()

        return _SiSearchAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiSearchAlt: ImageVector? = null
