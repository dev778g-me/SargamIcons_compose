package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiFlagAlt3: ImageVector
    get() {
        if (_SiFlagAlt3 != null) {
            return _SiFlagAlt3!!
        }
        _SiFlagAlt3 = ImageVector.Builder(
            name = "Regular.SiFlagAlt3",
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
                moveTo(8f, 14f)
                lineTo(19f, 3f)
                lineTo(4f, 4f)
                close()
                moveTo(8f, 14f)
                lineTo(11f, 22f)
            }
        }.build()

        return _SiFlagAlt3!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlagAlt3: ImageVector? = null
