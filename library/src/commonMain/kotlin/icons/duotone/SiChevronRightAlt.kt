package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiChevronRightAlt: ImageVector
    get() {
        if (_SiChevronRightAlt != null) {
            return _SiChevronRightAlt!!
        }
        _SiChevronRightAlt = ImageVector.Builder(
            name = "Duotone.SiChevronRightAlt",
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
                moveToRelative(8f, 20f)
                lineToRelative(8f, -8f)
                lineToRelative(-8f, -8f)
            }
        }.build()

        return _SiChevronRightAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiChevronRightAlt: ImageVector? = null
