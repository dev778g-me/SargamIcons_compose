package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiFlag: ImageVector
    get() {
        if (_SiFlag != null) {
            return _SiFlag!!
        }
        _SiFlag = ImageVector.Builder(
            name = "Duotone.SiFlag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(21f, 10f)
                lineTo(4f, 4f)
                verticalLineToRelative(11f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 15f)
                lineTo(4f, 4f)
                lineToRelative(17f, 6f)
                close()
                moveTo(4f, 15f)
                verticalLineToRelative(5f)
            }
        }.build()

        return _SiFlag!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlag: ImageVector? = null
