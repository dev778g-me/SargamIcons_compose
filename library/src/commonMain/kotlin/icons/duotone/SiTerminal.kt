package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiTerminal: ImageVector
    get() {
        if (_SiTerminal != null) {
            return _SiTerminal!!
        }
        _SiTerminal = ImageVector.Builder(
            name = "Duotone.SiTerminal",
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
                moveToRelative(4f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
                moveToRelative(8f, 12f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _SiTerminal!!
    }

@Suppress("ObjectPropertyName")
private var _SiTerminal: ImageVector? = null
