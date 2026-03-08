package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiCheckAlt: ImageVector
    get() {
        if (_SiCheckAlt != null) {
            return _SiCheckAlt!!
        }
        _SiCheckAlt = ImageVector.Builder(
            name = "Duotone.SiCheckAlt",
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
                moveToRelative(5f, 14f)
                lineToRelative(6f, 6f)
                lineToRelative(8f, -15f)
            }
        }.build()

        return _SiCheckAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiCheckAlt: ImageVector? = null
