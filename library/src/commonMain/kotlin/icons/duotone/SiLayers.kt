package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiLayers: ImageVector
    get() {
        if (_SiLayers != null) {
            return _SiLayers!!
        }
        _SiLayers = ImageVector.Builder(
            name = "Duotone.SiLayers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(12f, 3f)
                lineTo(3f, 8f)
                lineToRelative(9f, 5f)
                lineToRelative(9f, -5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(3f, 12f)
                lineToRelative(9f, 5f)
                lineToRelative(9f, -5f)
                moveTo(3f, 16f)
                lineToRelative(9f, 5f)
                lineToRelative(9f, -5f)
                moveTo(3f, 8f)
                lineToRelative(9f, -5f)
                lineToRelative(9f, 5f)
                lineToRelative(-9f, 5f)
                close()
            }
        }.build()

        return _SiLayers!!
    }

@Suppress("ObjectPropertyName")
private var _SiLayers: ImageVector? = null
