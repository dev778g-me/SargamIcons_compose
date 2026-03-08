package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiPlay: ImageVector
    get() {
        if (_SiPlay != null) {
            return _SiPlay!!
        }
        _SiPlay = ImageVector.Builder(
            name = "Duotone.SiPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveToRelative(5f, 3f)
                lineToRelative(16f, 9f)
                lineToRelative(-16f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(5f, 3f)
                lineToRelative(16f, 9f)
                lineToRelative(-16f, 9f)
                close()
            }
        }.build()

        return _SiPlay!!
    }

@Suppress("ObjectPropertyName")
private var _SiPlay: ImageVector? = null
