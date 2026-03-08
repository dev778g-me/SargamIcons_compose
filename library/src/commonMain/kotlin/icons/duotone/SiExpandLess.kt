package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiExpandLess: ImageVector
    get() {
        if (_SiExpandLess != null) {
            return _SiExpandLess!!
        }
        _SiExpandLess = ImageVector.Builder(
            name = "Duotone.SiExpandLess",
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
                moveToRelative(8f, 14f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
        }.build()

        return _SiExpandLess!!
    }

@Suppress("ObjectPropertyName")
private var _SiExpandLess: ImageVector? = null
