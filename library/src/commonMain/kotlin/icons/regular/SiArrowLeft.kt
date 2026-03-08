package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiArrowLeft: ImageVector
    get() {
        if (_SiArrowLeft != null) {
            return _SiArrowLeft!!
        }
        _SiArrowLeft = ImageVector.Builder(
            name = "Regular.SiArrowLeft",
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
                moveToRelative(10f, 16f)
                lineToRelative(-4f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, -4f)
                moveToRelative(-4f, 4f)
                horizontalLineToRelative(12f)
            }
        }.build()

        return _SiArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _SiArrowLeft: ImageVector? = null
