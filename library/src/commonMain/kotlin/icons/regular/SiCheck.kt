package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiCheck: ImageVector
    get() {
        if (_SiCheck != null) {
            return _SiCheck!!
        }
        _SiCheck = ImageVector.Builder(
            name = "Regular.SiCheck",
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
                moveToRelative(5f, 13f)
                lineToRelative(5f, 5f)
                lineToRelative(9f, -11f)
            }
        }.build()

        return _SiCheck!!
    }

@Suppress("ObjectPropertyName")
private var _SiCheck: ImageVector? = null
