package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAlignLeft: ImageVector
    get() {
        if (_SiAlignLeft != null) {
            return _SiAlignLeft!!
        }
        _SiAlignLeft = ImageVector.Builder(
            name = "Regular.SiAlignLeft",
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
                moveTo(3f, 10f)
                horizontalLineToRelative(12f)
                moveTo(3f, 6f)
                horizontalLineToRelative(18f)
                moveTo(3f, 14f)
                horizontalLineToRelative(18f)
                moveTo(3f, 18f)
                horizontalLineToRelative(12f)
            }
        }.build()

        return _SiAlignLeft!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignLeft: ImageVector? = null
