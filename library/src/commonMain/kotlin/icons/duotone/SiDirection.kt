package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiDirection: ImageVector
    get() {
        if (_SiDirection != null) {
            return _SiDirection!!
        }
        _SiDirection = ImageVector.Builder(
            name = "Duotone.SiDirection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveToRelative(12f, 3f)
                lineToRelative(7f, 18f)
                lineToRelative(-7f, -4.093f)
                lineTo(5f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(12f, 3f)
                lineToRelative(7f, 18f)
                lineToRelative(-7f, -4.093f)
                lineTo(5f, 21f)
                close()
            }
        }.build()

        return _SiDirection!!
    }

@Suppress("ObjectPropertyName")
private var _SiDirection: ImageVector? = null
