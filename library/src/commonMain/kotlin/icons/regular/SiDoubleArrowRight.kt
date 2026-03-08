package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiDoubleArrowRight: ImageVector
    get() {
        if (_SiDoubleArrowRight != null) {
            return _SiDoubleArrowRight!!
        }
        _SiDoubleArrowRight = ImageVector.Builder(
            name = "Regular.SiDoubleArrowRight",
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
                moveToRelative(13f, 16f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                moveToRelative(-6f, 8f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
            }
        }.build()

        return _SiDoubleArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _SiDoubleArrowRight: ImageVector? = null
