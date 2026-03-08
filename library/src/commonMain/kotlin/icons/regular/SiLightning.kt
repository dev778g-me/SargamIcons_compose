package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiLightning: ImageVector
    get() {
        if (_SiLightning != null) {
            return _SiLightning!!
        }
        _SiLightning = ImageVector.Builder(
            name = "Regular.SiLightning",
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
                moveToRelative(12.667f, 10.5f)
                lineToRelative(1.25f, -7.5f)
                lineTo(6f, 13f)
                horizontalLineToRelative(5f)
                lineToRelative(-1.25f, 7.5f)
                lineToRelative(7.917f, -10f)
                close()
            }
        }.build()

        return _SiLightning!!
    }

@Suppress("ObjectPropertyName")
private var _SiLightning: ImageVector? = null
