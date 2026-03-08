package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSouthEast: ImageVector
    get() {
        if (_SiSouthEast != null) {
            return _SiSouthEast!!
        }
        _SiSouthEast = ImageVector.Builder(
            name = "Regular.SiSouthEast",
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
                moveToRelative(8f, 8f)
                lineToRelative(8f, 8f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-5f)
                moveToRelative(0f, 5f)
                horizontalLineToRelative(-5f)
            }
        }.build()

        return _SiSouthEast!!
    }

@Suppress("ObjectPropertyName")
private var _SiSouthEast: ImageVector? = null
