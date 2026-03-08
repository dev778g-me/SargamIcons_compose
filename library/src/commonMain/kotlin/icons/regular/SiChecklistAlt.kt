package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiChecklistAlt: ImageVector
    get() {
        if (_SiChecklistAlt != null) {
            return _SiChecklistAlt!!
        }
        _SiChecklistAlt = ImageVector.Builder(
            name = "Regular.SiChecklistAlt",
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
                moveToRelative(16f, 8f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
                moveTo(2f, 8f)
                horizontalLineToRelative(10f)
                moveToRelative(4f, 8f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
                moveTo(2f, 16f)
                horizontalLineToRelative(10f)
            }
        }.build()

        return _SiChecklistAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiChecklistAlt: ImageVector? = null
