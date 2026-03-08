package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiReorder: ImageVector
    get() {
        if (_SiReorder != null) {
            return _SiReorder!!
        }
        _SiReorder = ImageVector.Builder(
            name = "Duotone.SiReorder",
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
                moveTo(4f, 12f)
                horizontalLineToRelative(16f)
                moveTo(4f, 15f)
                horizontalLineToRelative(16f)
                moveTo(4f, 18f)
                horizontalLineToRelative(16f)
                moveTo(4f, 9f)
                horizontalLineToRelative(16f)
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
            }
        }.build()

        return _SiReorder!!
    }

@Suppress("ObjectPropertyName")
private var _SiReorder: ImageVector? = null
