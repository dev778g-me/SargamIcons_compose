package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiClearAll: ImageVector
    get() {
        if (_SiClearAll != null) {
            return _SiClearAll!!
        }
        _SiClearAll = ImageVector.Builder(
            name = "Regular.SiClearAll",
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
                moveTo(6f, 12f)
                horizontalLineToRelative(12f)
                moveTo(4f, 16f)
                horizontalLineToRelative(12f)
                moveTo(8f, 8f)
                horizontalLineToRelative(12f)
            }
        }.build()

        return _SiClearAll!!
    }

@Suppress("ObjectPropertyName")
private var _SiClearAll: ImageVector? = null
