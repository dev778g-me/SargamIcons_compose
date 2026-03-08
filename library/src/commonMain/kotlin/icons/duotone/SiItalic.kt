package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiItalic: ImageVector
    get() {
        if (_SiItalic != null) {
            return _SiItalic!!
        }
        _SiItalic = ImageVector.Builder(
            name = "Duotone.SiItalic",
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
                moveTo(15f, 3f)
                lineTo(9f, 21f)
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(8f)
                moveTo(11f, 3f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _SiItalic!!
    }

@Suppress("ObjectPropertyName")
private var _SiItalic: ImageVector? = null
