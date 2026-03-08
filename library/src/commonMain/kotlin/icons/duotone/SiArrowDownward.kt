package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiArrowDownward: ImageVector
    get() {
        if (_SiArrowDownward != null) {
            return _SiArrowDownward!!
        }
        _SiArrowDownward = ImageVector.Builder(
            name = "Duotone.SiArrowDownward",
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
                moveToRelative(8f, 14f)
                lineToRelative(4f, 4f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, -4f)
                moveToRelative(-4f, 4f)
                verticalLineTo(6f)
            }
        }.build()

        return _SiArrowDownward!!
    }

@Suppress("ObjectPropertyName")
private var _SiArrowDownward: ImageVector? = null
