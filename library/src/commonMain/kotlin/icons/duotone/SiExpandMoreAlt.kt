package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiExpandMoreAlt: ImageVector
    get() {
        if (_SiExpandMoreAlt != null) {
            return _SiExpandMoreAlt!!
        }
        _SiExpandMoreAlt = ImageVector.Builder(
            name = "Duotone.SiExpandMoreAlt",
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
                moveToRelative(4f, 8f)
                lineToRelative(8f, 8f)
                lineToRelative(8f, -8f)
            }
        }.build()

        return _SiExpandMoreAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiExpandMoreAlt: ImageVector? = null
