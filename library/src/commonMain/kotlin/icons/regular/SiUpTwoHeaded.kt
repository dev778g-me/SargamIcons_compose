package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiUpTwoHeaded: ImageVector
    get() {
        if (_SiUpTwoHeaded != null) {
            return _SiUpTwoHeaded!!
        }
        _SiUpTwoHeaded = ImageVector.Builder(
            name = "Regular.SiUpTwoHeaded",
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
                moveTo(12f, 20f)
                verticalLineTo(4f)
                moveToRelative(0f, 0f)
                lineTo(8f, 8f)
                moveToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                moveToRelative(-8f, 5f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
        }.build()

        return _SiUpTwoHeaded!!
    }

@Suppress("ObjectPropertyName")
private var _SiUpTwoHeaded: ImageVector? = null
