package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiChevronLeft: ImageVector
    get() {
        if (_SiChevronLeft != null) {
            return _SiChevronLeft!!
        }
        _SiChevronLeft = ImageVector.Builder(
            name = "Regular.SiChevronLeft",
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
                moveToRelative(14f, 16f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
        }.build()

        return _SiChevronLeft!!
    }

@Suppress("ObjectPropertyName")
private var _SiChevronLeft: ImageVector? = null
