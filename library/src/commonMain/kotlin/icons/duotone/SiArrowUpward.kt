package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiArrowUpward: ImageVector
    get() {
        if (_SiArrowUpward != null) {
            return _SiArrowUpward!!
        }
        _SiArrowUpward = ImageVector.Builder(
            name = "Duotone.SiArrowUpward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveToRelative(8f, 10f)
                lineToRelative(4f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, 4f)
                moveToRelative(-4f, -4f)
                verticalLineToRelative(12f)
            }
        }.build()

        return _SiArrowUpward!!
    }

@Suppress("ObjectPropertyName")
private var _SiArrowUpward: ImageVector? = null
