package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiRightTwoHeaded: ImageVector
    get() {
        if (_SiRightTwoHeaded != null) {
            return _SiRightTwoHeaded!!
        }
        _SiRightTwoHeaded = ImageVector.Builder(
            name = "Regular.SiRightTwoHeaded",
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
                moveToRelative(0f, 0f)
                lineToRelative(-4f, -4f)
                moveToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
                moveToRelative(-5f, -8f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
        }.build()

        return _SiRightTwoHeaded!!
    }

@Suppress("ObjectPropertyName")
private var _SiRightTwoHeaded: ImageVector? = null
