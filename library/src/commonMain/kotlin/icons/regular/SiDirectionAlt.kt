package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiDirectionAlt: ImageVector
    get() {
        if (_SiDirectionAlt != null) {
            return _SiDirectionAlt!!
        }
        _SiDirectionAlt = ImageVector.Builder(
            name = "Regular.SiDirectionAlt",
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
                moveToRelative(3f, 3f)
                lineToRelative(18f, 7.92f)
                lineToRelative(-7.987f, 2.093f)
                lineTo(10.92f, 21f)
                close()
            }
        }.build()

        return _SiDirectionAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiDirectionAlt: ImageVector? = null
