package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiDragHandle: ImageVector
    get() {
        if (_SiDragHandle != null) {
            return _SiDragHandle!!
        }
        _SiDragHandle = ImageVector.Builder(
            name = "Duotone.SiDragHandle",
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
                moveTo(4f, 10f)
                horizontalLineToRelative(16f)
                moveTo(4f, 14f)
                horizontalLineToRelative(16f)
            }
        }.build()

        return _SiDragHandle!!
    }

@Suppress("ObjectPropertyName")
private var _SiDragHandle: ImageVector? = null
