package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiFlag: ImageVector
    get() {
        if (_SiFlag != null) {
            return _SiFlag!!
        }
        _SiFlag = ImageVector.Builder(
            name = "Regular.SiFlag",
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
