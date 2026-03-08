package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiPentagon: ImageVector
    get() {
        if (_SiPentagon != null) {
            return _SiPentagon!!
        }
        _SiPentagon = ImageVector.Builder(
            name = "Duotone.SiPentagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveToRelative(12f, 2f)
                lineToRelative(10f, 7.249f)
                lineTo(18.173f, 21f)
                horizontalLineTo(5.827f)
                lineTo(2f, 9.249f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(12f, 2f)
                lineToRelative(10f, 7.249f)
                lineTo(18.173f, 21f)
                horizontalLineTo(5.827f)
                lineTo(2f, 9.249f)
                close()
            }
        }.build()

        return _SiPentagon!!
    }

@Suppress("ObjectPropertyName")
private var _SiPentagon: ImageVector? = null
