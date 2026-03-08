package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiCodeMuted: ImageVector
    get() {
        if (_SiCodeMuted != null) {
            return _SiCodeMuted!!
        }
        _SiCodeMuted = ImageVector.Builder(
            name = "Duotone.SiCodeMuted",
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
                moveToRelative(9f, 8f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                moveToRelative(6f, 0f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
            }
        }.build()

        return _SiCodeMuted!!
    }

@Suppress("ObjectPropertyName")
private var _SiCodeMuted: ImageVector? = null
